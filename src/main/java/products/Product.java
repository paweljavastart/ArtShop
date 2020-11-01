package products;

public class Product {
   private String name;
   private String id;
   private double price;

   public Product(String name, String id, double price) {
      this.name = name;
      this.id = id;
      this.price = price;
   }

   public String getName() {
      return name;
   }

   public String getId() {
      return id;
   }

   public double getPrice() {
      return price;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
