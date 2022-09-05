
public class TestaReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		
		Editor e1 = new Editor();
		e1.setSalario(2500);
		
		Designer d1 = new Designer();
		d1.setSalario(2000);
		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.registra(d1);
		controle.registra(e1);
		controle.registra(g1);
		
		System.out.println(controle.getSoma());

	}

}
