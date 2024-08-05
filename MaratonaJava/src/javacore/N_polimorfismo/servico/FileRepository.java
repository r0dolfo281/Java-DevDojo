package javacore.N_polimorfismo.servico;

import javacore.N_polimorfismo.repositorio.Repository;

public class FileRepository implements Repository{

	@Override
	public void save() {
		System.out.printf("Saving in a file%n");
	}
	
}
