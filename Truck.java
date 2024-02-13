public class Truck extends Vehicle {
    private int loader;// 实载人数
    private float payload;// 载重量

    public Truck(String brand, String color, int speed, int wheels, int loader, float payload) {
        super(brand, color, speed, wheels);// 继承父类的构造方法
        this.loader = loader;
        this.payload = payload;
    }

    public void truckdisplay() {
        super.display();
        System.out.println("这是一辆卡车,能载3人,实载" + this.loader + "人");
        if (loader > 3) {
            System.out.print("你超员啦!!!");
        }
        System.out.println("这是一辆卡车,核载5000kg,您已装载" + this.payload + "kg");
        if (payload >= 5000) {
            System.out.println("你超载啦!!!");
        }
    }

    public void start() {
        System.out.println("Truck is started");// 开始
    }

    public void accelerate(int speed) {
        System.out.println("Truck is accelerating at speed " + speed + " km/h");// 加速
        this.speed = speed;
    }

    public void brake() {
        System.out.println("Truck is braking");// 刹车
        this.speed = 0;
    }
}