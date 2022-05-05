import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringConstructors {
    public static void main(String args[]){
        //b_arr contains ascii values of letters
        byte[] b_arr = {71, 101, 101, 107, 115};

        //Construct a new String by decoding the byte array. It uses the platform’s default character set for decoding.
        String s1 = new String(b_arr);
        System.out.println("Constructor type1: " + s1);

        //Construct a new String by decoding the byte array. It uses the char_set for decoding.
        Charset chs = Charset.defaultCharset();
        String s2 = new String(b_arr,chs);
        System.out.println("Constructor type2: " + s2);

        //Construct a new String by decoding the byte array. It uses the char_set_name for decoding.
        //It looks similar to the above constructs and they appear before similar functions but it takes the String(which contains char_set_name) as parameter while the above constructor takes CharSet.
        String s3 = new String(b_arr, StandardCharsets.US_ASCII);
        System.out.println("Constructor type3: " + s3);

        //Construct a new string from the bytes array depending on the start_index(Starting location) and length(number of characters from starting location).
        String s4 = new String(b_arr,1,3);
        System.out.println("Constructor type4: " + s4);

        //Construct a new string from the bytes array depending on the start_index(Starting location) and length(number of characters from starting location).Uses char_set for decoding.
        String s5 = new String(b_arr,1,3,chs);
        System.out.println("Constructor type5: " + s5);

        //Construct a new string from the bytes array depending on the start_index(Starting location) and length(number of characters from starting location).Uses char_set_name for decoding.
        String s6 = new String(b_arr,1,4,StandardCharsets.US_ASCII);
        System.out.println("Constructor type6: " + s6);

        char[] ch = {'H','E','L','L','O'};

        //Allocates a new String from the given Character array
        String s7 = new String(ch);
        System.out.println("Constructor type7: " + s7);

        //Allocates a String from a given character array but choose count characters from the start_index.
        String s8 = new String(ch,1,3);
        System.out.println("Constructor type8: " + s8);
    }
}
