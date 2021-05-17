package com.company;

public class NumberException extends Exception{
    public NumberException () {
        super("Индекс не соответсвует кол-ву элементов списка");
    }
}
