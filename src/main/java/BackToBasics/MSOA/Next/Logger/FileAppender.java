package BackToBasics.MSOA.Next.Logger;

public class FileAppender implements Appender {


    Layout layout;
    String filePath;

    FileAppender(Layout layout, String filePath) {

        this.layout = layout;
        this.filePath = filePath;
    }


    @Override
    public void append(String message) {

        System.out.println("File path : " + this.filePath + " message " + message);
    }
}
