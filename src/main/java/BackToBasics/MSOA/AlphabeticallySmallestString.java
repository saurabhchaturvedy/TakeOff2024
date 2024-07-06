package BackToBasics.MSOA;

public class AlphabeticallySmallestString {


    public String alphaString(String str) {

        String smallest = str.substring(1);

        for (int i = 1; i < str.length(); i++) {
            String current = str.substring(0, i) + str.substring(i + 1);

            if (current.compareTo(smallest) < 0) {

                smallest = current;
            }

        }

        return smallest;
    }

    public static void main(String[] args) {


        String str = "acb";

        AlphabeticallySmallestString alphabeticallySmallestString = new AlphabeticallySmallestString();

        System.out.println(alphabeticallySmallestString.alphaString(str));

        String str2 = "hot";

        System.out.println(alphabeticallySmallestString.alphaString(str2));

        String str3 = "codility";

        System.out.println(alphabeticallySmallestString.alphaString(str3));
    }
}
