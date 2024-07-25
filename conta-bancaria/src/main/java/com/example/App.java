package com.example;

import com.example.utils.Conta;

public class App 
{
    public static void main( String[] args )
    {
        Conta conta = new Conta("corrente", "Leonardo", "23/08/2003", 1728.80);
        conta.print();

    }
}
