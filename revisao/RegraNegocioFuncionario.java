package revisao;

import java.util.ArrayList;

import vetor03.Funcionario;

public class RegraNegocioFuncionario {
	
	private ArrayList<Funcionario> fun;

	public RegraNegocioFuncionario() {
		this.fun = new ArrayList<>();
	}
	
	public ArrayList<Funcionario> listarFun() {
		return fun;
	}
}