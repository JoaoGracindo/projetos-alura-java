
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 15;
		int quantidadeDePessoas = 3;
		boolean acompanhado;
		
		if(quantidadeDePessoas >= 2) {
			//se declarar dentro, ela so existira nesse escopo do if
			acompanhado = true;
		}else {
			//mas pode ser inicializada fora e receber valor dentro
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("voce pode entrar");
		} else { 
				System.out.println("voce não pode entrar");
		}
	}
}
