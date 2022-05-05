import java.util.Locale;

public class StringMethods {
    public static void main(String args[]){
        String s1 = "HELLO WORLD";

        //int length(): Returns the number of characters in the String.
        System.out.println("Length of the string s1 is " + s1.length());

        //Char charAt(int i): Returns the character at ith index.
        System.out.println("Character at index ith is " + s1.charAt(3));

        //String substring (int i): Return the substring from the ith  index character to end.
        System.out.println("Substring is " + s1.substring(3));

        //String substring (int i, int j): Returns the substring from i to j-1 index.
        System.out.println("Substring starting from index ith and ending at index jth is " + s1.substring(4,7));

        //String concat( String str): Concatenates specified string to the end of this string.
        String s2 = "HELLO WORLD";
        System.out.println("Concatenated string is " + s1.concat(s2));

        //int indexOf (String s): Returns the index within the string of the first occurrence of the specified string.
        System.out.println("Index of word WORLD is " + s1.indexOf("WORLD"));

        //boolean equals( Object otherObj): Compares this string to the specified object.
        System.out.println("HELLO WORLD equals hello world : " + s1.equals("hello world"));

        //boolean  equalsIgnoreCase (String anotherString): Compares string to another string, ignoring case considerations.
        System.out.println("HELLO WORLD equals hello world if case is ignored : " + s1.equalsIgnoreCase("hello world"));

        //int compareTo( String anotherString): Compares two string lexicographically.
        System.out.println("0 means strings are equal, < 0 means s1 comes before s2, > 0 means s1 comes after s2 : " + s1.compareTo("GOODBYE WORLD"));

        //int compareToIgnoreCase( String anotherString): Compares two string lexicographically, ignoring case considerations.
        System.out.println("Same as compareTO() method but it ignores the case : " + s1.compareToIgnoreCase("goodbye world"));

        //String toLowerCase(): Converts all the characters in the String to lower case.
        System.out.println("toLowerCase() method converts HELLO WORLD into : " + s1.toLowerCase());

        //String toUpperCase(): Converts all the characters in the String to upper case.
        System.out.println("toUpperCase() method converts hello world into : " + "hello world".toUpperCase());

        //String trim(): Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
        System.out.println("trim() method converts  HELLO WORLD  into " + s1.trim());

        //String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
        System.out.println("Replaces one character in a string with another character : " + s1.replace('H','h'));
    }
}
