package tiposcontas;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

    void mostrarClientes(String nomeCliente);

    void limiteSaque(double valor);

    double consultarSaldo();

    boolean isContaAtiva();
}