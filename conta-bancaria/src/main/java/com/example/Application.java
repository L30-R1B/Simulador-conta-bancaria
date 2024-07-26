package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.example.utils.Conta;

public class Application 
{
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        Conta conta = new Conta("corrente", "Leonardo", "23/08/2003", 100.00);

        conta.print();

        conta.sacar(150.00);  

        conta.print();
    }
}
