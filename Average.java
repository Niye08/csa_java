import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N;
        while (true) {
            System.out.println("请输入一个整数N(N>0):");
            N = scanner.nextInt();
            if (N > 0) {
                break;
            } else {
                System.out.println("N 必须是正数或者 0");
            }
        }
        System.out.println("你需要输入" + N + "个整数。");
        for (int i = 1; i <= N; i++) {
            System.out.println("请输入第" + i + "个整数：");
            int element = scanner.nextInt();
            l.add(element);
        }
        scanner.close();
        int sum = 0;
        for (Integer item : l) {
            sum += item;
        }
        double average = (double) sum / N;
        System.out.println("这" + N + "个整数的平均值为：" + average);
    }
}