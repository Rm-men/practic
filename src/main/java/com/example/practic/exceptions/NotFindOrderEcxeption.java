package com.example.practic.exceptions;

public class NotFindOrderEcxeption extends Exception{
    private int id;
    public int getId(){return id;}
    public NotFindOrderEcxeption(int id){
        super("Не найден заказ с id = "+ id);
        this.id =id;
    }
}
