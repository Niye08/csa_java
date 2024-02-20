public abstract class Employee {// 包含abstract方法，所以是abstract类
    private String name;
    private String number;
    private MyDate birthday;

    public Employee(String name, String number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract double earnings();// 收入(题目要求未说明)

    public String toString() {
        return "Employee{" +
                "name='" + name + ' ' +
                ", number='" + number + ' ' +
                ", birthday=" + (birthday != null ? birthday.toString() : "null") +
                '}';
    };// 输出对象的 name,number 和 birthday(如果生日不为空)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}