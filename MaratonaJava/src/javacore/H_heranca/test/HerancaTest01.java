package javacore.H_heranca.test;
import javacore.H_heranca.dominio.Endereco;
import javacore.H_heranca.dominio.Funcionario;
import javacore.H_heranca.dominio.Pessoa;

public class HerancaTest01 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua das Oliveiras");
		endereco.setCep("99852-000");
		Pessoa pessoa = new Pessoa("Afonso");
		
		pessoa.setCpf("123.456-78");
		pessoa.setEndereco(endereco);
		pessoa.info();
		
		System.out.println("----------------------------");
		
		Funcionario funcionario = new Funcionario("Goku");
		Endereco endereco02 = new Endereco();
		endereco02.setRua("Rua 10");
		endereco02.setCep("99880-020");
		funcionario.setCpf("987.654-32");
		funcionario.setEndereco(endereco02);
		funcionario.setSalario(12546);
		funcionario.info();
		

	}

}
