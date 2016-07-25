/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class index {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the no.s:");
        Scanner s1 = new Scanner(System.in);
        String s = s1.nextLine();
        String[] b = s.split(" ");
        for (int i = 0; i < b.length; i++) {
        }
        for (int i = 0; i < b.length; i++) {
            int n;
            n = Integer.parseInt(b[i]);
            if (i == n) {
                System.out.print(i+" ");
            }
        }
    }
}
