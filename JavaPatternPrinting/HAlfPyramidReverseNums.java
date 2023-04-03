import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int N = sc.nextInt();
        int num2 = num;
        ArrayList<Integer> names = new ArrayList<Integer>();
        for (int i = 1;i<N+1;i++){
          for (int j=1;j<=i;j++){
              names.add(num2);
              num2+=1;
        }
       
        }
        Collections.reverse(names);
        
        int hn = names.get(0);
        for (int i=1;i<=N;i++){
            for(int j =0;j<i;j++){
                System.out.print(hn+" ");
                hn-=1;
            }
            System.out.println();
        }
    }
}