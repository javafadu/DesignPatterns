package CreationalDP.BuilderDP;

public class BuilderDPRunner {
    public static void main(String[] args) {

        // simple solution and not recommended

        Product product1 = new Product();
        product1.setId(1L);
        product1.setDescription("Casper");
        product1.setName("Computer");
        product1.setPrice(70);


        // creating object wth BuilderDP
        Product product2 = new Product.ProductBuilder()
                .id(12L)
                .name("Laptop")
                .description("Macbook")
                .price(100)
                .build();


        System.out.println("*********Product 1" );
        System.out.println(product1);
        System.out.println();
        System.out.println("*********Product 2");
        System.out.println(product2);

    }
}
