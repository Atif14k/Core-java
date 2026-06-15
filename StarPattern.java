package Java_core;

public class StarPattern {
    public static void main(String a[]) {
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        // x
        // xx
        // xxx
        // xxxx


        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("x");
            }
            System.out.println();
        }
        // xxxx
        // xxx
        // xx
        // x

        for (int i = 1; i <= 4; i++) {
        for (int j = 1; j <= 4 - i; j++) {
        System.out.print("_");
        }
        for (int j = 1; j <= i; j++){
        System.out.print("x");
        }
        System.out.println();
        }
        // ___x
        // __xx
        // _xxx
        // xxxx
    }
}