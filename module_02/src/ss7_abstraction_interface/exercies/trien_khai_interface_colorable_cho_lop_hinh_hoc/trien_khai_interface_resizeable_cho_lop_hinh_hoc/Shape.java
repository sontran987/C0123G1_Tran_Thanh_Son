package ss7_abstraction_interface.exercies.trien_khai_interface_colorable_cho_lop_hinh_hoc.trien_khai_interface_resizeable_cho_lop_hinh_hoc;


public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " +
                "color= " + getColor() + " and " +
                (isFilled() ? " filled " : " not filled");
    }

}
