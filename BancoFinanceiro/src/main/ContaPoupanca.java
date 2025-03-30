package main;

import tiposcontas.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void mostrarClientes(String nomeCliente) {
        System.out.println("=== Clientes Conta Poupança ===");
        System.out.println("Cliente: " + nomeCliente);
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }

    @Override
    public boolean isContaAtiva() {
        return super.isContaAtiva();
    }
}