/* 
题目一: 图书类
题目描述： 创建一个 Book 类，包含书的属性（标题、作者、出版年等），以
及方法如 displayInfo() 用于显示书的信息。
输入：
• 用户通过方法调用模拟显示图书信息的操作。
输出：
• 调用 displayInfo() 方法后，输出书的详细信息，
例如：Title: Java Programming, Author: John Smith, Year: 2022
题目二: 汽车类
题目描述： 设计⼀个汽⻋类 Vehicle，包含的属性有品牌、颜色、速度、⻋轮
个数 wheels。
创建一个 Vehicle 的子类 Car 类，包含汽车的属性（载⼈数 loader），以及方
法如 start()、accelerate(int speed)、brake()。
创建一个 Vehicle 的子类 Truck 类，包含汽车的属性（载⼈数 loader 和载重
量 payload），以及方法如 start()、accelerate(int speed)、brake()。
输入：
• 用户通过方法调用模拟汽车的启动、加速和刹车操作。
输出：
• 在每个操作后，输出汽车的相关信息，例如："Car is started", "Car is 
accelerating at speed 60 km/h", "Car is braking".
• ⼩⻋的核载⼈数为 5 ⼈，卡⻋的核载⼈数为 3 ⼈，核载重量为
5000kg，如果超载了，需要输出提⽰信息
题目三: 计算器类
题目描述： 创建一个 Calculator 类，包含方法如 add(double a, double b)、
subtract(double a, double b)、multiply(double a, double b)、divide(double a, 
double b)。
输入：
• 用户通过方法调用模拟四则运算操作。
输出：
• 在每个操作后，输出计算结果，例如："Addition: 5.0", "Subtraction: 
2.0", "Multiplication: 10.0", "Division: 2.5".
题目四: 最长公共前缀
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1：
输入：strs = ["flower","flow","flight"]输出："fl"
示例 2：
输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀。*/
public class Main {
    public static void findpre(String[] strs) // regionMatches方法：用于比较两个字符串中指定区域的字符是否相等
    {
        String pre = strs[0];// 默认一开始的公共前缀是数组中第一个字符串
        for (int i = 1; i < strs.length; i++)// 逐一比较是否有公共前缀
        {
            while (pre.regionMatches(0, strs[i], 0, pre.length()) == false) // 如果当前公共前缀不在该字符串中
            {
                pre = pre.substring(0, pre.length() - 1);// string.substring(int beginIndex, int endIndex),注意不包含endindex
            }
        }
        if (pre.length() == 0) {
            System.out.println("\"\"");
        } else {
            System.out.println("\"" + pre + "\"");
        }
    }

    public static void main(String[] args) {
        // 第一题代码
        System.out.println("第一题输出：");
        Book book = new Book("Java Programming", "John Smith", "2022");
        book.displayInfo();
        // 第二题代码
        System.out.println("第二题输出：");
        Car mycar = new Car("大众", "black", 60, 4, 7);// 模拟汽车启动，加速，刹车
        mycar.cardisplay();
        mycar.start();
        mycar.accelerate(80);
        mycar.brake();
        Truck mytruck = new Truck("五菱", "white", 40, 4, 2, 3000);// 模拟卡车启动，加速，刹车
        mytruck.truckdisplay();
        mytruck.start();
        mytruck.accelerate(60);
        mytruck.brake();
        // 第三题代码
        System.out.println("第三题输出：");
        Calculator myCalculator = new Calculator(8, 4);
        double addition = myCalculator.add();
        double subtraction = myCalculator.subtract();
        double multiplication = myCalculator.multiply();
        double division = myCalculator.divide();
        System.out.println("Addition:" + addition);
        System.out.println("Substraction:" + subtraction);
        System.out.println("Mltiplication:" + multiplication);
        System.out.println("Division:" + division);
        // 第四题代码
        System.out.println("第四题输出：");
        String[] strs1 = { "flower", "flow", "flight" };
        findpre(strs1);
        String[] strs2 = { "dog", "racecar", "car" };
        findpre(strs2);
    }
}