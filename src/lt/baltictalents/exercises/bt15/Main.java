package lt.baltictalents.exercises.bt15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>(  );
        one.add("aaa");
        one.add("bbb");
        one.add("aza");

        List<String> two = new ArrayList<>(  );
        two.add("hziz");
        two.add("hzello");
        two.add("hi");

        List<String> three = new ArrayList<>(  );
        three.add("hello");
        three.add("howz");
        three.add("are");
        three.add("youz");

        System.out.println(noZ(one));
        System.out.println(noZ(two));
        System.out.println(noZ(three));
    }

    static List<String> noZ(List<String> list) {
      return list.stream().filter( s -> !s.contains( "z" ) ).collect( Collectors.toList() );
    }
}
