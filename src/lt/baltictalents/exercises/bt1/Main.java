package lt.baltictalents.exercises.bt1;

public class Main {
    public static void main(String[] args) {
        extraFront("Hello");
        extraFront("ab");
        extraFront("H");
        extraFront( "" );
        extraFront( null );

    }

    private static void extraFront(String s) {
        if(s != null && s.length() > 1)
            System.out.println(s.substring( 0, 2 ) + s.substring( 0, 2 ) + s.substring( 0, 2 ));
        else
            System.out.println(s + s + s);
    }
}
