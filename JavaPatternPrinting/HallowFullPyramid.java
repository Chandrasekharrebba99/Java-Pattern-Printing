import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String outspas = " ".repeat(num-1);
        System.out.println(outspas+"*");
        for (int i = 1;i<num-1;i++){
           String outspa = " ".repeat(num-i-1);
            String space = "  ".repeat(i-1);
            System.out.println(outspa+"* "+space+"*");
        }
        String star = "* ".repeat(num);
        System.out.println(star);
    }
}