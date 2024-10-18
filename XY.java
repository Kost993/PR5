import java.lang.Math;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

class CalculatingXY {
    public static void main(String[]args){
        // розрахунок х
        double a = 0.5;
        double b = 2.7;
        double c = 0.4;

        double sinb = Math.sin(b);
        double sinc = Math.sin(c);
        double cosb = Math.cos(b);
        double cosc = Math.cos(c);

        double a2 = Math.sqrt(a);
        double e = Math.E;
        double ec = Math.pow(e, -c);

        double a2c = a2 * c;
        double eccosbc = ec * (cos(b) * cos(c));
        double a2ceccosbc = a2c + eccosbc;
        double bcec = (b * c) - ec;
        double sinbc1 = sin(b * c) + 1;
        double X = a2ceccosbc / sinbc1;
        System.out.println(" Х дорівнює: " + X );

        double e2c = Math.pow(e, 2 * c);
        double ln1 = (a + c);
        double e2clb = e2c * ln1;
        double b3c = Math.pow(b, 3* c);
        double ln2 = (b - c);
        double b3cln2 = b3c * ln2;
        double y = e2clb - b3cln2;
        System.out.println(" У дорівнює " + y);;
        }
}