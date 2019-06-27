package Hoofdstuk_13;

public class Quiz_1 extends Quiz_1_1
{
	int bereken()
	{
		return x + 5;
	}
	int bereken(int x)
	{
		return super.x + x;
	}
	public static void main(String[] args)
	{
		Quiz_1 mk = new Quiz_1();
		System.out.print(mk.bereken(4));
	}
}

// Opdracht 1:
// het toevoegen van een abstracte methode is gedaan.
// Opdracht 2:
// 
// Gemaakt door Quinn Voordes
