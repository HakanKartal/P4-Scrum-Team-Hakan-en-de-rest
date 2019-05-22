package Hoofdstuk_11;

public class Quiz_2 extends Quiz_2_1 {
	Quiz_2(int y) {
		x += y;
	}
	
	public static void main(String[] args) {
		Quiz_2 qz = new Quiz_2(4);
		Quiz_2 qz2 = new Quiz_2(6);
		System.out.print(qz.x);
		System.out.print(qz2.x);
	}
}
// Console: "79"
