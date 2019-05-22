package Hoofdstuk_11;

public class Quiz_6_1 extends Quiz_6
{
	void mijnMethode()
	{
		x ++;
		System.out.print(e);
		super.mijnMethode();
		x += 2;
		System.out.print(x);
	}
	public static void main(String[] args)
	{
		Quiz_6_1 sk = new Quiz_6_1();
		sk.mijnMethode();
	}
}