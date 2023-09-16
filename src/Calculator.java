public class Calculator
{
    static int a = 10;
    static int b = 45;

    static int answer;


    public static void main (String [] args) {
        add();
        subtract();
        multi();
        modulus();
        div();
        Increment();
    }

    static void add()
    {
         answer = a + b;
        System.out.println("Addition of " +a+ " & "+b+" = " +answer);

    }

    static void subtract()
    {
         answer = a - b;
        System.out.println("Subtract of " +a+ " & " +b+" = " +answer);
    }

    static void multi()
    {
       answer = a * b;
      System.out.println("Multiplication of " +a+ " & " +b+ " = " +answer);
    }

    static void modulus()
    {
         answer =  b % a;
        System.out.println("Modulus of " +b+ " & " +a+ " = " +answer);
    }


    static void div(){
        double answer = (double) b/a;
        System.out.println("Division of " +b+ " & " +a+ " = " +answer);
    }

    static void Increment()
    {
        System.out.println("Increment of " +a+ " = "  +(++a));
    }

}
