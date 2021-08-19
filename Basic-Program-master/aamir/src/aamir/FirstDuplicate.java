package aamir;

public class FirstDuplicate {
    public static void main(String[] args) {
        int []a={1,2,3,2,3,1};
        int temp=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j]){
                    System.out.println("First Duplicate element is : "+a[j]);
                    temp++;
                }
                if(temp>0){
                    break;
                }
            }
        }
    }
}
