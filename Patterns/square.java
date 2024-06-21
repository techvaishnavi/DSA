
// by taking n as input 

import java.util.Scanner;

public class square {

    public static void main(String[] args) {
        int i,j,n;
        Scanner read= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n= read.nextInt();
        for(i=0; i<n; i++){
            for(j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}