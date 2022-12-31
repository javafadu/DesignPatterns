package CreationalDP.BuilderDP;

import java.time.LocalDateTime;

public class Product {

    private Long id;
    private String name;
    private LocalDateTime date;
    private boolean inStock;
    private String description;
    private int price;

    // Default Constructor
    public Product() {
    }

    // Parameterized Constructor
    public Product(Long id, String name, LocalDateTime date, boolean inStock, String description, int price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.inStock = inStock;
        this.description = description;
        this.price = price;
    }

    // Getter & Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    // To String


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", inStock=" + inStock +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
