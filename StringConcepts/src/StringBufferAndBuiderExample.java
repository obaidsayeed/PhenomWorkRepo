public class StringBufferAndBuiderExample {
    public static void main(String arg[]) {
        //StringBuffer is a peer class of String that provides much of the functionality of strings. The string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
        StringBuffer str = new StringBuffer("String Buffer Example");
        System.out.println(str);

        //The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternate to String Class, as it creates a mutable sequence of characters.
        StringBuilder str1 = new StringBuilder();
        //append joins string at the end of the existing string
        str1.append("String Builder Example");
        System.out.println(str1);
    }
}
