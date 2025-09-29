public class Main
{
  public static void main(String[] args)
  {
    // write your code here
    lastFirstN("cream", "butter", 3);

    stringManip ("cream", "butter");
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
  String output;
  String firstN;
  String lastN;

 //first N letters of s2
firstN = s2.substring (0,n);

//last N letters of s1
int startPosition = s1.length () - n;
lastN = s1.substring (startPosition);


  output = lastN + firstN;
  print.out.println(output);

  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
  String Upper;
  String Lower;

  Int LengthOfupper = s1.length();
  Upper = s1.toUpperCase();

   
  Lower = s2.substring(0) ;
  Lower = s2.toLowerCase ();

  System.out.println (Upper + Lower);

  


  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
