import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String spa1 = " ".repeat(num-1);
        System.out.println(spa1+"/\\");
        for(int i=2;i<num+1;i++){
            String space = " ".repeat(num-i);
            String star = " ".repeat((2*i)-3);
            System.out.println(space+"/ "+star+"\\");
        }
         for(int i=1;i<num;i++){
            String space = " ".repeat(i-1);
            String star = " ".repeat((2*(num-i))-1);
            System.out.println(space+"\\ "+star+"/");
        }
        String spas = " ".repeat(((num*2)/2)-1);
        System.out.println(spas+"\\/");
    }
}