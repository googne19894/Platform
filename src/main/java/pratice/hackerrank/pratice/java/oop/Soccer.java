// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JavaMethodOverriding.java

package pratice.hackerrank.pratice.java.oop;

// Referenced classes of package pratice.hackerrank.pratice.java.oop:
//            Sports

class Soccer extends Sports
{

    Soccer()
    {
    }

    String getName()
    {
        return "Soccer Class";
    }

    void getNumberOfTeamMembers()
    {
        System.out.println((new StringBuilder()).append("Each team has 11 players in ").append(getName()).toString());
    }
}
