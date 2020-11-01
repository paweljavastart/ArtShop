package customers;

import documents.Document;
import documents.Invoice;
import products.Product;
import utils.DiscountCalculator;

public class EnterpriseCustomer extends Customer {
   private String nip;

   public EnterpriseCustomer(String firstName, String address, String nip, boolean premium) {
      super(firstName, address, premium);
      this.nip = nip;
   }

   public Document createDocumentFor(Product product) {
      double discountedPrice = DiscountCalculator.getDiscountedPrice(product, this);
      return new Invoice(product, product.getPrice(), discountedPrice, this);
   }

   public String getNip() {
      return nip;
   }

   public String toString() {
      return super.toString() + ", nip=" + nip;
   }

}
