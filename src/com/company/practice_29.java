package com.company;

public class practice_29 {
    public static void main(String[] args) {
        //practice problem 1

       /* float [] marks = {45.5f,67.8f,63.4f,99.2f,100.0f};
        float sum =0;
        for (float elements: marks){
            sum=sum+elements;
        }
        System.out.println("The value of sum : " + sum);



        //practice problem 2

        float [] marks = {45.5f,67.8f,63.4f,99.2f,100.0f};
        float sum =45.65f;
        boolean isAnArray = false;
        for (float elements: marks){
            if (sum==elements){
                isAnArray=true;
                break;
            }
        }
        if (isAnArray){
            System.out.println("The value is present in the Array");
        }
        else {
            System.out.println("The value is not present in the Array");
        }

        //practice problem 3

        float [] marks = {45.5f,67.8f,63.4f,99.2f,100.0f};
        float sum =0;
        for (float elements: marks){
            sum=sum+elements;
        }
        System.out.println("The value of average marks is : " + sum/marks.length);


        //practice problem 4

        int [][] mat1={{1, 2, 3},
                       {4, 5, 6}};
        int [][] mat2={{2, 6, 13},
                       {3, 7, 1}};
        int [][] result={{0, 0, 0},
                         {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }


        //practice problem 5

        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i=0; i<n; i++){
            //swap a[i] and a[l-1-i]
            // a b temp
            temp=arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int elements: arr){
            System.out.print(elements + " ");
        }


        //practice problem 6
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for (int e: arr){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this arry is: "+max);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        */
        //practice problem 7
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr [i+1]){
                isSorted = false;
            }
        }
        if (isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }

    }
}
