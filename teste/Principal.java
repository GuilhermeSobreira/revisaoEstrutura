package teste;

public class Principal {
	public static void main(String[] args) {
		
		RegraNegocioFuncionario func = new RegraNegocioFuncionario();
		Funcionario f1 = new Funcionario("123.546.789-01", "Abel", "1475289-1", "88 98798-9988");
		Funcionario f2 = new Funcionario("987.654.321-02", "Ariana", "7418529-", "22 98745-6321");
		Funcionario f3 = new Funcionario("456.987.123-03", "Bruno", "74896541-2", "54 98743-2102");
		
		func.cadastrarFuncionario(f1);
		func.cadastrarFuncionario(f2);
		func.cadastrarFuncionario(f3);
		
		RegraNegocioEmpresa empre = new RegraNegocioEmpresa();
		Empresa e1 = new Empresa("1478523/0001", "MusicLand", "88 98888-9999");
		Empresa e2 = new Empresa("3659874/0002", "Sound", "11 97755-4444");
		Empresa e3 = new Empresa("6598654/0003", "MusicaBoa", "82 98282-2828");
		
		empre.cadastrarEmpresa(e1);
		empre.cadastrarEmpresa(e2);
		empre.cadastrarEmpresa(e3);
		
		System.out.println("Lista de funcionários: ");
		func.listarFuncionario();
		
		System.out.println("\nLista de empresas: ");
		empre.listarEmpresa();
	}

}
