package Strings;

public class Substring {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));
    }

    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}
