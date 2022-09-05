
public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int tentativa) {
		if (this.senha == tentativa) {
			return true;
		}else {
			return false;
		}
	}
}
