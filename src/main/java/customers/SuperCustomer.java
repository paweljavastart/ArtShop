package customers;

import documents.Document;
import documents.Receipt;
import products.Product;
import utils.DiscountCalculator;

public class SuperCustomer extends Customer{

   public SuperCustomer(String firstName, String address, boolean premium) {
      super(firstName, address, premium);
   }

   public Document createDocumentFor(Product product){
      return new Receipt(product, product.getPrice(), 1);
   }

}
