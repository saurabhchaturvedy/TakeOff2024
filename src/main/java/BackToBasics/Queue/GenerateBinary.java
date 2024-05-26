package BackToBasics.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {


    private String[] generateBinary(int num) {

        String[] str = new String[num];

        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 0; i < num; i++) {

            str[i] = queue.poll();

            String s1 = str[i] + "0";
            String s2 = str[i] + "1";

            queue.offer(s1);
            queue.offer(s2);
        }

        return str;
    }


    public static void main(String[] args) {


        int num = 3;

        GenerateBinary generateBinary = new GenerateBinary();

        String[] strings = generateBinary.generateBinary(num);

        for (String x : strings) {
            System.out.print(x + " ");
        }
    }
}
