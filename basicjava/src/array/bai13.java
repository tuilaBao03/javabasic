package array;
import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {
        int n;
        System.out.println("nhap so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a;
        a = new int[n+1];
        for(int i = 0;i<=n;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int m=a[0];

        for(int i=0;i<=n;i++){

            if(a[i]<=m);
            m=a[i];
        }
        System.out.println("min is :"+ m);



    }
}
