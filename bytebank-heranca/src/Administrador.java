
public class Administrador extends Funcionario implements Autenticavel{
	
	private int senha;

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario()*2;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
	
	
	
}
