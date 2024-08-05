package javacore.B_introducaometodos.test;
import javacore.B_introducaometodos.dominio.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("José");
		funcionario.setIdade(43);
		funcionario.setSalarios(new double [] {10630, 11857, 14652});
		funcionario.imprime();
		System.out.printf("%nMédia(get): %.2f", funcionario.getMedia());
		funcionario.setMedia(10000);
		System.out.printf("%nMédia(depois set): %.2f", funcionario.getMedia());
	}
}
