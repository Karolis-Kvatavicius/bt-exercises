package lt.baltictalents.exercises.bt13;

public class Main {
    public static void main(String[] args) {

        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
        System.out.println(plusOut( null, null ));
        System.out.println(plusOut( "", "a" ));
        System.out.println(plusOut( "adasd", "" ));
        System.out.println(plusOut( "", "" ));
        // TODO 13 comes through as 31, need to ban this
        System.out.println(plusOut( "13231", "31" ));

    }

    private static String plusOut(String s1, String s2) {

        if (s1 == null || s2 == null) {
            return null;
        } else if (s1.length() == 0 || s2.length() == 0) {
            return s1;
        } else {
            return s1.replaceAll( "[^" + s2 + "]", "+" );
        }

    }
}
