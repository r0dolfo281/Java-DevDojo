package javacore.L_classesabstratas.dominio;

public class Gerente extends Funcionario {

	public Gerente(String name, double salary) {
		super(name, salary);
	}
	@Override
	public String toString() {
		return "Gerente: " + name + "\n" +
				"Salário: R$" + salary + "\n";
	}
	@Override
	public void bonusCalculation() {
		this.salary = this.salary + this.salary * 0.2;
	}
	
	
}
