package javacore.B_introducaometodos.test;
import javacore.B_introducaometodos.dominio.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setName("João");
		System.out.printf("Nome(get): %s%n", pessoa.getName());
		pessoa.setAge(35);
		System.out.printf("Idade(get): %d%n", pessoa.getAge());
		pessoa.imprimePessoa();

	}

}
