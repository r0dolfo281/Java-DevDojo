package javacore.C_sobrecargametodos.dominio;

public class Aviao {
	private String type;
	private double speed;
	private String name;
	private double mtow;
	

	public void init(String name, String type, double speed) {
		this.name = name;
		this.type = type;
		this.speed = speed;
		
	}
	
	public void init(String name, String type, double speed, double mtow) {
		this.init(name, type, speed);
		this.mtow = mtow;
		
	}
	
	public void info() {
		System.out.printf("Nome: %s%n",this.name);
		System.out.printf("Tipo: %s%n",this.type);
		System.out.printf("Velocidade: %.2f kt%n",this.speed);
		System.out.printf("Peso Máximo de Decolagem: %.1f lbs",this.mtow);
	}
	
	
	
	public double getMTOW() {
		return mtow;
	}

	public void setMTOW(double mtow) {
		this.mtow = mtow;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
}
