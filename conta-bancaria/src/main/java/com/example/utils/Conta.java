package com.example.utils;

public class Conta {
    String tipoConta = "1";
    String tipoCliente = "1";
    String dataAbertura = "1";
    double saldo = 0.00;

    public Conta(String tipoConta, String tipoCliente, String dataAbertura, double saldo) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    public void setTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }
    public void setDataAbertura(String dataAbertura){
        this.dataAbertura = dataAbertura;
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
        System.out.println("Saldo : " + saldo);
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}

