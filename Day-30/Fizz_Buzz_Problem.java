public class Fizz_Buzz_Problem {
    public  static  void fizz_Buzz()
    { int a=1;
        while (a<=100)
        {
            if( a%3==0 && a%5==0)
            {
                System.out.println("Fizz");
            }
            else if ( a%5 == 0)
            {
                System.out.println("Buzz");
            }
            else if (a%3 == 0)
            {
                System.out.println("Fizz_buzz");
            } else
            {
                System.out.println(a);
            }
            a++;
        }
    }

    public static void main(String[] args) {
        fizz_Buzz();
    }
}
