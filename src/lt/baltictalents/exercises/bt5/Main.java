package lt.baltictalents.exercises.bt5;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxMod5( 2,3 ));
        System.out.println(maxMod5( 6,2 ));
        System.out.println(maxMod5( 3,2 ));
        System.out.println(maxMod5( 20,300 ));
        System.out.println(maxMod5( 210,53 ));



    }

    private static int maxMod5(int i1, int i2) {
        if (i1 == i2)
            return 0;
        else if (i1 % 5 == i2 % 5 && i1 > i2)
            return i2;
        else if (i1 % 5 == i2 % 5 && i1 < i2)
            return i1;
        else if (i1 > i2)
            return i1;
        else
            return i2;

    }
}
