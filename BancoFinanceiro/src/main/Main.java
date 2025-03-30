package main;

import tiposcontas.ContaCorrente;
import tiposcontas.ContaPoupanca;
import tiposcontas.IConta;

public class Main {
    public static void main(String[] args) {

        IConta cc = new ContaCorrente();
        cc.depositar(500);

        IConta poupanca = new ContaPoupanca();
        cc.transferir(100, poupanca);
        poupanca.depositar(1000);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.mostrarClientes("João");
        poupanca.mostrarClientes("Maria");

        System.out.println("Saldo Conta Corrente: " + cc.consultarSaldo());
        System.out.println("Conta Corrente Ativa: " + cc.isContaAtiva());

        System.out.println("Saldo Conta Poupança: " + poupanca.consultarSaldo());
        System.out.println("Conta Poupança Ativa: " + poupanca.isContaAtiva());
    }
}
