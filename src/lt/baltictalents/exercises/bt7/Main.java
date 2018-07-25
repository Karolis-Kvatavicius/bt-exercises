package lt.baltictalents.exercises.bt7;

public class Main {
    public static void main(String[] args) {
        System.out.println(unlucky1( new int[] {1, 3, 4, 5} ));
        System.out.println(unlucky1( new int[] {2, 1, 3, 4, 5} ));
        System.out.println(unlucky1( new int[] {1, 1, 1} ));
        System.out.println(unlucky1( null ));
    }

    static boolean unlucky1(int[] array) {
        if (array != null && array[0] == 1 && array[1] == 3 || array != null && array[1] == 1 && array[2] == 3 || array != null && array[array.length - 2] == 1 && array[array.length - 1] == 3) {
            return true;
        } else {
            return false;
        }
    }
}
