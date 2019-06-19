package Hoofdstuk_11;

public class Quiz_5_1 extends Quiz_5
{
	int mijnMethode(int i, int i2)
	{
		return mijnMethode(i) + x + i2;
	}
	public static void main(String[] args)
	{
		Quiz_5_1 subK = new Quiz_5_1();
		System.out.print(subK.mijnMethode(2,8));
	}
}

// De standaartuitvoer geeft 14 inplaats van 13.