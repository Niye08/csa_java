public class Car extends Vehicle {
    private int loader;// 实载人数

    public Car(String brand, String color, int speed, int wheels, int loader) {
        super(brand, color, speed, wheels);// 继承父类的构造方法
        this.loader = loader;
    }

    public void cardisplay() {
        super.display();
        System.out.println("这是一辆小车,能载6人,实载" + this.loader + "人");
        if (this.loader > 6) {
            System.out.println("你超员啦!!!");
        }
    }

    public void start() {
        System.out.println("Car is started");// 开始
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed " + speed + " km/h");// 加速
        this.speed = speed;
    }

    public void brake() {
        System.out.println("Car is braking");// 刹车
        this.speed = 0;
    }
}