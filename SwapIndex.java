package VidhinSan;

import java.util.Scanner;

public class SwapIndex {
    public static void main(String[] args) {
        int[] inputArray=new int[5];
        Scanner sc=new Scanner(System.in);
        int index1,index2;

        System.out.println("Enter the elements");
        for(int i=0;i<inputArray.length;i++)
        {
            inputArray[i]=sc.nextInt();
        }

        System.out.println("Select indexes to swap");
        index1=sc.nextInt();
        index2=sc.nextInt();

        System.out.println("Before swapping");
        printArray(inputArray);
        swapValues(inputArray,index1,index2);
    }

    static void swapValues(int[] inputArray,int index1,int index2)
    {
        int temp;
        temp=inputArray[index1];
        inputArray[index1]=inputArray[index2];
        inputArray[index2]=temp;
        System.out.println("\nAfter Swapping");
        printArray(inputArray);

    }
    static void printArray(int[] inputArray)
    {
        for(int i : inputArray)
        {
            System.out.print(i + " ");
        }
    }
}
