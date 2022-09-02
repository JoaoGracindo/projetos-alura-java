public class Conta{
	
	private int agencia;
	private double saldo;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia,int numero, Cliente titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		total++;
		System.out.println("estou criando uma conta. E o total de contas é " + total);
	}
	
	public static int getTotal() {
		return total;
	}
	
	public double getSaldo() {
		return this.saldo;
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

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println(saldo);
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("o novo saldo é " + this.saldo);
			return true;
		}
		
		System.out.println("não deu certo");
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.saldo += valor;
			System.out.println("tudo certo. Seu saldo agora é " + this.saldo);
			System.out.println("conta destino tem saldo agora de " + destino.saldo);
			return true;
		}
		
		System.out.println("não deu certo");
		return false;
		
		
	}
	
}