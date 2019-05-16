package Hoofdstuk_12;

public class Quiz_4_1 extends Quiz_4 
{
	void methodeA(int x, int y)
	{
		int z = x - y;
		System.out.print(z);
	}
	public static void main(String[] args)
	{
		Quiz_4_1 mk = new Quiz_4_1();
		mk.methodeA(6, 4);
	}
}

//de uitkomst = 15.0
// als je mk.methodeA(6, 4);veranderd hebt komt er 2 uit als uitkomst