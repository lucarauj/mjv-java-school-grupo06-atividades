public class Conta {

    double saldoConta;
    String numero;
    String nomeCliente;
    String agencia;

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
	
}