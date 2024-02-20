public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day)// 注意区分构造函数与后面的setter，setter为修改，构造函数为初始赋值
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}