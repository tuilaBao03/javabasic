/*Bài tập 9:
Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra số Fibonacci ứng với nó.
Số Fibonacci là số mà nó bằng tổng của 2 số Fibonacci trước nó.
Với giả thuyết là Fi(0) = 1, Fi(1) = 1.
 */
import java.util.Scanner;
 class Fibonacci 
{
    public int number(int i) {
    
if(i== 1||i == 2) return 1;
return number(i-1) + number(i-2);
}


}
public class bai9 {
    public static void main(String[] args) {
        int n;
        int Fi;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        Fibonacci fibonacci =  new Fibonacci();
        Fi = fibonacci.number(n);
        sc.close();

System.out.println("Fi("+ n + ") =" + Fi);
        

    }
    
}
