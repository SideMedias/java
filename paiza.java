import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for(int i=0;i<line.length()+2;i++){
            System.out.print("+");
        }
        System.out.println("\n+"+line+"+");
        for(int i=0;i<line.length()+2;i++){
            System.out.print("+");
        }
    }
}
