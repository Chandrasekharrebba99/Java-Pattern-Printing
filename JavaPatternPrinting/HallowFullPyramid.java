import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        sc.close();
        if (height <= 0) {
            return;
        }
        System.out.println(" ".repeat(height - 1) + "*");
        for (int row = 2; row < height; row++) {
            String indent = " ".repeat(height - row);
            String gap = " ".repeat(2 * row - 3);
            System.out.println(indent + "*" + gap + "*");
        }
        if (height > 1) {
            System.out.println("* ".repeat(height).trim());
        }
    }
}
