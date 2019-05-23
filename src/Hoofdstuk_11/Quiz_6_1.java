package Hoofdstuk_11;

public class Quiz_6_1 extends Quiz_6
{
	protected char e = 'p';
	
	void mijnMethode1()
	{
		x ++;
		System.out.print(e);
		super.mijnMethode1();
		x += 2;
		System.out.print(x);
	}
	public static void main(String[] args)
	{
		Quiz_6_1 sk = new Quiz_6_1();
		sk.mijnMethode1();
	}
}

// De standaartuitvoer die wordt in plaats van dd810 nu pd810.