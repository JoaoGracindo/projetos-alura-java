
public class TestaSomatorio {
	public static void main(String[] args) {
		int contador = 1;
		int somatorio = 0;
		
		while(contador <= 1000) {
			somatorio += contador;
			contador++;
		}
		
		System.out.println(somatorio);
	}
}
