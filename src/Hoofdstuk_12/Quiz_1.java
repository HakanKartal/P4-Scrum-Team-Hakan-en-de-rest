package Hoofdstuk_12;

public final class Quiz_1
{
  final int x = 3;
  int bereken(int y, int z)
  {
    if (y >= z)
    {
      return y + x;
    }
    else
    {
      // y = 5; /* 1 */
      // z += 3; /* 2 */
      // z = x / 2; /* 3 */
      // int x = 6; /* 4 */
      // x ++ ; /* 5 */
      return z + x;
    }
  }
  public static void main(String[] args)
  {
    Quiz_1 mk = new Quiz_1();
    System.out.println(mk.bereken(4, 6));
  }
}

//MijnKlasse kan geen subklasse hebben, omdat deze een final class is.
//MijnKlasse kan wel een superklasse hebben, want deze overruled MijnKlasse weer.
