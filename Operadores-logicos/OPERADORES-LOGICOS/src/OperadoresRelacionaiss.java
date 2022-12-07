/**
 * OperadoresLogicos
 */
/**
 * OperadoresRelacionaiss
 */
public class OperadoresRelacionaiss {

    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;

        float f1 = 4.15f;
        float f2 = 3.5f;

        char c1 = 'x';
        char c2 = 'y';

        String s1 = "Fulano";
        String s2 = "Fulano";

        boolean b1 = true;
        boolean b2 = false;

        long l1 = 2489;
        long l2 = 4729;

        byte w1 = 1;
        byte w2 = 3;

        short t1 = 82;

        double d1 = 3.14;

        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1 > i2);
        System.out.println(i1 <= i2);

        
        System.out.println(f1 == f2);
        System.out.println(f1 != f2);
        System.out.println(f1 >= f2);
        System.out.println(f1 < f2);


        System.out.println(c1 == c2);
        System.out.println(c1 != c2);
        System.out.println(c1 > c2);
        System.out.println(c1 <= c2);


        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
        //System.out.println(s1 >= s2);
        //System.out.println(s1 < s2);


        System.out.println(b1 == b2);
        System.out.println(b1 != b2);
        //System.out.println(b1 > b2);
        //System.out.println(b1 <= b2);
        System.out.println(i2 > f1);

        System.out.println(l1 == l2);
        System.out.println(l1 < l2);
        System.out.println(t1 >= l2);
        System.out.println(d1 <= w2);
        System.out.println(w1 != l1);
        System.out.println((l1 - l2) == t1);
        System.out.println((l2 * d1) >= (i1 * w1));
    }
}