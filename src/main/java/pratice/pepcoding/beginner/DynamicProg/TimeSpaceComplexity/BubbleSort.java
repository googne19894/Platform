// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BubbleSort.java

package pratice.pepcoding.beginner.DynamicProg.TimeSpaceComplexity;

import java.io.PrintStream;
import java.util.Scanner;

public class BubbleSort
{

    public BubbleSort()
    {
    }

    public static void bubbleSort(int a[])
    {
        int n = a.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < n - i; j++)
                if(isSmaller(a, j, j - 1))
                    swap(a, j, j - 1);

        }

    }

    public static void swap(int arr[], int i, int j)
    {
        System.out.println((new StringBuilder()).append("Swapping ").append(arr[i]).append(" and ").append(arr[j]).toString());
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSmaller(int arr[], int i, int j)
    {
        System.out.println((new StringBuilder()).append("Comparing ").append(arr[i]).append(" and ").append(arr[j]).toString());
        return arr[i] < arr[j];
    }

    public static void print(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static void main(String args[])
        throws Exception
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        bubbleSort(arr);
        print(arr);
    }
}
