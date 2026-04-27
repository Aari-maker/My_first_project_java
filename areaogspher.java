public class areaofsphere{
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Main <radius>");
            return;
        }

        double radius = Double.parseDouble(args[0]);

        final double pi = 3.14159;

        double area = 4 * pi * radius * radius;
        double volume = (4.0 / 3.0) * pi * radius * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of sphere: " + area);
        System.out.println("Volume of sphere: " + volume);
    }
                                           }
