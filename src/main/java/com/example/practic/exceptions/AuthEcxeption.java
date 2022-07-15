package com.example.practic.exceptions;

public class AuthEcxeption extends Exception{
    private int number;
    public int getNumber(){return number;}
    public AuthEcxeption(String message, int num){
        super(message);
        number=num;
    }
}
