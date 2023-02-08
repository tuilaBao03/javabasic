package Chain;
import java.util.Scanner;
public class bai19 {
    
    public static void main(String[] args) {
        String chain;
        char sign;
        int m=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter chain: ");
        chain = sc.nextLine();
        System.out.println("Enter sign: ");
        sign = sc.nextLine().charAt(0);
        char arraychain[]= chain.toCharArray();
        sc.close();
        for(int i=0;i<chain.length();i++){
            if(arraychain[i]==sign){
                m=m+1;
              
            }

        }
        if(m==0){System.out.println("there are 0 sign "+ sign+ " in array");}
        else{
            System.out.println("There are "+ m + " sign " +sign+" appear in array" );
        }


    }
}
