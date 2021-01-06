package harinsalai.ratchanon.lab2;

public class CircleCalculator {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        if (radius == 1) {
            System.out.println("CircleCalculator <radius of a circle>");
            System.exit(0);
        }
        double area =Math.PI*(radius*radius);
        double circumference = 2*Math.PI*radius;

        //rounded
        double area_rounded = Math.round(area*100.0) /100.0;
        double circumference_rounded = Math.round(circumference*100.0) /100.0;

        System.out.println("An area of a circle with radius of "+ radius + " is  " + area_rounded +
                           "\n A circumference is " + circumference_rounded);
    }
}
