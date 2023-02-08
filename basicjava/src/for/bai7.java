/*
 Bài tập 7:
Viết chương trình để nhập nhập một số nguyên, tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.
 */
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        System.out.println("enter positive integer n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n<=1){
            System.out.println("you have entered the wrong  ");
            System.out.println("please enter again !");
            n = sc.nextInt(); 
        }
        sc.close();
        for(int i =0; i<=20; i++){
            System.out.println("The result of the calculation:"+ n +"*" + i +"="+ (n*i));
        }
    }
    
}
