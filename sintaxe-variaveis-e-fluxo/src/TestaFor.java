
public class TestaFor {
	public static void main(String[] args) {
		int somatorio = 0;
		for(int contador = 1;contador <= 5632; contador++) {
			somatorio += contador;
		}
		
		System.out.println(somatorio);
	}
}
