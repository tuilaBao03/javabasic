package ifAndElse;
/*Bài tập 1:


Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.*/

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        int n;
        System.out.println("nhap 1 so nguyen");
        Scanner me = new Scanner(System.in);
        n = me.nextInt();
         if (n>=0){
            System.out.println("so nguyen duong");
         }
         else{
            System.out.println("day la so nguyen am");
         }
me.close();
        
    }
}
