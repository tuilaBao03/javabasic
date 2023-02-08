package ifAndElse;
/*
 * Bài tập 4:


Viết chương trình cho phép nhập vào 3 số
Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
 */
import java.util.Scanner;;
public class bai4 {
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
        if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b){
            System.out.println("day la tam giac vuong "); 
        }
        else{
            System.out.println("ko phai tam giac");
        }

    }
}
