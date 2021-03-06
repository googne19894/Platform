// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MinimumAbsoluteDifferenceInArray.java

package pratice.hackerrank.pratice.interview.GreedyAlgorithms;

import pratice.common.Out;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInArray
{

    public MinimumAbsoluteDifferenceInArray()
    {
    }

    static int minimumAbsoluteDifference(int arr[])
    {
        Arrays.sort(arr);
        int abs = Math.abs(arr[0] - arr[1]);
        for(int i = 1; i < arr.length - 1; i++)
        {
            int ref = Math.abs(arr[i] - arr[i + 1]);
            if(abs > ref)
                abs = ref;
        }

        return abs;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();

        Out.print(a);
        int ans = minimumAbsoluteDifference(a);
        System.out.println(ans);
    }
}
