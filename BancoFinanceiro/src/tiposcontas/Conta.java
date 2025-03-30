package tiposcontas;

import tiposcontas.Conta;
import tiposcontas.ContaCorrente;
import tiposcontas.ContaPoupanca;
import tiposcontas.IConta;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void mostrarClientes(String nomeCliente) {
        System.out.println("Cliente: " + nomeCliente);
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public boolean isContaAtiva() {
        return this.saldo > 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Agência: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}