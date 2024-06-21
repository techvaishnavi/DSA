import java.util.Scanner;
public class righttriangle {
    public static void main(String[] args) {
        int i,j;
        Scanner read= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= read.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
