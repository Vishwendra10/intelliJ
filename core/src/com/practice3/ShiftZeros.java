package com.practice3;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,0,5,3,4,0,1};
        int[] result= new int[arr.length];
        int start=0;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]==0){
                    result[start]=arr[i];
                    start++;
                }
        }
        for(int x: arr)
        {
            if(x!=0){result[start]=x;
            start++;}
        }
        for(int x:result)
        {
            System.out.print(x+" ");
        }
    }
}
