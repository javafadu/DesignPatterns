package CreationalDP.BuilderDP;

import java.time.LocalDateTime;

public class Product {

    private Long id;  // mandatory field
    private String name; // mandatory field
    private LocalDateTime date;
    private boolean inStock;
    private String description;
    private int price; // mandatory field

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

    public Product(ProductBuilder productBuilder) {

        this.id=productBuilder.id;
        this.name=productBuilder.name;
        this.date=productBuilder.date;
        this.inStock=productBuilder.inStock;
        this.description=productBuilder.description;
        this.price=productBuilder.price;


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


    // Creating a static class
    public static class ProductBuilder {
        private Long id;
        private String name;
        private LocalDateTime date;
        private boolean inStock;
        private String description;
        private int price;

        public ProductBuilder id(Long id) {
            this.id=id;
            return this;
        }

        public ProductBuilder name(String name) {
            this.name=name;
            return this;
        }

        public ProductBuilder date(LocalDateTime date) {
            this.date=date;
            return this;
        }
        public ProductBuilder inStock(boolean inStock) {
            this.inStock=inStock;
            return this;
        }
        public ProductBuilder description(String description) {
            this.description=description;
            return this;
        }
        public ProductBuilder price(int price) {
            this.price=price;
            return this;
        }


        public Product build() {
            Product product = new Product(this);
            return product;
        }



    }


}
