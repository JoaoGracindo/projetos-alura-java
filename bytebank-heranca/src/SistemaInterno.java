
public class SistemaInterno {
	private int senha = 222;
	public void autentica(Autenticavel g) {
		boolean autenticou = g.autentica(this.senha) ;
		if(autenticou) {
			System.out.println("pde entrar");
		}else {
			System.out.println("não pode entrar");
		}
	}
	
	
}
