package Constructor;

public class Books {
    private static Object Books;

    public static void main(String[] args) {
        Book book1 = new Book("Программирование", "Алексей Иванов", "Java", 15.0);
        Book book2 = new Book("Уроки истории", "Сергей Сергеев", "HQ History", 150.0);
        Book book3 = new Book("Самоучитель Нидерландского языка", "Irene Snejder", "Netherlands", 150.0);
        String bookName = book1.getName();
        String bookAuthor = book1.getAuthor();
        String bookPublisher = book1.getPublisher();
        double bookPrice = book1.getPrice();
    }
}

class Book{
    private String name;
    private String author;
    private String publisher;
    private double price;

    public Book(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String Publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        if (price > 10) {
            return price;
        } else {
            System.out.println("Цена должна быть больше 10!");
        }
        return 10;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println(this.name + this.author + this.publisher + this.price);
    }
}
