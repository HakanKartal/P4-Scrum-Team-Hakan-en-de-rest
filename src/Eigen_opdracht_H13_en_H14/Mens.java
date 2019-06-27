package Eigen_opdracht_H13_en_H14;

//implementeerd de ''falvor'' zombie, dit betekend dat deze klasse ook de methodes in zombie.java moet hebben.

public class Mens extends Zoogdier implements Zombie {
	
	
	
	public void communiceren() {
		System.out.println("Hallo, wereld! ik ben een mens.");
	}
	
	public void spraakgebrek() {
		System.out.println("Graagh");
	}
	
	public void levensgebied() {
		System.out.println("land");
	}
	

}
