package lt.baltictalents.exercises.bt14;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lemda {
    public static void main(String[] args) {
        System.out.println(equalsNot("This is not"));
        System.out.println(equalsNot("This is notnot"));
        System.out.println(equalsNot("noisxxnotyynotxisi"));
        System.out.println(equalsNot( null ));
        System.out.println(equalsNot( "" ));

    }

    private static boolean equalsNot(String s) {

        if (s == null) {
            return false;
        }

        int count1 = 0, count2 = 0;
        Pattern pattern = Pattern.compile( "is" );
        Matcher match = pattern.matcher( s );

        while(match.find())
        count1++;

        Pattern pattern2 = Pattern.compile( "not" );
        match = pattern2.matcher( s );

        while(match.find())
        count2++;

        if (count1 == count2)
            return true;
        else
            return false;
    }
}
