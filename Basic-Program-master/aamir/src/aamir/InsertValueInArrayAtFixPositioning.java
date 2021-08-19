package aamir;

public class InsertValueInArrayAtFixPositioning {
    public static void main(String[] args) {
        int []a={1,3,4,5};
        int element=2;
        for (int i = 0; i <a.length ; i++) {
            if(i==1){
                a[i]=element;
            }
            System.out.println(a[i]);
        }
    }
}
