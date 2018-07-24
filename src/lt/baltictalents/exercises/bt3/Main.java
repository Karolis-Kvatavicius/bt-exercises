package lt.baltictalents.exercises.bt3;

public class Main {
    public static void main(String[] args) {
        middleThree( "Candy" );
        middleThree( "and" );
        middleThree( "solving" );
        middleThree( null);
    }

    private static void middleThree(String string){
        if (string != null && string.length() >= 3 && string.length() % 2 != 0 ) {
            System.out.println(string.substring( (string.length()-3)/2, ((string.length()-3)/2) + 3));
        } //else {
//            System.out.println("Wrong string");
//        }
//        midl.substring(  )

    }
}
