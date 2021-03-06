package com.example.practic;

import com.example.practic.entity.Client;
import com.example.practic.models.AuthModel;
import com.example.practic.models.RegAnswerModel;
import com.example.practic.models.RegAnswerModelBuilder;
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

/*    AuthModel authModel_FullTrue = new AuthModel("email", "clpassword");
    RegModel regModel_FullTrue = new RegModel( "family", "name",  "patronymic",  "email",  "phone",  "clpassword");
    AuthModel authModel_FullFail = new AuthModel("_email", "_clpassword");
    RegModel regModel_FullFail = new RegModel( "_family", "_name",  "_patronymic",  "_email",  "_phone",  "_clpassword");
    RegModel regModel_NotFulFail = new RegModel( "_family", null,  null,  "_email",  "_phone",  "_clpassword");
    */
    AuthModel authModel_FullTrue = new AuthModel("email", "clpassword");
    RegModel regModel_FullTrue = new RegModel().withFamily("family").withName("name").withPatronymic("patronymic").withEmail("email").withPhone("phone").withPassword("clpassword").build();
    AuthModel authModel_FullFail = new AuthModel("_email", "_clpassword");

    RegModel regModel_FullFail = new RegModel().withFamily("_family").withName("_name").withPatronymic("_patronymic").withEmail("_email").withPhone("_phone").withPassword("_clpassword").build();
    RegModel regModel_NotFulFail = new RegModel().withFamily("family").withEmail("email").withPhone("phone").withPassword("clpassword").build();

    Client clientTrue = new Client(regModel_FullTrue);
    Client clientFail = new Client(regModel_FullFail);

    @Test
    void authTest_FullTrue() { // +
        Mockito.doReturn (clientTrue)
                .when(clientRepository)
                .getClientByEmailAndPassword(clientTrue.getEmail(), clientTrue.getPassword());

        assertTrue(clientService.loginUser(authModel_FullTrue));

        verify(clientRepository).getClientByEmailAndPassword(clientTrue.getEmail(), clientTrue.getPassword());
    }
    @Test
    void authTest_FullFail(){ // ???

        assertFalse(clientService.loginUser(authModel_FullFail));

        // verify(clientRepository).getClientByEmailAndClpassword(clientFail.getEmail(), clientFail.getClpassword());
    }

    @Test
    void registerTest_FullTrue()  {
        RegAnswerModelBuilder regAnswerModel = clientService.registerUser(regModel_FullTrue);
        assertTrue(regAnswerModel.getRegComplete());
        Mockito.verify(clientRepository, Mockito.times(1)).save(any());
    }
    @Test
    void registerTest_Fail_UserIsExist() { // +
        Mockito.doReturn (clientTrue)
                .when(clientRepository)
                .getClientByEmail(clientTrue.getEmail());

        RegAnswerModelBuilder regAnswerModel = clientService.registerUser(regModel_FullTrue);
        assertFalse(regAnswerModel.getUserIsNotExist());
        assertFalse(regAnswerModel.getRegComplete());
        Mockito.verify(clientRepository, Mockito.times(0)).save(any());
    }
    @Test
    void registerTest_Fail_NotFilledFields()  { // +
        RegAnswerModelBuilder regAnswerModel = clientService.registerUser(regModel_NotFulFail);
        assertFalse(regAnswerModel.AllFielldFilled());
        assertFalse(regAnswerModel.getRegComplete());
        Mockito.verify(clientRepository, Mockito.times(0)).save(any());
    }
}
