package com.logical;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Code2 {

    public static String reverseWords(String str)
    {
        String[] words=str.split(" ");
        String result="";
        for (int i= words.length-1;i>=0;i--)
        {
            if (i==0)
            {
                result=result + words[i];
            }
            else
            {
                result=result + words[i]+" ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        /*Random random=new Random();
        random.ints(1,100).limit(10).forEach(System.out::println);*/

        List<Integer> numbers=Arrays.asList(10,20,30,30,40,50,50);
        Set<Integer> uniqueNumbers=new HashSet<>();
        numbers.stream().filter(num->!uniqueNumbers.add(num)).forEach(System.out::println);

        String str="Welcome to JavaLearning";
        System.out.println(reverseWords(str));

        Map<String,Integer> map=new HashMap<>();
        map.put("a",3);
        map.put("b",2);
        map.put("c",1);
        System.out.println("Before sorting");
        System.out.println(map);
        LinkedHashMap<String,Integer> sortedMap=map.entrySet().stream().sorted((e1,e2)->e1.getValue()- e2.getValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println("After sorting");
        System.out.println(sortedMap);

        /*Intermediate Operation
        map,filter,sorted

        Terminal Operation
        forEach,collect */
        List<Integer> integers= Arrays.asList(4,5,20,7,9,10);
        long count=integers.stream().count();
        System.out.println("Count is "+count);

        //integers.stream().filter(i->i>5).forEach(System.out::println);
        //integers.stream().map(x->x*2).forEach(System.out::println);

        //sorting list
        List<Integer> sortedList=integers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //check max or min
        int max=integers.stream().max((x,y)->x-y).get();
        System.out.println("Maximum element is "+max);

        //Calculate square element
        integers.stream().mapToInt(n->n*n).forEach(System.out::println);
        //calculate if given elements are avg
        OptionalDouble opt=integers.stream().mapToInt(n->n*n).filter(n->n>=100).average();
        //integers.stream().mapToInt(n->n*n).filter(n->n>=100).forEach(System.out::println);
        if(opt.isPresent())
        {
            System.out.println("Average is "+opt.getAsDouble());
        }
        else
        {
            System.out.println("No qualifying element");
        }
    }
}
