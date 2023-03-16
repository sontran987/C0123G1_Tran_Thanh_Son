package ss5_access_modifier_static_method_static_property.exercises.access_modifier;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.invoke.empty.Empty;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        Circle circle = new Circle(radius, color);
        Circle circle1 = new Circle();

        if (radius >0) {
            System.out.println("Radius: " + circle.getRadius() + "\n" +
                    "Color: " + circle.getColor() + "\n" +
                    "Area: " + circle.getArea()
            );
        }else {
            System.out.println("Radius: " + circle1.getRadius() + "\n" +
                    "Color: " + circle1.getColor() + "\n" +
                    "Area: " + circle1.getArea()
            );
        }


    }
}
