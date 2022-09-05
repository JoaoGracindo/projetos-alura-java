
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cc.deposita(200);
		cp.deposita(150);
		
		cc.transfere(100, cp);
		cc.saca(20);
		
		System.out.println("cc:" + cc.getSaldo());
		System.out.println("cp:" + cp.getSaldo());

	}

}
