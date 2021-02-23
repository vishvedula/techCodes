/*
This problem was asked by Amazon.
Given a string s and an integer k, break up the string into multiple texts such that each text has a
length of k or less. You must break it up so that words don't break across lines. If there's no way to
break the text up, then return null.
You can assume that there are no spaces at the ends of the string and that there is exactly one
space between each word.
For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you
should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a
length of more than 10.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AmazonBreakString {

    public static void main(String[] args) {
        List<String> res = splitIntoWords("Vishal Vedula",7);
        System.out.println(res != null ? Arrays.toString(res.toArray(new String[0])) : null);
    }

    public static List<String> splitIntoWords(String str, int k) {
        String[] words = str.split("\\s+");
        List<String> res = new ArrayList<>(words.length);
        StringBuilder buf = null;

        for (String word : words) {
            if (word.length() > k)
                return null;
            if (buf == null)
                buf = new StringBuilder(word);
            else if (buf.length() + word.length() + 1 <= k)
                buf.append(' ').append(word);
            else {
                res.add(buf.toString());
                buf = new StringBuilder(word);
            }
        }

        if (buf != null)
            res.add(buf.toString());

        return res;
    }

}
