import java.util.*;
import java.util.HashSet;
import java.util.concurrent.*;
import java.util.stream.*;

class Logic
{
    public static void main(String[] args)
	{
		int[] arr={18,2,0,19,0,73,47,0,10,0,14,191};
		int tem=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=0 && arr[j]==0)
				{
					arr[i]=arr[j];
					arr[j]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		String[] num=new String[arr.length];
		int cout=0;
		for(int i=0;i<num.length;i++)
		{
			num[cout++]=arr[i]+"";
			if(num[i].startsWith("1"))
				System.out.println(num[i]);
		}
		
		String str= "characters";
		int[] freq=new int[str.length()];
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j]){
					freq[i]++;
				
				ch[j]='0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for(int i=0;i<freq.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='0')
				System.out.println(ch[i]+" "+freq[i]);
		}
		//String str= "ab aba xyx mno xyz pop";
		String[] p = {"ab","aba","xyx","mno","xyz","pop"};
		for(int i=0;i<p.length;i++)
		{
			if(p[i].charAt(0)==p[i].charAt(p[i].length()-1))
			{
				System.out.print(p[i]+" ");
			}
		}
		System.out.println();
		String testString = "TESTSTRING";
        String output = "";
        for (int i = 0; i < testString.length(); i++) {
            if(i%2 == 0)
            {
                output += Character.toUpperCase(testString.toCharArray()[i]);
            }else
            {
                output += Character.toLowerCase(testString.toCharArray()[i]);
            }
        }

        System.out.println("Newly generated string is as follow: "+ output);
		
		String s="ismail shaikh ";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i),1);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i))!=0)
			{
			System.out.println(s.charAt(i)+" "+map.get(s.charAt(i)));
			map.put(s.charAt(i),0);
			}
		}
		int[] a={635,3478,293,8,29,10,7};
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);
		System.out.println(a[a.length-3]);
		System.out.println(a[a.length-4]);
    }
}
