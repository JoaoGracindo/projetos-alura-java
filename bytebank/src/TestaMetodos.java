
public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		Conta contaDaAna = new Conta();
		
		contaDaAna.saldo = 650;
		contaDoJoao.saldo = 300;
		
		contaDoJoao.deposita(200);
		
		contaDoJoao.saca(300);
		
		contaDoJoao.transfere(150, contaDaAna);
	}
}
