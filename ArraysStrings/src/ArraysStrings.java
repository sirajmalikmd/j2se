import java.util.Arrays;

public class ArraysStrings {
    public static void main(String[] args){

        boolean isUnique = isUniqueChars("abcad");
        System.out.println("isUnique "+isUnique);

        boolean isPermutation = checkPermutation("derma" ,"armed");
        System.out.println("check permutation "+isPermutation);
    }

    private static boolean checkPermutation(String s ,String t) {
        if(s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    private static String sort(String s){
        char[] content=s.toCharArray();  Arrays.sort(content);
        return new String(content);
    }

    private static boolean isUniqueChars(String str){
    int checker = 0;
    for(int i=0; i<str.length(); i++)
    {
        int val = str.charAt(i) -'a';
        if( ( checker & (1<<val) ) > 0 )
        {
            return false;
        }
        checker |= (1<<val);
    }
        return true;
    }



/* isUniqueChars(String str)
This is a Java code snippet for a method called isUniqueChars, which takes a string as input and returns a boolean value
indicating whether the string contains all unique characters.
The implementation uses a bit vector, represented by the integer variable checker, to keep track of the occurrence of characters in the input string.
The loop iterates through each character in the string,
converts it to an integer value by subtracting the ASCII value of 'a',
and sets the corresponding bit in the bit vector using a bitwise OR operation.
(1<<val) -> 1 is shifted left with 'val' number of places
If a bit is already set in the bit vector, that means the corresponding character has already occurred in the string, and the method returns false.
Otherwise, the method continues to set the bit for the current character. If the loop completes without returning false, the method returns true.

Overall, this implementation has a time complexity of O(n), where n is the length of the input string, and a space complexity of O(1),
since it uses a fixed-size bit vector regardless of the size of the input string.
* */
}
