package Hoofdstuk_12;

public class Quiz_2 extends Quiz_2_1
{
  int z = 5;
  int methodeB(int x)
  {
	  System.out.print("x");
	  return x;
  }
  
  //nee, we kunnen deze methode niet toevoegen aan MijnKlasse, omdat hij de Superklasse probeert te overriden, maar dat kan niet.
  
  void mijnKlasse(int x)
  {
    System.out.print("x");
  }
}