package lt.baltictalents.exercises.bt8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> one = new ArrayList<>(  );
        one.add(1);
        one.add(2);
        one.add(3);

        List<Integer> two = new ArrayList<>(  );
        two.add(6);
        two.add(8);
        two.add(-6);
        two.add(-8);
        two.add(1);

        List<Integer> three = new ArrayList<>(  );

        square(one);
        square(two);
        square(three);
        square( null );

    }

    static void square(List<Integer> list) {
        if (list != null)
        System.out.println(list.stream().map( i -> i*i ).collect( Collectors.toList() ));
    }
}
