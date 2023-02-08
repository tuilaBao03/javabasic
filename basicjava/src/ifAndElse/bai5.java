package ifAndElse;
/*
Bài tập 5*:
Viết chương trình cho phép người dùng nhập vào mã số sinh viên
Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
 */
import java.util.Scanner;;
public class bai5 {
    public static void main(String[] args) {
        String MSSV;
        System.out.println("nhap MSV: ");
        Scanner sc = new Scanner(System.in);

        MSSV = sc.nextLine();// nhap 1 chuoi tu ban phim
        sc.close();
        if(MSSV.matches("B\\d{7}"))System.out.println("phu hop");
        else System.out.println("khong phu hop");
    }
    
} 
