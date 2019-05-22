package Hoofdstuk_11;

public class Quiz_1 extends Quiz_1_1{
	private int y = 7;
	
	Quiz_1() {
		x += 5;
		y ++;
		System.out.println(x + ", " + y);
	}
	public static void main(String[] args) {
		Quiz_1 qz = new Quiz_1();
	}
}
// Console: "5, 8"