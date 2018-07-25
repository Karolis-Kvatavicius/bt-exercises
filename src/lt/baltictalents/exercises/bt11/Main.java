package lt.baltictalents.exercises.bt11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(  );
        list1.add( 1 );
        list1.add( 2 );
        list1.add( 3 );

        List<Integer> list2 = new ArrayList<>(  );
        list2.add( 2 );
        list2.add( 6 );
        list2.add( 11 );

        List<Integer> list3 = new ArrayList<>(  );
        list3.add( 0 );

        List<Integer> list4 = new ArrayList<>();

        System.out.println( two2( list1 ) );
        System.out.println( two2( list2 ) );
        System.out.println( two2( list3 ) );
        System.out.println( two2( list4 ) );
        System.out.println( two2( null ) );

    }

    private static List two2(List<Integer> list) {
        if (list != null)
        return list.stream().map( l -> l*2 ).filter( j -> j != 2 && j % 10 != 2 ).collect( Collectors.toList());
        else
        return null;
    }
}

