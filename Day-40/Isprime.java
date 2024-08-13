import java.util.Scanner;


public class Isprime {
    public static boolean isPrime(int num){
    if(num==2){
          return true;
    }
    for(int i=2; i<num/2; i++){
        if(num%i==0){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int num=sc.nextInt();

    
        if(isPrime(num)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    }

