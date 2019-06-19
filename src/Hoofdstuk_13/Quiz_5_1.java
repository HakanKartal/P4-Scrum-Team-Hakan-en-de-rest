package Hoofdstuk_13;

public class Quiz_5_1 extends Quiz_5{
	void methodeA()
	{
		System.out.print("x");
	}
	void methodeA(int x)
	{
		System.out.print("y" + x);
	}
	String methodeB(String s)
	{
		return s + x;
	}
	String methodeB(int x)
	{
		return "x" + x;
	}
	public static void main(String[] args)
	{
		Quiz_5_1 mk = new Quiz_5_1();
		mk.methodeA();
		System.out.print(mk.methodeB("y"));
	}

}
//gemaakt door Wouter
