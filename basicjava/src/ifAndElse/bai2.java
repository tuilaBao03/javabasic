package ifAndElse;
/*
 * Bài tập 2:


Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
VD: 1 -> Một, 2 -> Hai, …
 */
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
int n;
System.out.println("nhập 1 số nguyên n: ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
while(n>9 || n<0 ){
    System.out.println("nhap sai chi lay so tu 1 den 9\n moi nhap lai: ");
    n = sc.nextInt();
}
sc.close();
switch(n){
    case 0: System.out.println("khong"); break;
    case 1: System.out.println("Một"); break;
    case 2: System.out.println("Hai"); break;
    case 3: System.out.println("Ba"); break;
    case 4: System.out.println("Bốn"); break;
    case 5: System.out.println("Năm"); break;
    case 6: System.out.println("Sáu"); break;
    case 7: System.out.println("Bảy"); break;
    case 8: System.out.println("Tám"); break;
    case 9: System.out.println("Chín"); break;
    default:
    System.out.println("chi doc tu 1 den 9  thoi");
}
        
    }
 
}
