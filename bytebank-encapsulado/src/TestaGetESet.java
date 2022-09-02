
public class TestaGetESet {
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta(1111,1212212,new Cliente());
		System.out.println(contaDoJoao.getNumero());
		System.out.println(contaDoJoao.getAgencia());
		
		contaDoJoao.getTitular().setNome("Joao");
		System.out.println(contaDoJoao.getTitular().getNome());
		
		contaDoJoao.deposita(600);
		System.out.println(contaDoJoao.getSaldo());
		
		contaDoJoao.setAgencia(5681);
		System.out.println(contaDoJoao.getAgencia());
		
		
		Conta conta1 = new Conta(5555,030303030, new Cliente());
		
	}
}
