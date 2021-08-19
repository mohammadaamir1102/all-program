package com.basic;

public class ArrayBubbleShort {
    public static void main(String[] args) {
        int[] a={20,54,64,23,54};
        for(int i=0;i<a.length;i++)
        {
            int temp;
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
        for (int z:a) {
            System.out.print(z+",");
        }
        System.out.println();
        System.out.println("second largest elements is "+a[a.length-2]);
    }
}
