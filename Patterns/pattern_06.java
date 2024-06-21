/*
* * * * 
* * *
* *
*

*/
import java.util.*;
public class pattern_06 {
    public static void main(String[] args) {
        int i, j;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter n:");
        int n= read.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }


}
