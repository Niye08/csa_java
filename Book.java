/*题目一: 图书类
题目描述： 创建一个 Book 类，包含书的属性（标题、作者、出版年等），以
及方法如 displayInfo() 用于显示书的信息。
输入：
• 用户通过方法调用模拟显示图书信息的操作。
输出：
• 调用 displayInfo() 方法后，输出书的详细信息，
例如：Title: Java Programming, Author: John Smith, Year: 2022*/
public class Book// 定义一个book类
{
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) // book的构造函数，包含在类的声明中
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Title:" + title + ",Author:" + author + ",Year:" + year);
    }
}
