//Eunice Chan
//2025-09-12

public class Exercise {
    public static void main(String[] args) {
        
        //question 1
        int j = 0;
        for (int g = 0; g<5; g++)
            j++;
        System.out.println(j); //print out 5 as j increments everytime g has values from 1 to 4

        //question 2
        int s = 1;
        for (int jj = 3; jj >= 0; jj--) {
            s = s + jj; 
        }
        System.out.println(s); //print out 7 as s adds to the value as jj decreases from 3 to 0 so 1+3=4, 4+2=6, 6+1=7, 7+0=7

        //question 3
        int p = 6;
        int m = 20, k;
        for (k = 1; k < p; k++); {
            m = m + k * k; 
        }
        System.out.println(m); //print out 56 as the for-loop is closed immediately so it jumps to k=6 which is false so the loop is closed so m=20+6*6=56

        //question 4
        //double a = 1.0;
        //for (int jk = 0; jk < 9; jk++) {
        //    a*=3; 
        //}
        //System.out.println(jk); //doesn't work because variable jk is not declared outside of the for-loop 

        //question 5
        //for (int i = 0; i < 10; i++) {
        //    int bb = 19 + i; 
        //}
        //System.out.println(bb); //doesn't work because variable bb is not declared outside of the for-loop

        //question 6
        double d = 100.01;
        int b = 0;
        for (int u=0;u<10;u++)
            b = 19 + u;
            d++;
        System.out.println(d); //print out 101.01 as for loop is not in braces so d++ is not included in the loop so d just increments

        //question 7
        for (int c=3;c<=24;c*=2)
            System.out.println(c); //mutiplies and prints c times 2 until c reaches 24

        //question 8
        for (int a=24;a>=3;a/=2)
            System.out.println(a); //divides and prints c divided by 2 until c reaches 3

        //question 9
        int x = 0;
        for(int y=0; y<=10;y++) {
            if (y==5) {
            break;
            }
            else {
            x++;
            }
        }
        System.out.println(x); //print out 5 as else statement is only valid until y=5 so x increments 5 times to become 5

        //question 10
        //when the second condition is false, the loop stops 

        //question 11
        int i, h;
        for(i=10; i<=100; i=i+10)
            h = i / 2; //after each iteration from multiples of 10 j=5,10,15,20,25,30,35,40,45,50
        
        //question 12
        int r, o;
        for (o = 1; o < 10; o = o*2)
        r = 2 * o; //r will be 16 as 8 is the highest o can reach before the for-loop becomes false and ends so r=2*8=16 

        //question 13
        //making an infinite loop that never becomes false and closes

        //question 14
        //for (p = 9; p <= 145; p++) {
            //...
        //} //iterate 137 times
    }
}