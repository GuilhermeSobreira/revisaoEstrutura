package revisao;

import java.util.ArrayList;

public class Cadastro {
	public static void main(String[] args) {
		
			ArrayList<Funcionario> funcionarios= new ArrayList();
			
			Funcionario fun1= new Funcionario("147.147.159-01", "Ada Nunes", "12.345.698", "82 98745-9632", "BrisaMar");
			
			Funcionario fun2= new Funcionario("874.635.741-41"," Uriel","87.741.984","87 987159-9874", "aMarte");
			
		funcionarios.add(fun1);
		funcionarios.add(fun2);
		ArrayList<Empresa> empresas= new ArrayList();
		Empresa emp1= new Empresa("7412854/0003","BrisaMar","82 99874-8745");
		Empresa emp2= new Empresa("7412854/0003","aMarte","82 99856-8745");
		empresas.add(emp1);
		empresas.add(emp2);
        

	}
}