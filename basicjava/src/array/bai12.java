/*
 * Bài tập 12:
Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
 */
package array;
import java.util.Scanner;
public class bai12 {
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

            if(a[i]>m);
            m=a[i];
        }
        System.out.println("max is :"+ m);



    }
}
