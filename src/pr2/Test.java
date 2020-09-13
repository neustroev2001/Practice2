package pr2;

public class Test {
    public static void main(String[] args) {
        Ball ball = new Ball("Резина", 200, "Зелёный");
        System.out.println(ball.toString());

        Book book = new Book("Толстой", 500, 350);
        System.out.println(book.toString());
    }
}
