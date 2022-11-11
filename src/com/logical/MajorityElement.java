package com.logical;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] array={10,20,20,20,20};
        for (int i=0;i< array.length;i++)
        {
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if (entry.getValue()>array.length/2)
            {
                int result=entry.getKey();
                System.out.println(result);
            }
        }
    }
}
