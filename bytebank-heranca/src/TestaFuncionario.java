
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Editor();
		f1.setSalario(2500);
		System.out.println(f1.getBonificacao());
		
		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		System.out.println(g1.autentica(2323));
		
		System.out.println(g1.getBonificacao());
		

	}

}
