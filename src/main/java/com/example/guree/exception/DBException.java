package com.example.guree.exception;

public class DBException extends RuntimeException{
    public DBException(){
        super("@Transaction은 기본적으로 RuntimeException 예외가 발생 시 RollBack처리");
    }
}
