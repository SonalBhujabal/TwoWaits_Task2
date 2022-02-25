class ReverseDemo {
    static int i = 0;

    // Recursive method to reverse a string in Java using a static variable
    private static void reverse(char[] str, int k) {
        // if the end of the string is reached
        if (k == str.length) {
            return;
        }

        // recur for the next character
        reverse(str, k + 1);

        if (i <= k) {
            char temp = str[k];
            str[k] = str[i];
            str[i++] = temp;
        }
    }

    public static String reverse(String str) {
        // base case: if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }

        // convert string into a character array
        char[] A = str.toCharArray();

        // reverse character array
        reverse(A, 0);

        // convert character array into the string
        return String.copyValueOf(A);
    }

    public static void main(String[] args) {
        String str = "Sonal Bhujabal";

        // string is immutable
        str = reverse(str);

        System.out.println("The reverse of the given string is: " + str);
    }
}
