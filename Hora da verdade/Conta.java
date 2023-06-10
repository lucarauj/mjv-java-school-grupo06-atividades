public class Conta {

    double saldoConta;
    String numero;
    String nomeCliente;
    String agencia;
    Date dataNascimento = new Date();

    public double consultarSaldoAtual() {

        return saldoConta;
    }

    public void sacar(int valor) {

        saldoConta = saldoConta - valor;

    }
	
	 
    public void cancelar(){
		
        System.out.println("Conta cancelada");
		
    }
    
    public void transferirValor(String numeroConta, double valor){
        System.out.println("A conta " + numeroConta + " recebeu uma transferência do valor " + valor)

    } 
	
    public String consultarExtratoEntreDatas(Date dataInicio, Date dataFim){
      return "O extrato é %EXTRATO%";
    }
	
}
