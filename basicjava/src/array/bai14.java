/*
 * Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
Sắp xếp các phần tử trong mảng theo thứ tự ngược lại
 */
package array;
import java.util.Scanner;
public class bai14 {
    public static void main(String[] args) {
        
    
    int n;
    System.out.println("enter n: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] a;
    a= new int[n];
    for(int i=0;i<n;i++){
        System.out.println("number "+ (i+1) +"th is: ");
        
        a[i]= sc.nextInt();
    }
sc.close();
System.out.println("chao array is : ");
for(int i=n-1;i>=0;i--){
    System.out.println(a[i]);
}
    }
    
}
