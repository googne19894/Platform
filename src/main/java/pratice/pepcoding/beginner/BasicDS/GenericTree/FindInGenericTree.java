// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FindInGenericTree.java

package pratice.pepcoding.beginner.BasicDS.GenericTree;

import java.io.*;
import java.util.*;

public class FindInGenericTree
{
    private static class Node
    {

        int data;
        ArrayList children;

        private Node()
        {
            children = new ArrayList();
        }

    }


    public FindInGenericTree()
    {
    }

    public static void display(Node node)
    {
        String str = (new StringBuilder()).append(node.data).append(" -> ").toString();
        for(Iterator iterator = node.children.iterator(); iterator.hasNext();)
        {
            Node child = (Node)iterator.next();
            str = (new StringBuilder()).append(str).append(child.data).append(", ").toString();
        }

        str = (new StringBuilder()).append(str).append(".").toString();
        System.out.println(str);
        Node child;
        for(Iterator iterator1 = node.children.iterator(); iterator1.hasNext(); display(child))
            child = (Node)iterator1.next();

    }

    public static Node construct(int arr[])
    {
        Node root = null;
        Stack st = new Stack();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == -1)
            {
                st.pop();
                continue;
            }
            Node t = new Node();
            t.data = arr[i];
            if(st.size() > 0)
                ((Node)st.peek()).children.add(t);
            else
                root = t;
            st.push(t);
        }

        return root;
    }

    public static boolean find(Node node, int data)
    {
        if(node.data == data)
            return true;
        for(Iterator iterator = node.children.iterator(); iterator.hasNext();)
        {
            Node child = (Node)iterator.next();
            if(find(child, data))
                return true;
        }

        return false;
    }

    public static void main(String args[])
        throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        String values[] = br.readLine().split(" ");
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(values[i]);

        int data = Integer.parseInt(br.readLine());
        Node root = construct(arr);
        boolean flag = find(root, data);
        System.out.println(flag);
    }
}
