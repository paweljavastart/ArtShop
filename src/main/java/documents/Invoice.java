package documents;

import customers.Customer;
import products.Product;

public class Invoice extends Document {
   private Customer customer;

   public Invoice(Product product, double basePrice, double discountPrice, Customer customer) {
      super(product, basePrice, discountPrice);
      this.customer = customer;
   }

   public Customer getCustomer() {
      return customer;
   }

   public void print(){
      super.print();
      System.out.println("customer " + customer);
   }
}
