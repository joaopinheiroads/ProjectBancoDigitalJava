package main;

import tiposcontas.Conta;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void mostrarClientes(String nomeCliente) {
        System.out.println("=== Clientes Conta Corrente ===");
        System.out.println("Cliente: " + nomeCliente);
    }

    @Override
    public void limiteSaque(double valor) {
        if (valor > saldo) {
            System.out.println("Limite de saque excedido.");
            return;
        }
        saldo -= valor;
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