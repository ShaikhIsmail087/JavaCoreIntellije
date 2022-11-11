package com.logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchElement {
    public static void main(String[] args) throws IOException {
        int[] arrray={1,2,4,3,6,4};
        boolean isPresent=false;
        int index=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to be searched");
        String input=br.readLine();
        Integer number=Integer.valueOf(input);
        for (int i=0;i< arrray.length;i++)
        {
            if (arrray[i]==number)
            {
                number=arrray[i];
                isPresent=true;
                index=i;
            }
        }
        if (isPresent==true)
        {
            System.out.println("Element is present at Index="+index);
        }
        else
        {
            System.out.println("Element is not present in array");
        }
    }
}
