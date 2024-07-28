public class Main {
    public static void main(String[] args){
    }

    // CASTEO

    public static int ejercicio1_1(){
        int x = (int) 5.89 + (int) 3.45;
        return x;
    }


    public static int ejercicio2_1() {
        char myChar = 'A';
        int myInt = (int) myChar;
        return myInt;
    }


    public static int ejercicio3_1() {
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        return i;
    }


    public static int ejercicio4_1() {
        String myString = "56";
        int myInt = Integer.parseInt(myString);
        return myInt;
    }

    public static int ejercicio5_1() {
        int result = (int) (char) (byte) -1;
        return result;
    }

    public static char ejercicio6_1() {
        int myInt = 65;
        char myChar = (char) myInt;
        return myChar;
    }

    public static int ejercicio7_1() {
        long myLong = 123;
        int myInt = (int) myLong;
        return myInt;
    }

    public static String ejercicio8_1() {
        float myFloat = 65.76f;
        String myString = Float.toString(myFloat);
        return myString;
    }

    public static int ejercicio9_1() {
        int result = (int) Math.round(3.7);
        return result;
    }

    public static short ejercicio10_1() {
        byte b = 127;
        short myShort = b;
        return myShort;
    }

    // OPERACIONES DE ASIGNACION

    public static int ejercicio1_2(){
        int x = 10; x += 5;
        return x;
    }


    public static int ejercicio2_2() {
        int y = 10;
        int x = 3;
        y *= x + 5;
        return x;
    }


    public static int ejercicio3_2() {
        int a = 15; a %= 4;
        return a;
    }

    public static int ejercicio4_2() {
        int y = 10;
        int x = 3;
        x += y;
        return x;
    }

    public static int ejercicio5_2() {
        int x = 6;
        x ^= 2;
        return x;
    }

    //EJERCICIOS DE INCREMENTO Y DECREMENTO

    public static int ejercicio1_3() {
        int x = 5; int y = ++x;
        return y;
    }

    public static void ejercicio2_3() {
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
    }

    public static int ejercicio3_3() {
        int count = 4;
        count--;
        return count;
    }

    public static void ejercicio4_3() {
        int i = 8;
        System.out.println(++i);
        System.out.println(i++);
    }

    public static int ejercicio5_3() {
        int x = 3;
        x = x++;
        return x;
    }

    // EJERCICIOS COMBINADOS

    public static int ejercicio1_4(){
        int i = 5;
        i += ++i + i++ + ++i;
        return i;
    }


    public static int ejercicio2_4() {
        double a = 7;
        int i = (int) a;
        i++;
        return i;
    }


    public static void ejercicio3_4() {
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);
    }


    public static double ejercicio4_4() {
        int a = 8;
        a /= 2.0;
        double b = (double) a;
        return b;
    }


    public static char ejercicio5_4() {
        char c = 'X';
        c += 32;
        return c;
    }

    public static short ejercicio6_4() {
        long a = 87;
        a *= 3;
        short b = (short) a;
        return b;
    }


    public static int ejercicio7_4() {
        int x = 10;
        x += (x++) + (++x);
        return x;
    }

    public static byte ejercicio8_4() {
        float a = 10;
        byte b = (byte) a;
        --b;
        return b;
    }

    public static byte ejercicio9_4() {
        int i = 257;
        byte b = (byte)i;
        return b;
    }

    public static int ejercicio10_4() {
        double a = 10;
        int b = (int) a;
        b += 5;
        ++b;
        return b;
    }

}