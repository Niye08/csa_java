import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        double score = scanner.nextDouble();
        if (score >= 0 && score <= 100) {
            System.out.println("你的成绩是：" + score);
        } else {
            System.out.println("请输入正确有效的成绩。");
        }
        scanner.close();
    }
}