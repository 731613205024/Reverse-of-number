/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class reverseofnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int b,rev = 0;
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        while(n>0)
        {
            b=n%10;
            rev=rev*10+b;
            n=n/10;
        }
        System.out.println("Reverse of given num is:"+rev);   
    }
}
