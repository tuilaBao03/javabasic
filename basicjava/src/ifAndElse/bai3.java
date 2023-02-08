package ifAndElse;
/*Bài tập 3:


Viết chương trình cho phép nhập vào 3 số thực
Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.*/
import java.util.Scanner;;
public class bai3 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("nhap 3 so nguyen duong");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        a = sc.nextInt();
        b = sc1.nextInt();
        c = sc2.nextInt();
sc.close();
sc1.close();
sc2.close();
        if(a + b > c && a+c >b && b+c >a){
            System.out.println("day la tam giac"); 
        }
        else{
            System.out.println("ko phai tam giac");
        }

    }
}
