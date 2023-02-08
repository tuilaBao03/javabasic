/*
 * Bài tập 16:
Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.
 */
package Chain;

import java.util.Scanner;
public class bai16 {
    
    public static void main(String[] args) {
        String chain;
        char sign;
        boolean exists = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your chain: ");
        chain = sc.nextLine();
        System.out.println("Enter sign, that need test: ");
        sign = sc.next().charAt(0);

        char singarray[] = chain.toCharArray();
        sc.close();
        for(int i=0;i<singarray.length;i++){
            if(sign == singarray[i]){
                System.out.println("exist");
                exists = true;
            }


        }
        if(exists== false) {System.out.println("not exist");}
    }
}
