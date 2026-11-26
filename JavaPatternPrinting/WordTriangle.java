import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T <= 0) {
            return;
        }
        String la= "  ".repeat(T-1);
        System.out.println(la+"*");
        
        int Tn = T-1;
        for (int i=1;i<Tn;i++){
        
            String innerSpace= "  ".repeat(T-i-1);
            String spacestart = "  ".repeat(i - 1);
            System.out.println(innerSpace+"* "+spacestart+"*");
        }
        if (T > 1) {
            System.out.println("* ".repeat(T));
        }
        
    }
}
