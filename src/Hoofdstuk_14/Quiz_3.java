package Hoofdstuk_14;

public class Quiz_3 extends Quiz_3_2
{
	//int x = 6;
	
	public void mijnMethode(String s)
	{
		 mijnMethode();
		 System.out.print("q" + s + x);
	}
	public static void main(String[] args)
	{
		Quiz_3 mk = new Quiz_3();
		mk.mijnMethode("w");
	}
}

// Vraag 1
// Antwoord: Dan geeft de uitvoer aan dat hij x geen variable heeft.
// Vraag 2
// Antwoord: Dan geeft de uitvoer aan dat de 6 verandert naar een 4.
// Gemaakt door Quinn Voordes