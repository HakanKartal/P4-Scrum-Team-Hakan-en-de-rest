package Hoofdstuk_12_Quiz3;

public class MijnKlasse extends Superklasse
{
  int x = 3;
  String methodeA(String s, int i)
  {
    String str = s + ", " + i;
    return str;
  }
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
    System.out.print(mk.methodeA(23, "Emma"));
  }
}
