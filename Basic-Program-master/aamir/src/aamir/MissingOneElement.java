package aamir;

public class MissingOneElement {
    public static void main(String[] args) {
        int []a={1,2,3,4,6};
        int sum=0;
        int missingElement;
        int expected=a.length+1;
        int totalElmnt=expected*(expected+1)/2;
        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];
        }
        missingElement=totalElmnt-sum;
        System.out.println(missingElement);

    }
}
