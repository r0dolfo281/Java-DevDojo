package javacore.N_polimorfismo.servico;

import javacore.N_polimorfismo.repositorio.Repository;

public class MemoryRepository implements Repository {

	@Override
	public void save() {
		System.out.printf("Saving in memory%n");
	}

}
