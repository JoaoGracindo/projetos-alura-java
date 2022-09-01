
public class TestaValores {
	public static void main(String[] args) {
		int idade = 15;
		boolean acompanhado = true;
		
		if (idade >= 18) {
			System.out.println("voce tem pelo menos 18!");
		} else { 
			if(acompanhado) {
				System.out.println("pode entrar pois esta acompanhado");
			} else {
				System.out.println("voce e menor de idade");
			}
		}
	}
}
