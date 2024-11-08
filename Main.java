import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(isPrime(2));
  }

  public static boolean isPrime(int num)
  {
    if (num == 1)
    {
      return false;
    }

    for (int rizz = 2; rizz < num; rizz++)
    {
      if (num % 1 == 0)
      {
        return false;
      }
    }
    return true;
  }
}
