package javacore.N_polimorfismo.servico;

import javacore.N_polimorfismo.repositorio.Repository;

public class DataBAseRepository implements Repository {

	@Override
	public void save() {
		System.out.printf("Saving in the database%n");
	}
	
}
