
public class ControleDeBonificacao {
	
	private double total;
	
	public void registra(Funcionario f) {
		total += f.getBonificacao();
	}
	
	public double getSoma() {
		return total;
	}

}
