package lt.baltictalents.exercises.bt2;

public class Main {
    public static void main(String[] args) {
        lastChars("last", "chars");
        lastChars("yo", "java");
        lastChars("hi", "mark");
        lastChars("k", null);
        lastChars(null, null);
        lastChars("", "f");

    }

    private static void lastChars(String s1, String s2) {
        if (s1 == null || s1.length() == 0)
        s1 = "@";

        if (s2 == null || s2.length() == 0)
        s2 = "@";

        s1 =  s1.replaceAll(" ", "@" );
        s2 =  s2.replaceAll(" ", "@" );

        System.out.println(s1.substring( 0, 1 ) + s2.substring( s2.length() - 1 ));
    }
}
