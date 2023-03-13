package ss6_inheritance.exercies.lop_point_va_move_able_point;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(3, 4);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(5, 6, 2, 1);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
