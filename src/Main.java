import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ---  Задача № 1   ---
        int[] myArrayInt = new int[3];
        myArrayInt[0] = 1;
        myArrayInt[1] = 2;
        myArrayInt[2] = 3;

        float[] myArrayFloat = {1.57f, 7.654f, 9.986f};
        boolean[] myArrayBool = new boolean[]{true, false};
        //System.out.println(Arrays.toString(myArrayBool));

        // --- Задача № 2   ---
        System.out.println("   --- Задача № 2");
        for (int i = 0; i < myArrayInt.length; i++) {
            if (i == myArrayInt.length - 1) {
                System.out.println(myArrayInt[i]);
                break;
            }
            System.out.print(myArrayInt[i] + ", ");
        }
        for (int i = 0; i < myArrayFloat.length; i++) {
            if (i == myArrayFloat.length - 1) {
                System.out.println(myArrayFloat[i]);
                break;
            }
            System.out.print(myArrayFloat[i] + ", ");
        }
        for (int i = 0; i < myArrayBool.length; i++) {
            if (i == myArrayBool.length - 1) {
                System.out.println(myArrayBool[i] + "\n");
                break;
            }
            System.out.print(myArrayBool[i] + ", ");
        }

        //---   Задача № 3   ---
        System.out.println("   --- Задача № 3");
        for (int i = myArrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(myArrayInt[i]);
                break;
            }
            System.out.print(myArrayInt[i] + ", ");
        }
        for (int i = myArrayFloat.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(myArrayFloat[i]);
                break;
            }
            System.out.print(myArrayFloat[i] + ", ");
        }
        for (int i = myArrayBool.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(myArrayBool[i] + "\n");
                break;
            }
            System.out.print(myArrayBool[i] + ", ");
        }

        //---   Задача № 4   ---
        System.out.println("   --- Задача № 4");
        for (int i = 0; i < myArrayInt.length; i++) {
            if (myArrayInt[i] % 2 != 0) {
                myArrayInt[i] += 1;
            }

        }
        System.out.println(Arrays.toString(myArrayInt));


    }
}