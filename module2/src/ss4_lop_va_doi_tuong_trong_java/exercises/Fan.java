package ss4_lop_va_doi_tuong_trong_java.exercises;

import java.util.Scanner;

public class Fan {
    private final int SLOW =1;
    private final int MEDIUM =1;
    private final int FAST =1;
    private int speed =1;
    private boolean on= false;
    private double radius=5;
    private String color="blue";
    public Fan(){
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  String toString(){
        String status="";
        if (this.isOn()){
            status+="Fan is on\n";
            status+="Speed: "+getSpeed()+"\n";
        }else {
            status+="Fan is off";
        }
        status+="Color: "+getColor()+"\n";
        status+="Radius: "+getRadius()+"\n";
        return status;
    }
    public static void main(String[] args){
        do {
            Scanner scanner =new Scanner(System.in);
            System.out.println("nhap toc do:");
            int speed= Integer.parseInt(scanner.nextLine());
            System.out.println("nhap ban kinh:");
            int radius= Integer.parseInt(scanner.nextLine());
            System.out.println("nhap mau:");
            String color=scanner.nextLine();
            Fan fan =new Fan(speed,true,radius,color);
            System.out.println(fan.toString());
        }while(1>0);

    }
}
