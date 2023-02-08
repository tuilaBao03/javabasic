/*
Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này có xuất hiện số hay không.
Nếu có tin ra “Có”, ngược lại, in ra “Không”.
 */
package Chain;
import java.util.Scanner;
public class bai18 {
    public static void main(String[] args) {
        String chain;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter chain: ");
        chain = sc.nextLine();
        sc.close();
        
            if(chain.matches(".*\\d.*")){
                System.out.println("yes");
            }
        else System.out.println("no");
    }
}
