// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JavaComparator.java

package pratice.hackerrank.pratice.java.DataStructure;

import java.util.Comparator;

// Referenced classes of package pratice.hackerrank.pratice.java.DataStructure:
//            Player

class Checker
    implements Comparator
{

    Checker()
    {
    }

    public int compare(Player a, Player b)
    {
        if(a.score == b.score)
            return a.name.compareTo(b.name);
        else
            return b.score - a.score;
    }

    public int compare(Object obj, Object obj1)
    {
        return compare((Player)obj, (Player)obj1);
    }
}
