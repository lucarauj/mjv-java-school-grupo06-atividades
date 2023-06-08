public class Conta {

    double saldoConta;
    String numero;
	String nomeCliente;

    public double consultarSaldoAtual() {

        return saldoConta;
    }

    public void sacar(int valor) {

        saldoConta = saldoConta - valor;

    }
	
	 
    public void cancelar(){
		
        System.out.println("Conta cancelada");
		
    }
	
}