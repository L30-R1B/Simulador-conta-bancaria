package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import com.example.utils.Conta;

@Aspect
@Component
public class ContaAspect {

    @Before("execution(* com.example.utils.Conta.sacar(..)) && args(valor)")
    public void beforeSacar(JoinPoint joinPoint, double valor) {
        // Recupera a conta que está sendo acessada
        Conta conta = (Conta) joinPoint.getTarget();
        System.out.println("Tentativa de saque de: " + valor);
        if (conta.getSaldo() < valor) {
            System.out.println("Aviso: Saldo insuficiente para realizar o saque de " + valor);
        }
    }
}
