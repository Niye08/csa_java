public class XiaoMing extends Employee {
    public XiaoMing(String name, String number, MyDate birthday) {
        super(name, number, birthday);
    }

    public double earnings()// 加工一下，改成年龄越大的工资越高，月收入=(2024-出生年）/100*20000；
    {
        int currentYear = 2024;
        int OfWorked = currentYear - this.getBirthday().getYear();
        return OfWorked * 200;
    }
}