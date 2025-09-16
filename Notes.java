//Eunice Chan
//2025-09-12

import java.util.*;
public class Notes {
    public static void main(String[] args) {
        //loop- a block of code that is repeated with certain rules about how to start and end the process
        //initializing expression: j=13
        //control expression: j<=50
        //step expression: j++

        for (int j=1;j<=5;j++) {
            System.out.println(j);
        }
        //don't necessarily need braces if only one line of code
        //break; exits immediately out of loop
        //nested loop: placing a loop in another loop

        for (int a=1;a<=6;a++) {
            System.out.println("outer " + a);
            
            for(int b=2; b<=6;b+=2) 
            System.out.println("inner " + b);
        }
    }
}