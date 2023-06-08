public class Conta {

    double saldoConta;
    String numero;

    public double consultarSaldoAtual() {

        return saldoConta;
    }

    public void sacar(int valor) {

        saldoConta = saldoConta - valor;

    }
}