package VidhinSan;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        int x,result;
        int base,num;
        int fact;

        System.out.println("Sum of the number");
        System.out.println("*****************");
        System.out.println("Enter the number");

        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        result=recusrionSum(x);
        System.out.println(result);

        System.out.println("Power of the number");
        System.out.println("*******************");
        System.out.println("Enter the base");
        base=sc.nextInt();
        System.out.println("Enter base raised to the power of");
        num=sc.nextInt();
        result=power(base,num);
        System.out.println("Power of the number is :" +result);


        System.out.println("Factorial using recursion");
        System.out.println("**************************");
        System.out.println("Enter the number to find factorial");
        fact=sc.nextInt();
        result = factRecursion(fact);
        System.out.println("Factorial of a number " +result);

    }

    //Sum of numbers using recursion

    static int recusrionSum(int sum)
    {
        if(sum==1) {
            return 1;
        }
        return sum+recusrionSum(sum-1);
    }

    //power of a number using recursion
    static int power(int base,int num) {
        if(num==1)
        {
            return base;
        }
        return(base*power(base,num-1));
    }

    //factorial of a number

    static int factRecursion(int fact) {
        if(fact==1)
        {
            return 1;
        }
        return(fact*factRecursion(fact-1));
    }


}
