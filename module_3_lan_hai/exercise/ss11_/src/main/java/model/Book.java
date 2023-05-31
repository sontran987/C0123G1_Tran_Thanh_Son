package model;

public class Book {
    private int id ;
    private String title;
    private int pageSize;
    private String author;
    private String cateGory;

    public Book() {
    }

    public Book(int id, String title, int pageSize, String author, String cateGory) {
        this.id = id;
        this.title = title;
        this.pageSize = pageSize;
        this.author = author;
        this.cateGory = cateGory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }
}
