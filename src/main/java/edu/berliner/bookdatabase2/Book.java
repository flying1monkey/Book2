package edu.berliner.bookdatabase2;

public class Book {
    private String title;
    private String author;
    private String description;
    private String sku;
    private Double price;
    private String category;

    public Book(String title, String author, String description, String sku, Double price, String category)
    {
        this.title=title;
        this.author=author;
        this.description=description;
        this.sku = sku;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
