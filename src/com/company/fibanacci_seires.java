package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class PackageInfo {

    public static void main(String args[]){
        HashMap<Integer,String> h=new HashMap();
        h.put(101,"Aslam");
        h.put(103,"Salim");
        h.put(102,"Kazim");
        h.put(104,"Nasir");
//        Set<Integer> s=h.keySet();
//        Collection<String> c=h.values();
//        System.out.println(s);
//        System.out.println(c);
        for (Map.Entry<Integer,String> m: h.entrySet()
             ) {
            System.out.println(m);
        }
    }
}
