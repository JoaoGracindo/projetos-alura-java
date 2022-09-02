public class Conta{
	
	int agencia;
	double saldo;
	int numero;
	Cliente titular;
	
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