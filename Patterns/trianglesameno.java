
/* 
1   
2 2 
3 3 3
4 4 4 4 
5 5 5 5 5  */


   import java.util.Scanner;
   public class trianglesameno {
       public static void main(String[] args) {
           int i, j;
           Scanner read= new Scanner(System.in);
           System.out.println("Enetr n: ");
           int n = read.nextInt();
           for(i=1;i<=n;i++){
               for(j=1; j<=i;j++){
                   System.out.print(i+" ");
               }
               System.out.println();
   
           }
   
           
       }
   }
   