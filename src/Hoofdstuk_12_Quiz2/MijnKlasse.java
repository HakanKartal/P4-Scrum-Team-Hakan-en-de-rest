package Hoofdstuk_12_Quiz2;

public class MijnKlasse extends Superklasse
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
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
  }
}
