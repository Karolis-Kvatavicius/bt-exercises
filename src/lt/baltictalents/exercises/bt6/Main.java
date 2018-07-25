package lt.baltictalents.exercises.bt6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println( Arrays.toString( plusTwo( new int[]{1, 2}, new int[]{17, 4} ) ) );
    }

    private static int[] plusTwo(int[] array, int[] array2) {
        int[] array3 = new int[4];
        array3[0] = array[0];
        array3[1] = array[1];
        array3[2] = array2[0];
        array3[3] = array2[1];


        return array3;
    }
}
