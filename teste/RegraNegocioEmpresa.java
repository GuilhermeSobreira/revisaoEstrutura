package teste;

import java.util.ArrayList;

public class RegraNegocioEmpresa {
	
	private ArrayList<Empresa> empre;
	
	public RegraNegocioEmpresa() {
		this.empre = new ArrayList<>();
	}
	
	public void cadastrarEmpresa(Empresa empresa) {
		empre.add(empresa);
	}

	public void listarEmpresa() {
        for (Empresa empresa : empre) {
            System.out.println(empresa);
        }

	}
}