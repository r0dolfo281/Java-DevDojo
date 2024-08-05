package javacore.B_introducaometodos.dominio;

public class Pessoa {
	private String name;
	private int age;
	
//-----------------------------------------------	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

////////////////////////////////////////////////////////
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.printf("Idade inválida.%n");
			return;
		}else {
			this.age = age;
		}
	}

//-----------------------------------------------

	public void imprimePessoa() {
		System.out.printf("Nome: %s%n",this.name);
		System.out.printf("Idade: %d",this.age);
		
	}
}


