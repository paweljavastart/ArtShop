package customers;

import documents.Document;
import documents.Receipt;
import products.Product;
import utils.DiscountCalculator;

public class PrivateCustomer  extends Customer{
   private String pesel;

   public PrivateCustomer(String firstName, String address, String pesel, boolean premium) {
      super(firstName, address, premium);
      this.pesel = pesel;
   }

   public String getPesel() {
      return pesel;
   }
   public String toString(){
      return super.toString() + ", pesel="+pesel;
   }

   public Document createDocumentFor(Product product){
      double discountedPrice = DiscountCalculator.getDiscountedPrice(product, this);
      return new Receipt(product, product.getPrice(), discountedPrice);
   }
}
