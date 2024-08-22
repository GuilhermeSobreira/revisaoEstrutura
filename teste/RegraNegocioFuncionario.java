package teste;

import java.util.ArrayList;

public class RegraNegocioFuncionario {
	
	private ArrayList<Funcionario> funci;
	
	public RegraNegocioFuncionario() {
		this.funci = new ArrayList<>();
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) {
	funci.add(funcionario);
	}
	
	public void listarFuncionario() {
        for (Funcionario funcionario : funci) {
            System.out.println(funcionario);
        }
	}
}