import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1;i<=num;i++){
            String star = "* ".repeat(i);
            System.out.println(star);
        }
        for (int i = 1;i<=num;i++){
            String star = "* ".repeat(num-i);
            System.out.println(star);
        }
        
    }
}