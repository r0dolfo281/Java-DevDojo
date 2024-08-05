package javacore.C_sobrecargametodos.test;

import javacore.C_sobrecargametodos.dominio.Aviao;

public class AviaoTest {

	public static void main(String[] args) {
		Aviao av1 = new Aviao();
		av1.init("C-390 Millenium", "Militar", 543.78, 179000);
		//av1.init(null, null, 0);
		//av1.init(null, null, 0, 0);
		av1.info();
		
	}

}
