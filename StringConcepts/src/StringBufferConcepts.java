public class StringBufferConcepts {
    public static void main(String args[]){
        //StringBuffer(): It reserves room for 16 characters without reallocation
        StringBuffer s1 = new StringBuffer();

        //StringBuffer( int size): It accepts an integer argument that explicitly sets the size of the buffer.
        StringBuffer s2 = new StringBuffer(32);

        //StringBuffer(String str): It accepts a string argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.
        StringBuffer s3 = new StringBuffer("Hello World");

        //Methods of StringBuffer

        //Getting the length of the string
        System.out.println("Length of the string s3 is : " + s3.length());

        // Getting the capacity of the string
        System.out.println("Capacity of the string s3 is " + s3.capacity());

        // append() method is used to add text to the end of the existing string
        s3.append(" Bye World");
        System.out.println("String s3 after appending bye world is " + s3);

        //insert() method is used to insert text at the specified index position.
        s3.insert(20,"!");
        System.out.println("String s3 after using insert() method : " + s3);

        //reverse() method can reverse the characters within a StringBuffer object
        s3.reverse();
        System.out.println("String s3 after using reverse() method : " + s3 );
        s3.reverse();

        //delete() method is used to delete sequence of characters from starting to ending index
        s3.delete(12,19);
        System.out.println("String s3 after using delete() method : " + s3);

        //replace() method is used to replace sequence of words from starting to ending - 1 index
        s3.replace(0,5,"HELLO");
        System.out.println("String s3 after using replace() method : " + s3);
    }
}
