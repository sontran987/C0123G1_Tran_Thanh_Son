package ss7_abstraction_interface.exercies.trien_khai_interface_colorable_cho_lop_hinh_hoc.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Shape[] shapes=new Shape[3];
      shapes[0]=new Circle();
      shapes[1]=new Square();
      shapes[2]=new Rectangle();
      System.out.println(Arrays.toString(shapes));
        for (Shape s : shapes) {
            if (s instanceof Colorable){
                ((Colorable)s).howToColor();
            }
        }
    }
}