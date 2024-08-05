package javacore.N_polimorfismo.test;

import javacore.N_polimorfismo.repositorio.Repository;
import javacore.N_polimorfismo.servico.DataBAseRepository;
import javacore.N_polimorfismo.servico.FileRepository;
import javacore.N_polimorfismo.servico.MemoryRepository;

public class RepositoryTest {
	public static void main(String[] args) {
		Repository repository01 = new DataBAseRepository();
		repository01.save();
		Repository repository02 = new FileRepository();
		repository02.save();
		Repository repository03 = new MemoryRepository();
		repository03.save();

	}
}
