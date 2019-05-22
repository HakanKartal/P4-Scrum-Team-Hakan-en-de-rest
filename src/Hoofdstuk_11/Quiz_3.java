package Hoofdstuk_11;

public class Quiz_3 extends Quiz_3_1 {
	char c2= 'A';
	
	Quiz_3() {
		this('N');
		System.out.print(c2);
	}
	
	Quiz_3(char c) {
		System.out.print(c);
	}
	
	void mijnMethode() {
		super.mijnMethode();
		System.out.print(c2);
	}
	
	public static void main(String[] args) {
		Quiz_3 qzK = new Quiz_3();
		qzK.mijnMethode();
	}
}
