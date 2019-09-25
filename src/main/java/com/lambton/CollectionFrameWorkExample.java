package com.lambton;
import java.util.*;
import java.util.Scanner;

public class CollectionFrameWorkExample
{
    public static void main(String[] args)
    {
        ArrayList<String> nStringArrayList = new ArrayList<>();
        nStringArrayList.add("A");
        nStringArrayList.add("B");
        nStringArrayList.add("C");
        nStringArrayList.add("C");
        nStringArrayList.add("D");
        nStringArrayList.add("A");
        nStringArrayList.add("A");
      //  System.out.println(nStringArrayList);
        //nStringArrayList.set(2, "bb");

        for (int i = 0; i < nStringArrayList.size(); i++)
        {
            System.out.println(nStringArrayList.get(i));
        }
        for(String num: nStringArrayList)
        {
            System.out.println(num);
        }

        Iterator<String >iterator=nStringArrayList.iterator();
        while (iterator.hasNext())
        {
            String s= iterator.next();
            System.out.println(s);
        }
        Set<String> mySet=new HashSet<>();
        mySet.add("India");
        mySet.add("China");
        mySet.add("USA");
        mySet.add("Korea");
        mySet.add("USA");
        System.out.println(mySet);

        ArrayList<String> statesOfCanada = new ArrayList<>();
        statesOfCanada.add("on");
        statesOfCanada.add("Quebec");
        statesOfCanada.add("Alberta");
        statesOfCanada.add("BC");
        for(String num: statesOfCanada)
        {
            System.out.println(num);
        }
        ArrayList<String> statesOfIndia = new ArrayList<>();
        statesOfIndia.add("PB");
        statesOfIndia.add("GUJ");
        statesOfIndia.add("MP");
        statesOfIndia.add("HP");
        for(String num: statesOfIndia)
        {
            System.out.println(num);
        }
        ArrayList<String> statesOfUSA = new ArrayList<>();
        statesOfUSA .add("NY");
        statesOfUSA .add("Calefornia");
        statesOfUSA .add("teaxes");
        statesOfUSA .add("hwai");
        for(String num: statesOfUSA )
        {
            System.out.println(num);
        }




        Map<String, ArrayList<String>> StaINDMap=new HashMap<>();
        {
            StaINDMap.put("INDIA",statesOfIndia);
            StaINDMap.put("Canada",statesOfCanada);
            StaINDMap.put("USA",statesOfUSA);
        }

            System.out.println(StaINDMap);

System.out.println("---------------------------------------");
        ArrayList<String>data=new ArrayList<>();
        data.add("abc");
        data.add("cab");
        data.add("Cat");
        data.add("mate");
        data.add("Atem");
        data.add("bac");
        data.add("Tac");
        data.add("atc");
        data.add("pop");
        data.add("pat");
        data.add("123");
        data.add("231");
        data.add("431");

        System.out.println(data);
        Collections.sort(data);
        Map<String,ArrayList<String>> hm =new HashMap<>();

       for(String s: data)
       {
           char[] c=s.toCharArray();
           Arrays.sort(c);
           String key=new String(c);
           ArrayList<String>al=hm.get(key);

           if (al==null)
           {
               al= new ArrayList<>();

           }
           al.add(s);
            hm.put(key,al);

       }
       System.out.println(hm);

    }



















    }
