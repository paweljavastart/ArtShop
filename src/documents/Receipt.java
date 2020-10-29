package documents;

import products.Product;

public class Receipt extends  Document{
   public Receipt(Product product, double basePrice, double discountPrice) {
      super(product, basePrice, discountPrice);
   }

}
