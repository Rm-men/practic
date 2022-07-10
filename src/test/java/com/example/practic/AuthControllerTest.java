package com.example.practic;

import com.example.practic.entity.Client;
import com.example.practic.models.AuthModel;
import com.example.practic.models.RegAnswerModel;
import com.example.practic.models.RegModel;
import com.example.practic.repository.ClientRepository;
import com.example.practic.services.ClientService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class AuthControllerTest {

    @InjectMocks
    private ClientService clientService;
    @Mock
    private ClientRepository clientRepository;

    AuthModel authModel_FullTrue = new AuthModel("email", "clpassword");
    RegModel regModel_FullTrue = new RegModel( "family", "name",  "patronymic",  "email",  "phone",  "clpassword");
    AuthModel authModel_FullFail = new AuthModel("_email", "_clpassword");
    RegModel regModel_FullFail = new RegModel( "_family", "_name",  "_patronymic",  "_email",  "_phone",  "_clpassword");
    RegModel regModel_NotFulFail = new RegModel( "_family", null,  null,  "_email",  "_phone",  "_clpassword");

    Client clientTrue = new Client(regModel_FullTrue);
    Client clientFail = new Client(regModel_FullFail);

    @Test
    void authTest_FullTrue() { // +
        Mockito.doReturn (clientTrue)
                .when(clientRepository)
                .getClientByEmailAndClpassword(clientTrue.getEmail(), clientTrue.getClpassword());

        assertTrue(clientService.LoginUser(authModel_FullTrue));

        verify(clientRepository).getClientByEmailAndClpassword(clientTrue.getEmail(), clientTrue.getClpassword());
    }
    @Test
    void authTest_FullFail(){ // ???

        assertFalse(clientService.LoginUser(authModel_FullFail));

        // verify(clientRepository).getClientByEmailAndClpassword(clientFail.getEmail(), clientFail.getClpassword());
    }

    @Test
    void registerTest_FullTrue() throws IllegalAccessException {
        RegAnswerModel regAnswerModel = clientService.RegisterUser(regModel_FullTrue);
        assertTrue(regAnswerModel.getRegComplete());
        Mockito.verify(clientRepository, Mockito.times(1)).save(any());
    }

    @Test
    void registerTest_Fail_UserIsExist() throws IllegalAccessException { // +
        Mockito.doReturn (clientTrue)
                .when(clientRepository)
                .getClientByEmail(clientTrue.getEmail());

        RegAnswerModel regAnswerModel = clientService.RegisterUser(regModel_FullTrue);
        assertFalse(regAnswerModel.getUserIsNotExist());
        assertFalse(regAnswerModel.getRegComplete());
        Mockito.verify(clientRepository, Mockito.times(0)).save(any());
    }
    @Test
    void registerTest_Fail_NotFilledFields() throws IllegalAccessException { // +
        RegAnswerModel regAnswerModel = clientService.RegisterUser(regModel_NotFulFail);
        assertFalse(regAnswerModel.AllFielldFilled());
        assertFalse(regAnswerModel.getRegComplete());
        Mockito.verify(clientRepository, Mockito.times(0)).save(any());
    }
}
