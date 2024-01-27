public class Main {
    public static void main(String[] args) {
        System.out.println("5ft 3 in = " + convertToCentimeters(5,3) + "cm." );
        System.out.println("68 in = " + convertToCentimeters(68) + "cm.");

// 1 inch = 2.54 cm
        // 1ft = 12 inches

    }
    public static double convertToCentimeters(int inchesH) {
        return inchesH * 2.54;

    }
    public static double convertToCentimeters(int feetH, int inchesH) {

        return convertToCentimeters((feetH * 12) + inchesH);
//        return ((feetH * 12) + inchesH) * 2.54;

    }
    public class AreaCalculator {
        public static double area(double radius) {
            if(radius < 0) {
                return -1.0;
            }
            return Math.PI*radius*radius;
        }
        public static double area(double x, double y) {
            if(x < 0 || y < 0) {
                return -1.0;
            }
            return x*y;
        }
    }
}