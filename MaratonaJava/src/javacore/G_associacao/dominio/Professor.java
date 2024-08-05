package javacore.G_associacao.dominio;

public class Professor {
	private String name;
	private String especialidade;
	private Seminario [] seminarios;

	public Professor(String name, String especialidade) {
		super();
		this.name = name;
		this.especialidade = especialidade;
		
	}
	
	public void relatorio() {
		for (Aluno aluno : Seminario.getAlunos()) {
			System.out.printf("Alunos: %s%n", aluno.getNome());
		}
		System.out.printf("Professor: %s.%n", this.name);
		if(this.seminarios != null) {
			for (Seminario seminario : seminarios) {
				System.out.printf("Seminários: %s.%n", seminario.getTitulo());
				System.out.printf("Local: %s.%n", seminario.getLocal().getEndereco());
			}

		}else {
			return;
		}
	}
		
		
	
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	
	
	
	
}


