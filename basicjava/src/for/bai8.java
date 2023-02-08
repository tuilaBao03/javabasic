import java.util.Scanner;

/* 
Bài tập 8:


Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
In ra tất cả số nguyên tố trong khoảng từ 0 - n.*/
public class bai8 {
    public static void main(String[] args) {
        int n;
        
        boolean songuyento = false;

        System.out.println("import your number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n<=0){
            System.out.println("you have entered the wrong, \n please, enter again !");
            n = sc.nextInt();

        }
        sc.close();
        System.out.println("Numbers are: \n1\n2");
        for(int i = 3; i<= n;i++){
            songuyento = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    songuyento = false;
                }
            }
            if(songuyento==true){
                System.out.println(i+" ");
        }

}

    }
}
