public class Conta {

    double saldo;
    String numero;
    String nomeCliente;
    String agencia;
    Date dataNascimento;

    public double consultarSaldoAtual() {
        return saldo;
    }

    public void sacar(int valor) {
        saldo = saldo - valor;
    }

    public void depositar(int valor) {
        saldo = saldo + valor;
    }
	 
    public void cancelar(){	
        System.out.println("Conta cancelada");	
    }
    
    public void transferirValor(String numeroConta, double valor){
        System.out.println("A conta " + numeroConta + " recebeu uma transferência do valor " + valor);
    } 
	
    public String consultarExtratoEntreDatas(Date dataInicio, Date dataFim){
      return "O extrato é %EXTRATO%.";
    }	
}
