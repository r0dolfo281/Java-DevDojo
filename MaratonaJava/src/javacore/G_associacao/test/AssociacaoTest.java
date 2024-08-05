package javacore.G_associacao.test;
import javacore.G_associacao.dominio.Aluno;
import javacore.G_associacao.dominio.Local;
import javacore.G_associacao.dominio.Professor;
import javacore.G_associacao.dominio.Seminario;

public class AssociacaoTest {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno("Afonso", 30);
		Aluno[] alunosSeminario = {aluno};
		Professor professor = new Professor("Mestre Kame", "Lógica em Programação");
		Local local = new Local("Rua das Oliveiras, 1234");
		Seminario seminario = new Seminario("Introdução à Programação", alunosSeminario, local);
		Seminario[] professorSeminario = {seminario};
		professor.setSeminarios(professorSeminario);
		professor.relatorio();

	}

}
