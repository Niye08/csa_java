import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入该员工的名字:");
        String name = scanner.nextLine();
        System.out.println("请输入该员工的工号:");
        String number = scanner.nextLine();
        System.out.println("请输入该员工的出生年份:");
        int year = scanner.nextInt();
        System.out.println("请输入该员工的出生月份:");
        int month = scanner.nextInt();
        System.out.println("请输入该员工的出生日期:");
        int day = scanner.nextInt();
        scanner.close();
        MyDate birthday = new MyDate(year, month, day);
        XiaoMing xiaoming = new XiaoMing(name, number, birthday);
        System.out.println(xiaoming.getName() + "一个月的工资是:" + xiaoming.earnings());
        xiaoming.toString();
    }
}