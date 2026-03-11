import java.util.scanner;
class Arithmetic
  {
    public static void main (string args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt;int b=s.nextInt;
      int sum = a+b;
      int dif = a-b;
      int mul = a*b;
      int div =a/b;
      System.out.println("sum of two numbers is="+sum);
      System.out.println("difference b/w two no. ="+dif);
      System.out.println("multiplication of two no is="+mul);
      System.out.println("quotiont of two number is ="+div); 
    }
  }
