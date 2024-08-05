package javacore.G_associacao.dominio;

public class Seminario {
	private String titulo;
	private static Aluno [] alunos;
	private Local local;

	public Seminario(String titulo, Aluno [] alunos, Local local) {
		this.titulo = titulo;
		Seminario.alunos = alunos;
		
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		Seminario.alunos = alunos;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	
	
	
	
}
