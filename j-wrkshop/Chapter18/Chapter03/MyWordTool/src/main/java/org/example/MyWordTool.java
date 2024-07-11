package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyWordTool {

    public MyWordTool() {
    }

    public int myWordCount(String s) {
        int count = 0;
        if (!(s == null) || (s.isEmpty())) {
            String[] w = s.split("\\s+"); // regex split by whitespace chars
            count = w.length;
        }
        return count;
    }

    public int mySymbolCount(String s, boolean withSpaces) {
        int count = 0;
        if (!(s == null) || (s.isEmpty())){
            if(withSpaces) {
                count = s.length();
            } else {
                count = s.replace(" ", "").length();
            }
        }
        return count;
    }

    public int myWhiteSpaceCount(String s) {
        int count =0;
        if (!(s == null) || (s.isEmpty())) {
            int withSpaces = s.length();
            int withoutSpaces = s.replace(" ", "").length();
            count = withSpaces - withoutSpaces;
        }
        return count;
    }

    public int getFrequency(String s, char c) {
        int count =0;
        if (!(s == null) || (s.isEmpty())) {
            count = s.length() - s.replace(Character.toString(c), "").length();
        }
        return count;
    }



    public static void main(String[] args) {
        MyWordTool myWordTool = new MyWordTool();
        String text = "hello mother, hello father";
        System.out.println("text passed to method is - \'" + text + "\'");
        System.out.printf("myWordCount - count of words in given str = %d",myWordTool.myWordCount(text));
        System.out.println();
        System.out.printf("mySymbolCount - count of chars in given str, inc whitespaces = %d", myWordTool.mySymbolCount(text, true));
        System.out.println();
        System.out.printf("mySymbolCount - count of chars in given str, excl whitespaces = %d", myWordTool.mySymbolCount(text, false));
        System.out.println();
        System.out.printf("myWhiteSpaceCount - count of whitespaces in given str = %d", myWordTool.myWhiteSpaceCount(text));
        System.out.println();
        System.out.printf("getFrequency - count of char in given str = %d", myWordTool.getFrequency(text, 'h'));

    }
}
