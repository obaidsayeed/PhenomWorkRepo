import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringTokenizerAndJoinerExample {
    public static void main(String args[]){

        //StringTokenizer class in Java is used to break a string into tokens.
        StringTokenizer str = new StringTokenizer("String Tokenizer Example");

        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }

        //Java added a new final class StringJoiner in java.util package. It is used to construct a sequence of characters separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. You can also pass prefix and suffix to the char sequence.
        StringJoiner str1 = new StringJoiner(" ");

        str1.add("String");
        str1.add("Joiner");
        str1.add("Example");

        System.out.println(str1);
    }
}
