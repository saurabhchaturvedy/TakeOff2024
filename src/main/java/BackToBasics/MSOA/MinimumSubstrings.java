package BackToBasics.MSOA;

import java.util.HashSet;
import java.util.Set;

public class MinimumSubstrings {


    public int minimumSubstringCount(String str) {

        int n = str.length();

        if (n == 0) {
            return 0;
        }

        Set<Character> seen = new HashSet<>();
        int substringCount = 1;

        for (int i = 0; i < n; i++) {

            char c = str.charAt(i);

            if (seen.contains(c)) {

                substringCount++;
                seen.clear();
            }

            seen.add(c);
        }

        return substringCount;
    }


    public static void main(String[] args) {


        String str = "word";

        MinimumSubstrings minimumSubstrings = new MinimumSubstrings();

        System.out.println(minimumSubstrings.minimumSubstringCount(str));

        String str2 = "dddd";

        System.out.println(minimumSubstrings.minimumSubstringCount(str2));

        String str3 = "cycle";

        System.out.println(minimumSubstrings.minimumSubstringCount(str3));
    }
}
