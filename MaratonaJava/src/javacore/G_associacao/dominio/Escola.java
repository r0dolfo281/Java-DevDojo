package javacore.G_associacao.dominio;

public class Escola {
	private String name;
	private Professor[] professores;
	
	
	public Escola(String name) {
		this.name = name;
	}
	
	public Escola(String name, Professor[] professores) {
		this.name = name;
		this.professores = professores;
	}



	public void printInfo() {
		System.out.printf("Escola: %s%n", this.name);
		if(professores != null) {
			for (Professor professor : professores) {
				System.out.printf("Professor: %s%n", professor.getName());
			}
		}else {
			return;
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Professor[] getProfessores() {
		return professores;
	}
	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	
	
	
}
