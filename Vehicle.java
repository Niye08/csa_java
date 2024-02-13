/*题目二: 汽车类
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
5000kg，如果超载了，需要输出提⽰信息*/
public class Vehicle {
    String brand;
    String color;
    int speed;
    int wheels;

    public Vehicle(String brand, String color, int speed, int wheels) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.wheels = wheels;
    }

    public void display() {
        System.out.println("车的品牌是：" + this.brand);
        System.out.println("车的颜色是：" + this.color);
        System.out.println("现在的速度是：" + this.speed);
        System.out.println("车轮的个数是：" + this.wheels);
    }
}