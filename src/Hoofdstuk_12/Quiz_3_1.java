package Hoofdstuk_12;

public class Quiz_3_1 extends Quiz_3
{
  int x = 3;
  String methodeA(String s, int i)
  {
    String str = s + ", " + i;
    return str;
  }
  public static void main(String[] args)
  {
    Quiz_3_1 mk = new Quiz_3_1();
    System.out.print(mk.methodeA(23, "Emma"));
  }
}
