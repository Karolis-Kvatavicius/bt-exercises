package lt.baltictalents.exercises.bt4;

public class Main {
    public static void main(String[] args) {
       greenTicket( 1,2,3 );
       greenTicket( 2,2,2 );
       greenTicket( 1,1,2 );
       greenTicket( -2, 2, 2 );
    }

    private static void greenTicket(int i1, int i2, int i3) {

        if (i1 != i2 && i1 != i3 && i2 != i3)
            System.out.println(0);
        else if (i1 == i2 && i1 == i3)
            System.out.println(20);
        else
            System.out.println(10);

    }
}
