
public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
		
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
}
