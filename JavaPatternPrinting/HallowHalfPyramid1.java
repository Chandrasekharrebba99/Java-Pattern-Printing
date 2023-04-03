import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("*");
        for (int i = 1;i<num-1;i++){
           
            String space = "  ".repeat(i-1);
            System.out.println("* "+space+"*");
        }
        String star = "* ".repeat(num);
        System.out.println(star);
    }
}