
public class TestaLacos {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
				System.out.print(multiplicador*i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
