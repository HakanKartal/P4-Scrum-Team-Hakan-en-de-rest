package Hoofdstuk_14;

public class MijnKlasse implements MijnInterface
{
	public void methode() {
		//x ++; /* 1*/
		System.out.print(x);
	}
	public void methode(int i) {
		int z = i;
		// z = z + x; /* 2*/
		methode();
		System.out.print(z);
	}
	public static void main(String[] args)
	{
		int x = 7;
		x++; 
		new MijnKlasse().methode(4);
	}
}

//Gemaakt door Jeron
//Vraag: dat daar neerzetten maakt geen verschil, ik krijg alleen een melding dat de variable niet gebruikt word.
