package pratice.common.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Array {
    public static ArrayList<ArrayList<Integer>> toAdjList(int V, int[][] graph) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < V; i++)
            res.add(new ArrayList<>());

        for (int[] g : graph)
            res.get(g[0]).add(g[1]);

        return res;
    }

    public static HashMap<Integer, List<Integer>> toAdjMap(int V, int[][] graph) {
        HashMap<Integer, List<Integer>> hash = new HashMap<>();

        for (int[] pre : graph) {
            hash.putIfAbsent(pre[0], new ArrayList<>());
            hash.get(pre[0]).add(pre[1]);
        }

        for (int i = 0; i <= V; i++)
            hash.putIfAbsent(i, new ArrayList<>());

        return hash;
    }

    public static ArrayList<ArrayList<Integer>> toList(int[][] nums) {
        ArrayList<ArrayList<Integer>> ref = new ArrayList<ArrayList<Integer>>();
        for (int[] num : nums)
            ref.add(toList(num));

        return ref;
    }

    public static ArrayList<ArrayList<ArrayList<Integer>>> toList(int[][][] nums) {
        ArrayList<ArrayList<ArrayList<Integer>>> ref = new ArrayList<>();
        for (int[][] num : nums)
            ref.add(toList(num));

        return ref;
    }

    public static ArrayList<Integer> toList(int[] nums) {
        ArrayList<Integer> ref = new ArrayList<>();
        for (int num : nums) {
            ref.add(num);
        }
        return ref;
    }

    public static ArrayList<String> toList(String[] nums) {
        ArrayList<String> ref = new ArrayList<>();
        for (String num : nums) {
            ref.add(num);
        }
        return ref;
    }

    public static Integer[] toInteger(String[] input) {
        Integer[] ref = new Integer[input.length];
        int i = 0;
        for (String ip : input) {
            if (ip == null || ip.equals("null") ||
                    ip.toLowerCase().equals("n") ||
                    ip.equals("-1"))
                ref[i++] = null;
            else
                ref[i++] = Integer.parseInt(ip.trim());
        }
        return ref;
    }

    public static String[] toString(Integer[] input) {
        String[] ref = new String[input.length];
        int i = 0;
        for (Integer ip : input)
            ref[i++] = String.valueOf(ip);
        return ref;
    }


    public static void fill(int[][] graph, int inf) {
        for (int[] g : graph)
            Arrays.fill(g, inf);
    }

    public static int[][] toArray(String[] input) {
        int[][] arr = new int[input.length][input.length];
        int i = 0, j = 0;
        for (String ip : input) {
            String[] token = ip.split(" ");
            for (String t : token)
                arr[i++][j++] = Integer.parseInt(t);
        }

        return arr;
    }

    public static void reverseSort(long[] b) {
        for (int i = 0; i < b.length; i++)
            b[i] = -1 * b[i];
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++)
            b[i] = -1 * b[i];
    }
}
