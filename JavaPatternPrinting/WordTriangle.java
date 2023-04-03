import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String la= "  ".repeat(T-1);
        System.out.println(la+"*");
        
        int Tn = T-1;
        for (int i=1;i<Tn;i++){
        
            String innerSpace= "  ".repeat(T-i-1);
            System.out.println(innerSpace+"* "+spacestart+"*");
        }
        String n = "* ".repeat(T);
        System.out.println(n);
        
    }
}