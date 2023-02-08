/*
 Bài tập 6:
Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
 */
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        int n;
        int m=0;
        System.out.println("nhap so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        while(n<=0){
            System.out.println("nhap sai n phai luon hon hoac bang 0");
            System.out.println("moi nhap lai: ");
            n=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                m=m+i;
            }
        }
        System.out.println(m);
    }
}
