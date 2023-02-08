/*
 * Bài tập 15(*):


Viết chương trình cho phép người dùng nhập vào 5 mã số, lưu 5 mã số này vào một mảng.
Chương trình sẽ kiểm tra xem trong 5 mã số này có mã số nào sai định dạng hay không (định dạng là “00yLxxxx” với y là số nguyên từ 2 - 5,
 x là số nguyên từ 0-9).
Nếu có bất kỳ mã số nào sai định dạng thì chương trình in ra “Sai rồi” rồi kết thúc chương trình, ngược lại thì in ra “Đúng rồi”. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

 */
package array;
import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("You can enter n in here: ");
        n= sc.nextInt();
        while(n<=0){
            System.out.println("you have entered the wrong ");
            n = sc.nextInt();
        }
        String[] a;
        a = new String[n];
        for(int i = 0;i<n;i++){
            a[i]=sc.nextLine();
        }
        sc.close();
        for(int i=0;i<5;i++){
            //System.out.println(a[i]);
            if(!a[i].matches("00[2-5]L\\d{4}")) {System.out.println(a[i] +" is id wrong");}
            else System.out.println(a[i]+"is id right");
        }
        
        
    }
}
