package arra;

public class Class {

    public static void main(String[] args) {

        String str = "JavaSelenium";
        System.out.println("Original string" + str);

        int len = str.length();
        System.out.println("Length of the string: " + len);

        char ch = str.charAt(4);
        System.out.println("Character at index 4:" + ch);

        String sub1 = str.substring(5);
        System.out.println("Substring 5:" + sub1);

        String sub2 = str.substring(2, 7);
        System.out.println("Substring:" + sub2);


        int indexOfChar = str.indexOf('S');
        System.out.println("Index of  'S': " + indexOfChar);

        int indexOfString = str.indexOf("len");
        System.out.println("Index of substring:" + indexOfString);

        int lastIndexOf = str.lastIndexOf("a");
        System.out.println("Last index of substring:" + lastIndexOf);

        boolean containsCheck = str.contains("Selenium");
        System.out.println("Contains:" + containsCheck);

        boolean startsWithCheck = str.startsWith("Ja");
        System.out.println("Starts with:" + startsWithCheck);

        boolean endsWithCheck = str.endsWith("  ");
        System.out.println("Ends with:" + endsWithCheck);


        String replacedChar = str.replace('a', '@');
        System.out.println("After replacing:" + replacedChar);

        String replacedText = str.replace("Java", "Python");
        System.out.println("After replacing: " + replacedText);

        String replacedAll = str.replaceAll("i.", "X");
        System.out.println("After replaceAll:" + replacedAll);

        String replacedFirst = str.replaceFirst("e.", "Y");
        System.out.println("After replaceFirst:" + replacedFirst);
        
        String str2 = "Java";
        String result = str.concat(str2);
        System.out.println("After concatenation: " + result);

        System.out.println();
    }
}
