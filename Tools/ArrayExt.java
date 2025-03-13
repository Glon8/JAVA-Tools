package Tools;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExt {
    //================================================< int
    public static void print(int[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (int i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(int[] array) {
        return array == null || array.length == 0;
    }

    public static int returnFirst(int[] array) {
        if (isEmpty(array)) return -1;

        return array[0];
    }

    public static int returnLast(int[] array) {
        if (isEmpty(array)) return -1;

        return array[array.length - 1];
    }

    public static int[] removeFirst(int[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static int[] removeLast(int[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static int[] addFirst(int[] array, int value) {
        if (isEmpty(array)) {
            array = new int[1];

            array[0] = value;

            return array;
        }

        int[] newArr = new int[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static int[] addLast(int[] array, int value) {
        if (isEmpty(array)) {
            array = new int[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static int[] addByIndex(int[] array, int ind, int value) {
        if (isEmpty(array)) {
            array = new int[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        int[] newArr = new int[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static int[] removeByIndex(int[] array, int ind) {
        if (isEmpty(array)) return null;

        int[] newArr = new int[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< byte
    public static void print(byte[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (byte i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(byte[] array) {
        return array == null || array.length == 0;
    }

    public static byte returnFirst(byte[] array) {
        if (isEmpty(array)) return -1;

        return array[0];
    }

    public static byte returnLast(byte[] array) {
        if (isEmpty(array)) return -1;

        return array[array.length - 1];
    }

    public static byte[] removeFirst(byte[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static byte[] removeLast(byte[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static byte[] addFirst(byte[] array, byte value) {
        if (isEmpty(array)) {
            array = new byte[1];

            array[0] = value;

            return array;
        }

        byte[] newArr = new byte[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static byte[] addLast(byte[] array, byte value) {
        if (isEmpty(array)) {
            array = new byte[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static byte[] addByIndex(byte[] array, int ind, byte value) {
        if (isEmpty(array)) {
            array = new byte[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        byte[] newArr = new byte[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static byte[] removeByIndex(byte[] array, int ind) {
        if (isEmpty(array)) return null;

        byte[] newArr = new byte[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< char
    public static void print(char[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (char i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(char[] array) {
        return array == null || array.length == 0;
    }

    public static char returnFirst(char[] array) {
        if (isEmpty(array)) return '~';

        return array[0];
    }

    public static char returnLast(char[] array) {
        if (isEmpty(array)) return '~';

        return array[array.length - 1];
    }

    public static char[] removeFirst(char[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static char[] removeLast(char[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static char[] addFirst(char[] array, char value) {
        if (isEmpty(array)) {
            array = new char[1];

            array[0] = value;

            return array;
        }

        char[] newArr = new char[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static char[] addLast(char[] array, char value) {
        if (isEmpty(array)) {
            array = new char[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static char[] addByIndex(char[] array, int ind, char value) {
        if (isEmpty(array)) {
            array = new char[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        char[] newArr = new char[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static char[] removeByIndex(char[] array, int ind) {
        if (isEmpty(array)) return null;

        char[] newArr = new char[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< long
    public static void print(long[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (long i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(long[] array) {
        return array == null || array.length == 0;
    }

    public static long returnFirst(long[] array) {
        if (isEmpty(array)) return -1;

        return array[0];
    }

    public static long returnLast(long[] array) {
        if (isEmpty(array)) return -1;

        return array[array.length - 1];
    }

    public static long[] removeFirst(long[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static long[] removeLast(long[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static long[] addFirst(long[] array, long value) {
        if (isEmpty(array)) {
            array = new long[1];

            array[0] = value;

            return array;
        }

        long[] newArr = new long[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static long[] addLast(long[] array, long value) {
        if (isEmpty(array)) {
            array = new long[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static long[] addByIndex(long[] array, int ind, long value) {
        if (isEmpty(array)) {
            array = new long[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        long[] newArr = new long[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static long[] removeByIndex(long[] array, int ind) {
        if (isEmpty(array)) return null;

        long[] newArr = new long[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< float
    public static void print(float[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (float i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(float[] array) {
        return array == null || array.length == 0;
    }

    public static float returnFirst(float[] array) {
        if (isEmpty(array)) return -1;

        return array[0];
    }

    public static float returnLast(float[] array) {
        if (isEmpty(array)) return -1;

        return array[array.length - 1];
    }

    public static float[] removeFirst(float[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static float[] removeLast(float[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static float[] addFirst(float[] array, float value) {
        if (isEmpty(array)) {
            array = new float[1];

            array[0] = value;

            return array;
        }

        float[] newArr = new float[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static float[] addLast(float[] array, float value) {
        if (isEmpty(array)) {
            array = new float[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static float[] addByIndex(float[] array, int ind, float value) {
        if (isEmpty(array)) {
            array = new float[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        float[] newArr = new float[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static float[] removeByIndex(float[] array, int ind) {
        if (isEmpty(array)) return null;

        float[] newArr = new float[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< short
    public static void print(short[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (short i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(short[] array) {
        return array == null || array.length == 0;
    }

    public static short returnFirst(short[] array) {
        if (isEmpty(array)) return -1;

        return array[0];
    }

    public static short returnLast(short[] array) {
        if (isEmpty(array)) return -1;

        return array[array.length - 1];
    }

    public static short[] removeFirst(short[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static short[] removeLast(short[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static short[] addFirst(short[] array, short value) {
        if (isEmpty(array)) {
            array = new short[1];

            array[0] = value;

            return array;
        }

        short[] newArr = new short[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static short[] addLast(short[] array, short value) {
        if (isEmpty(array)) {
            array = new short[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static short[] addByIndex(short[] array, int ind, short value) {
        if (isEmpty(array)) {
            array = new short[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        short[] newArr = new short[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static short[] removeByIndex(short[] array, int ind) {
        if (isEmpty(array)) return null;

        short[] newArr = new short[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< double
    public static void print(double[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (double i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(double[] array) {
        return array == null || array.length == 0;
    }

    public static double returnFirst(double[] array) {
        if (isEmpty(array)) return -1;

        return array[0];
    }

    public static double returnLast(double[] array) {
        if (isEmpty(array)) return -1;

        return array[array.length - 1];
    }

    public static double[] removeFirst(double[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static double[] removeLast(double[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static double[] addFirst(double[] array, double value) {
        if (isEmpty(array)) {
            array = new double[1];

            array[0] = value;

            return array;
        }

        double[] newArr = new double[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static double[] addLast(double[] array, double value) {
        if (isEmpty(array)) {
            array = new double[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static double[] addByIndex(double[] array, int ind, double value) {
        if (isEmpty(array)) {
            array = new double[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        double[] newArr = new double[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static double[] removeByIndex(double[] array, int ind) {
        if (isEmpty(array)) return null;

        double[] newArr = new double[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< boolean
    public static void print(boolean[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (boolean i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static boolean isEmpty(boolean[] array) {
        return array == null || array.length == 0;
    }

    public static boolean returnFirst(boolean[] array) {
        if (isEmpty(array)) return false;

        return array[0];
    }

    public static boolean returnLast(boolean[] array) {
        if (isEmpty(array)) return false;

        return array[array.length - 1];
    }

    public static boolean[] removeFirst(boolean[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static boolean[] removeLast(boolean[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static boolean[] addFirst(boolean[] array, boolean value) {
        if (isEmpty(array)) {
            array = new boolean[1];

            array[0] = value;

            return array;
        }

        boolean[] newArr = new boolean[array.length + 1];

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static boolean[] addLast(boolean[] array, boolean value) {
        if (isEmpty(array)) {
            array = new boolean[1];

            array[0] = value;

            return array;
        }

        array = Arrays.copyOf(array, 1 + array.length);

        return array;
    }

    public static boolean[] addByIndex(boolean[] array, int ind, boolean value) {
        if (isEmpty(array)) {
            array = new boolean[1];

            array[0] = value;

            return array;
        }

        int count = 0;

        boolean[] newArr = new boolean[array.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static boolean[] removeByIndex(boolean[] array, int ind) {
        if (isEmpty(array)) return null;

        boolean[] newArr = new boolean[(-1) + array.length];

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }

    //================================================< T
    public static <T> void print(T[] array) {
        if (array != null) {
            System.out.print("{ ");

            for (T i : array) System.out.print(i + " ");

            System.out.print("}\r\n");
        }
    }

    public static <T> boolean isEmpty(T[] array) {
        boolean flag = !(array == null || array.length == 0);

        if (flag) {
            for (T a : array) {
                flag = a == null;

                if (!flag) break;
            }
        }

        return flag;
    }

    public static <T> T returnFirst(T[] array) {
        if (isEmpty(array)) return null;

        return array[0];
    }

    public static <T> T returnLast(T[] array) {
        if (isEmpty(array)) return null;

        return array[array.length - 1];
    }

    public static <T> T[] removeFirst(T[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 1, array.length);
    }

    public static <T> T[] removeLast(T[] array) {
        if (isEmpty(array)) return null;

        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    public static <T> T[] addFirst(T[] array, T value) {
        Class<?> U = array.getClass().getComponentType();

        T[] newArr;

        if (isEmpty(array)) {
            newArr = (T[]) Array.newInstance(U, 1);

            System.out.println(newArr.getClass());

            newArr[0] = value;

            return newArr;
        }

        newArr = (T[]) Array.newInstance(U, array.length + 1);

        newArr[0] = value;

        for (int i = 1; i < newArr.length; i++) newArr[i] = array[-1 + i];

        return newArr;
    }

    public static <T> T[] addLast(T[] array, T value) {
        Class<?> U = array.getClass().getComponentType();

        if (isEmpty(array)) {
            array = (T[]) Array.newInstance(U, 1);

            array[0] = value;

            return array;
        }

        int length = array.length;

        array = Arrays.copyOf(array, 1 + length);

        array[length] = value;

        return array;
    }

    public static <T> T[] addByIndex(T[] array, int ind, T value) {
        Class<?> U = array.getClass().getComponentType();

        if (isEmpty(array)) {
            array = (T[]) Array.newInstance(U, 1);

            array[0] = value;

            return array;
        }

        int count = 0;

        T[] newArr = (T[]) Array.newInstance(U, array.length + 1);

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) newArr[i] = value;
            else {
                newArr[i] = array[count];

                count++;
            }
        }

        return newArr;
    }

    public static <T> T[] removeByIndex(T[] array, int ind) {
        Class<?> U = array.getClass().getComponentType();

        if (isEmpty(array)) return null;

        T[] newArr = (T[]) Array.newInstance(U, (-1) + array.length);

        boolean flag = true;

        for (int i = 0; i < newArr.length; i++) {
            if (ind == i) flag = false;

            newArr[i] = flag ? array[i] : array[1 + i];
        }

        return newArr;
    }
}
