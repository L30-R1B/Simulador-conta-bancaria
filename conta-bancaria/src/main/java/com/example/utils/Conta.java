package com.example.utils;

public class Conta {
    String tipoConta = "1";
    String tipoCliente = "1";
    String dataAbertura = "1";
    double saldo = 0.00;

    public void setSaldo(double novoSaldo){
        saldo = novoSaldo;
    }
    public void setTipoConta(String tipoConta){
        tipoConta = tipoConta;
    }
    public void setTipoCliente(String tipoCliente){
        tipoCliente = tipoCliente;
    }
    public void setDataAbertura(String dataAbertura){
        dataAbertura = dataAbertura;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTipoConta(){
        return tipoConta;
    }
    public String getTipoCliente(){
        return tipoCliente;
    }
    public String getDataAbertura(){
        return dataAbertura;
    }

    public void print(){
        System.out.println("Tipo de conta : "+ tipoConta);
        System.out.println("Tipo de cliente : " + tipoCliente);
        System.out.println("Data de abertura : " + dataAbertura);
        System.out.println("Saldo" + saldo);
    }
}
