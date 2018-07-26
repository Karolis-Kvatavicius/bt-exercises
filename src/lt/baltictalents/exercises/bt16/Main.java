package lt.baltictalents.exercises.bt16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(6, 3, 1, 4);
        List<Integer> list2 = List.of(1, 5, 7);
        List<Integer> list3 = List.of(2);

        System.out.println(square56(list1));
        System.out.println(square56(list2));
        System.out.println(square56(list3));
        System.out.println(square56(null));
        System.out.println(square56(new ArrayList<>(  ) ));
    }

    private static List<Integer> square56(List<Integer> list) {

        if (list == null)
          return list;

        return  list.stream().map( i -> i*i + 10 ).filter( i -> i % 10 != 5 && i % 10 != 6 ).collect( Collectors.toList() );

    }
}
