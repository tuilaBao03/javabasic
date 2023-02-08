/*
Bài tập 11:

Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này
 */
package array;
import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) {
        int n;// nhập n: nhập vào số phần tủ
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter n : ");
        n = sc.nextInt();
        while(n<=1){
            System.out.println(" You have entered the wrong \n Enter again : ");
            n = sc.nextInt();
        }
        int[] a;
        a = new int[n];

        for(int i=0;i<n;i++){ // nhập dữ liêu của từng ô giống C
            System.out.println(" \n Number "+i+"th is :");
            a[i] = sc.nextInt();

        }
        sc.close();
        int t=0;
        for (int i=0;i<n;i++){
            t= t + a[i];
        }
        System.out.println("Average is : "+(t/n));
    }
}
