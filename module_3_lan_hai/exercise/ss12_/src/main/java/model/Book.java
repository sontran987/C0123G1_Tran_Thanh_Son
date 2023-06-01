package model;

public class Book {
    private int id ;
    private String title;
    private int pageSize;
    private int idAuthor;
    private int idCateGory;

    public Book() {
    }

    public Book(String title, int pageSize, int idAuthor, int idCateGory) {
        this.title = title;
        this.pageSize = pageSize;
        this.idAuthor = idAuthor;
        this.idCateGory = idCateGory;
    }

    public Book(int id, String title, int pageSize, int author, int cateGory) {
        this.id = id;
        this.title = title;
        this.pageSize = pageSize;
        this.idAuthor = author;
        this.idCateGory = cateGory;
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

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getIdCateGory() {
        return idCateGory;
    }

    public void setIdCateGory(int idCateGory) {
        this.idCateGory = idCateGory;
    }
}
