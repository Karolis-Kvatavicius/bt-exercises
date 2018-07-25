package lt.baltictalents.exercises.bt10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>(  );
        list1.add( 1 );
        list1.add( 2 );
        list1.add( 19 );

        List<Integer> list2 = new ArrayList<>(  );
        list2.add( 9 );
        list2.add( 19 );
        list2.add( 29 );
        list2.add( 3 );

        List<Integer> list3 = new ArrayList<>(  );
        list3.add( 1 );
        list3.add( 2 );
        list3.add( 3 );

        List<Integer> list4 = new ArrayList<>();

        System.out.println(no9(list1));
        System.out.println(no9(list2));
        System.out.println(no9(list3));
        System.out.println(no9(list4));
        System.out.println(no9(null));

    }

    private static List<Integer> no9(List<Integer> numbers) {

        if (numbers == null) {
            return null;
        }

        numbers.removeIf(n -> n == 9 || n % 10 == 9);

        return numbers;

    }
}
