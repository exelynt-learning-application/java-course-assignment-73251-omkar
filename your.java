
public class ReverseString {
    public static void main(String[] args) {
        String str = "Akshay";
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev.toString());
    }
}
