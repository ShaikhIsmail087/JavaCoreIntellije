package com.logical;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Code {
    // Function to remove adjacent characters
    static String removeAdjacentRepeatedCharacters(String str){
        Stack<Character> stack = new Stack<>();
        int i;
        stack.push(str.charAt(0));
        for(i=1; i<str.length(); i++){
            if(stack.peek() == str.charAt(i)){
                stack.pop();
                continue;
            }
            stack.push(str.charAt(i));
        }
        StringBuffer obj = new StringBuffer();
        while(!stack.isEmpty()){
            obj.append(stack.pop());
        }
        return obj.reverse().toString();
    }
    public static void shiftZeroToEnd(int[] arr,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
                arr[count++]=arr[i];
        }
        while(count<n)
            arr[count++]=0;
    }
    public static  void swap(int A[],int a,int b)
    {
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
    public static void main(String[] args) {
        //way 1) shift all zero to end of array
        int[] numbers = { 1, 10, 0, 5, 7,3,0,450,4,0,7,9,0,6,0,0 };
        int n1=numbers.length;
        shiftZeroToEnd(numbers,n1);
        System.out.println("Array after pushing zeros to the back:");
        for(int i=0;i<n1;i++)
            System.out.print(numbers[i]+" ");
        System.out.println();
        //way 2) shift all zero to end of array
        int[] A={5,6,0,4,6,0,9,0,8};
        int a=0;
        for(int i=0;i<A.length;i++)
        {
            if (A[i]!=0)
            {
                swap(A,a,i);
                a++;
            }
        }
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+" ");
        System.out.println();

        //shift all zero to end of array through java 8
        numbers = IntStream.of(numbers).boxed().sorted(Comparator.comparing(n -> n == 0)).mapToInt(i->i).toArray();
        for(int i:numbers)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //extract start with 1 elements from an array
        List<Integer> l=Arrays.asList(12,3,15,54,165,19,16);
        l.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);

        String str="ABBCCCD";
        String newString =removeAdjacentRepeatedCharacters(str);
        System.out.println("The new string is \"" + newString + "\"");

        //swapping two string without third variable
        String str1="cloud";
        String str2="tech";
        System.out.println("First String before swap: "+str1);
        System.out.println("Second String before swap: "+str2);

        str1=str1+str2;
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1=str1.substring(str2.length());

        System.out.println("First String after swap: "+str1);
        System.out.println("Second String sfter swap: "+str2);

        //check string rotation
        String s1="cloudtech";
        String s2="techcloud";//cloudcloud
        if(s1.length()!= s2.length())
        {
            System.out.println("String 2 is not rotation of String 1");
        }
        else
        {
            s1=s1+s2;
            if(s1.indexOf(s2) !=-1)
            {
                System.out.println("String 2 is rotation of String 1");
            }
            else
            {
                System.out.println("String 2 is not rotation of String 1");
            }

            //sequential stream & parallel stream
            List<Integer> num1=Arrays.asList(1,2,3,4);
            num1.stream().forEach(e->{
                System.out.println(e+" "+Thread.currentThread().getName());
            });
            //1.sequential stream runs on single thread  2.output is predictable
            //1.parallel stream runs on multiple thread  2.output is not predictable

            List<Integer> num2=Arrays.asList(1,2,3,4);
            num2.parallelStream().forEach(e->{ //forEachOrdered
                System.out.println(e+" "+Thread.currentThread().getName());
            });

            //count number of character in string
            String s="ab, cd, xyz";
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=' ' && s.charAt(i)!=',')
                {
                    count++;
                }
            }
            System.out.println("Total number of character in the string are: "+count);

            //Add sum of array to each element of the array
            List<Integer> number=Arrays.asList(10,20,30,40,50);
            Integer sum=number.stream().reduce(0,Integer::sum);
            System.out.println(sum);
            List<Integer> transFormedList= number.stream().map(x -> x + sum).toList();
            System.out.println(transFormedList);
            /*int[] a={10,20,30,40,50};
            int[] newA=new int[a.length];
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                sum+=a[i];
            }
            System.out.println(sum);
            for(int i=0;i<newA.length;i++)
            {
                newA[i]=sum+a[i];
            }
            System.out.println(Arrays.toString(newA));*/

            //convert all the country names to upper case and separate them by ,
            List<String> countries=Arrays.asList("USA","Japan","France","Germany","Italy","India","Canada");
            String country=countries.stream().map(x->x.toUpperCase()).collect(Collectors.joining(", "));
            System.out.println(country);

            //String joiner to separate the string
            StringJoiner sj1=new StringJoiner(",","[","]");
            sj1.add("A").add("B").add("C");
            System.out.println(sj1);

            StringJoiner sj2=new StringJoiner(":");
            sj2.add("P").add("Q");
            System.out.println(sj2);

            sj1.merge(sj2);
            System.out.println(sj1);

            //print intersection array element
            int[] arr1={80,10,15,2,35,60};
            int[] arr2={35,80,60,20,75};
            printIntersection(arr1,arr2);
            printUnion(arr1,arr2);

            //count and print removed special characters
            String sg="CloudTech#@!";
            int cnt=0;
            String specialCharacterRemoved="";
            for(int i=0;i<sg.length();i++)
            {
                if(!Character.isDigit(sg.charAt(i)) && !Character.isLetter(sg.charAt(i))
                        && !Character.isWhitespace(sg.charAt(i)))
                {
                    cnt++;
                }
                else
                {
                    specialCharacterRemoved=specialCharacterRemoved+sg.charAt(i);
                }
            }
            if(count==0)
            {
                System.out.println("There are no special characters in String");
            }
            else
            {
                System.out.println("Special characters found "+cnt);
            }
            System.out.println("Special characters Removed "+specialCharacterRemoved);

            //check rotation of strings
            String st1="ABCD";
            String st2="CDAB";
            if(isRotation(st1,st2))
            {
                System.out.println("Rotaion of String present");
            }
            else
            {
                System.out.println("Rotation not found");
            }

            //find missing element
            int[] arr={1,2,4,5,6,7,8,9,10};

            int sum1=(10*11)/2;

            int actualSum=0;

            for(int i=0;i<arr.length;i++)
            {
                actualSum = actualSum + arr[i];
            }
            System.out.println("Missing number is " + (sum1-actualSum));

            //1. Iterative Method: count number of vowels in string
            String str3="LibEudAo";
            System.out.println("Vowels count in string by iterative method "+countVowels(str3));

            //2. Recursive Method: count number of vowels in string
            System.out.println("Vowels count in string by recursive method "+countVowel(str3,str3.length()));

            //map sorting in DNS & CS
            /*Map<Integer,String> m=new HashMap<>();
            m.put(33,"Ismail");
            m.put(67,"Salik");
            m.put(123,"Ahmed");
            m.put(325,"Kalam");
            m.put(87,"Zaad");
            m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);//comparingByKey()
            m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);//comparingByValue()
            m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
            m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);*/
        }
    }
    public static int isVowels(char c)
    {
        c=Character.toUpperCase(c);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return 1;
        else return 0;
    }
    public static int countVowel(String s,int n)
    {
        if(n==1)
            return isVowels(s.charAt(n-1));

        return countVowel(s,n-1) + isVowels(s.charAt(n-1));
    }
    public static boolean isVowel(char c)
    {
        c=Character.toUpperCase(c);
        return (c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
    public static int countVowels(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean isRotation(String str1,String str2)
    {
        return (str1.length()== str2.length() && (str1+str1).indexOf(str2) !=-1);
    }
    public static void printUnion(int[] arr1,int[] arr2)
    {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            s.add(arr2[i]);
        }
        System.out.println("Union");
        System.out.println(s);
    }
    public static void printIntersection(int[] arr1,int[] arr2)
    {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(s.contains(arr2[i]))
            {
                System.out.println(arr2[i]+" ");
            }
        }
    }
}
