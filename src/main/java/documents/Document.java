package documents;

import products.Product;

public class Document {
   private Product product;
   private double basePrice;
   private double discountPrice;

   public Document(Product product, double basePrice, double discountPrice) {
      this.product = product;
      this.basePrice = basePrice;
      this.discountPrice = discountPrice;
   }


   public double getBasePrice() {
      return basePrice;
   }

   public double getDiscountPrice() {
      return discountPrice;
   }

   public void print(){
      System.out.println("Informacje o dokumencie:");
      System.out.println("productName:" + product.getName());
      System.out.println("basePrice:" + basePrice);
      System.out.println("discountPrice:" + discountPrice);
   }
}
