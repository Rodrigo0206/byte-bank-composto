
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profiss?o = "prgramador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
	
	}

}
