package danh_sach_hoc_sinh;

import java.util.Scanner;

public class StudentList {
    private int id;
    private String name;
    private String clases;

    public StudentList() {
    }

    public StudentList(int id, String name, String clases) {
        this.id = id;
        this.name = name;
        this.clases = clases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name= " + name +
                " , clases= " + clases  ;
    }

}
