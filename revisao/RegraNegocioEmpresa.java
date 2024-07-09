package revisao;

import java.util.ArrayList;

public class RegraNegocioEmpresa {
	
	private ArrayList<Empresa> emp;

    public RegraNegocioEmpresa() {
        this.emp = new ArrayList<>();
    }

    public void cadastrarEmpresa(Empresa empresa) {
        emp.add(empresa);
    }

    public ArrayList<Empresa> listarEmp() {
        return emp;
    }
}