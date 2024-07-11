package BackToBasics.MSOA.Next.Logger;

public class ConsoleAppender implements Appender {

    Layout layout;

    ConsoleAppender(Layout layout) {

        this.layout = layout;
    }

    @Override
    public void append(String message) {

        System.out.println("Message :" + message);
    }
}
