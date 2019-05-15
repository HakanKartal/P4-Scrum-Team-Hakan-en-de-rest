package Hoofdstuk_11;

public class Quiz_7_1 extends Quiz_7 
{
	Quiz_7_1(String naam)
	{
		super(naam);
		System.out.print(naam);
	}
	public static void main (String[] args)
	{
		Quiz_7_1 sk = new Quiz_7_1("x");
	}

}
//de uitkomst = xdxx
