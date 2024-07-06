package BackToBasics.MSOA;

import java.util.LinkedList;
import java.util.Queue;

public class TrimMessage {


    public String trimMessage(String message, int k) {

        if (message.length() < k) {
            return message;
        }


        String[] words = message.split(" ");
        int len = 0;
        LinkedList<String> trimmedMessage = new LinkedList<>();

        for (String word : words) {

            int currentLength = word.length();

            if (len < k) {

                if (trimmedMessage.isEmpty()) {

                    trimmedMessage.add(word);
                    len += currentLength;
                } else {

                    trimmedMessage.add(" " + word);
                    len += currentLength + 1;
                }


            } else {

                break;
            }
        }


        while (len + 4 > k) {

            String word = trimmedMessage.pollLast();
            len -= word.length();
        }


        if (!trimmedMessage.isEmpty()) {

            trimmedMessage.add(" ...");
        } else {

            trimmedMessage.add("...");
        }


        StringBuilder sb = new StringBuilder();

        for (String word : trimmedMessage) {
            sb.append(word);
        }

        return sb.toString();
    }


    public static void main(String[] args) {


        String message = "And now here is my secret";

        TrimMessage trimMessage = new TrimMessage();

        System.out.println(trimMessage.trimMessage(message, 15));
    }
}
