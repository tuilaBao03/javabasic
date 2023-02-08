/*
Bài tập 10*:


Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
 */
import java.util.Scanner;


public class bai10 {
    public static void main(String[] args) {
        String[] a = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
        a[i] = sc.nextLine();


    }
    sc.close();
    for(int i=0;i<5;i++){
        if(!a[i].matches("B170\\d{4}")) System.out.println("MSSV thu "+ (i+1)+ "sai dinh dang");


    }
  
}
}