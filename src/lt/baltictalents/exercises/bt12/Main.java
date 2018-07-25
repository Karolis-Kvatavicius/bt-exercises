package lt.baltictalents.exercises.bt12;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>(  );
        map.put( "a", "aaa" );
        map.put( "b", "aaa" );
        map.put( "c", "cake" );

        TreeMap<String, String> map2 = new TreeMap<>(  );
        map2.put( "a", "aaa" );
        map2.put( "b", "bbb" );

        TreeMap<String, String> map3 = new TreeMap<>(  );
        map3.put( "a", "aaa" );
        map3.put( "b", "bbb" );
        map3.put( "c", "aaa" );

        System.out.println(mapAB2( map ));
        System.out.println(mapAB2( map2 ));
        System.out.println(mapAB2( map3 ));
        System.out.println(mapAB2( null ));
        System.out.println(mapAB2( new TreeMap<>(  ) ));

    }

    private static TreeMap mapAB2(TreeMap map) {

        if (map == null || map.isEmpty())
            return map;

        if (map.get( "a" ).equals( map.get( "b" ) )) {
            map.remove( "a" );
            map.remove( "b" );
        }

        return map;

    }
}
