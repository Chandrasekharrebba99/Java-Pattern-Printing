import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<num+1;i++){
            String space = " ".repeat(num-i);
            String star = "* ".repeat(i);
            System.out.println(space+star);
        }
         for(int i=1;i<num+1;i++){
            String space = " ".repeat(i);
            String star = "* ".repeat(num-i);
            System.out.println(space+star);
        }
      
        
    }
}