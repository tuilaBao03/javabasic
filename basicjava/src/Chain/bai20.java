/*
Viết chương trình cho phép người dùng nhập vào 1 chuỗi, kiểm tra chuỗi này có phù hợp với yêu cầu hay không.
Nếu có thì in ra “Duyệt!”, ngược lại in ra “Không duyệt”.
Yêu cầu về chuỗi là: Có độ dài không quá 20 ký tự, không được chứa ký tự khoảng trắng, bắt đầu bằng một ký tự chữ viết hoa (A - Z), kết thúc bằng một số (0 - 9). (Sử dụng biểu thức chính quy để ràng buộc định dạng)

 */
package Chain;
import java.util.Scanner;
public class bai20 {
    public static void main(String[] args) {
        String chain;
      
        int m=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter chain: ");
        chain = sc.nextLine();
        
        
        sc.close();
        
            if(!chain.matches("[A-Z]\\s{18}\\d")){
                m=m+1;
                System.out.println("ok");
            }

        
        
        else{
            System.out.println("not" );
        }


    }
}
