package com.hackerrank.contest.HackTheInterview.II.Global.QuesI;

import com.common.BigInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDistribution {
    public ProductDistribution() {
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> a = new ArrayList();
        boolean bigInput = false;
        if (bigInput) {
            String input = BigInput.input("com\\hackerrank\\contest\\HackTheInterview\\II\\Global\\QuesI\\" +
                    "ProductDistribution.txt");
            BigInput.formatInput(a, input);
        } else {
            for (int i = 0; i < n; ++i) {
                int aItem = in.nextInt();
                a.add(aItem);
            }
        }
        System.out.println(Result.maxScore1(a, m));
        System.out.println(Result.maxScore2(a, m));
        System.out.println(Result.maxScore3(a, m));
    }


}