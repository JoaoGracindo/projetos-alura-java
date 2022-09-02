
public class Testalacos2 {
	public static void main(String[] args) {
		
		int numeroProcurado = 7;
		boolean achou = false;
		
		
		for(int i = 1; i <= 10; i++) {
			for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
				if(multiplicador*i == numeroProcurado) {
					System.out.println("esta presente na tabuada do " + i + " com " + multiplicador);
					achou = true;
					break;
				}
				if(achou) {break;}
				
				System.out.println(multiplicador*i);
			}
		}
		
		if(!achou) {
			System.out.println("não achei");
		}
	}
}
