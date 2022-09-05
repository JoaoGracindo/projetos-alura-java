
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		
		
		Clente c = new Clente();
		c.setSenha(222);
		
		Administrador a = new Administrador();
		a.setSenha(111);
		
		si.autentica(a);
		si.autentica(c);
	}

}
