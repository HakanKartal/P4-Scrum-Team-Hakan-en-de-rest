package Hoofdstuk_11;

public class Quiz_4_2 extends Quiz_4_1{
	public Quiz_4_2()
	{
		x += 2;
		y += 3;
		System.out.print(" x" + x);
		System.out.print(" y" + y);
	}
	public static void main(String[] args)
	{
		Quiz_4_2 subK = new Quiz_4_2();
	}
}

// De uitvoer is x5 y8 x 12 y 11 als je een variable x = 10 geeft.