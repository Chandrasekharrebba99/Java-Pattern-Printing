import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        
        String star = "-".repeat(num2);
        System.out.println("+"+star+"+");
        for(int i=0;i<num;i++){
            String space = " ".repeat(num2-1);
            System.out.println("| "+space+"|");
        }
       System.out.println("+"+star+"+");
        
    }
}