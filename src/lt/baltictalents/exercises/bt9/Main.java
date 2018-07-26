package lt.baltictalents.exercises.bt9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(  );
        list1.add( "" );
        list1.add( "klmjkhbhgcffvjyukhnlk" );
        list1.add( "*" );


        System.out.println(addStar( list1 ));
        System.out.println(addStar( new ArrayList<>(  ) ));
        System.out.println(addStar( null ));
    }

    private static List<String> addStar(List<String> list) {
       if (list == null)
           return list;

       return list.stream().map( s -> s += "*").collect( Collectors.toList() );
    }
}
