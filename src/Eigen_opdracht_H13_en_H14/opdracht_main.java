package Eigen_opdracht_H13_en_H14;

public class opdracht_main {
	
	public static void main(String a[]) {
		//Instancieren van een nieuw object kan niet met een abstracte klasse, maar wel met een klasse die hem extend.
		Zoogdier beer = new Beer();
		Zoogdier koe = new Koe();
		Zoogdier mens = new Mens();
		//object gebaseerd op interface Zombie.java, implementeerd in mens.java
		Zombie zombie = new Mens();
		Zoogdier walvis = new Walvis();
		
		//Aanroepen van methodes
		
		beer.communiceren();
		beer.levensgebied();
		System.out.print("\n");
		koe.communiceren();
		koe.levensgebied();
		System.out.print("\n");
		mens.communiceren();
		mens.levensgebied();
		System.out.print("\n");
		zombie.spraakgebrek();
		
		walvis.communiceren();
		walvis.levensgebied();
		System.out.print("\n");
	}
}

//Gemaakt door hakan.
