
public class TestaCliente {
	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.titular = new Cliente();
		
		contaDoJoao.titular.nome = "Joao";
		contaDoJoao.titular.cpf = "565.552.336-01";
		contaDoJoao.titular.profissao = "WebDev";
		
	}
}
