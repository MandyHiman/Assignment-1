import java.util.Scanner;

public class prac3 {



    public static void main(String args[])
    {
        int a=0,i=1;
        while(i<1000) {
            if(i%7==0)
                a = a + i;
            i++;
        }
        System.out.println("Sum of Digits: "+a);
    }
}

