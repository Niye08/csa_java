/*题目三: 计算器类
题目描述： 创建一个 Calculator 类，包含方法如 add(double a, double b)、
subtract(double a, double b)、multiply(double a, double b)、divide(double a, 
double b)。
输入：
• 用户通过方法调用模拟四则运算操作。
输出：
• 在每个操作后，输出计算结果，例如："Addition: 5.0", "Subtraction: 
2.0", "Multiplication: 10.0", "Division: 2.5".
*/
public class Calculator {
    double a;
    double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add()// 加
    {
        return this.a + this.b;
    }

    public double subtract()// 减
    {
        return this.a - this.b;
    }

    public double multiply()// 乘
    {
        return this.a * this.b;
    }

    public double divide()// 除
    {
        return this.a / this.b;
    }
}