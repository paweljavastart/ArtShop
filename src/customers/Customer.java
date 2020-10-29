package customers;

import documents.Document;
import products.Product;

public class Customer {
   private String firstName;
   private String address;
   private boolean premium;

   public Customer(String firstName, String address, boolean premium) {
      this.firstName = firstName;
      this.address = address;
      this.premium = premium;
   }

   public Document createDocumentFor(Product product){
      System.out.println("Nie umiem stworzyć dokumentu dla tego typu klienta");
      return null;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getAddress() {
      return address;
   }

   public boolean isPremium() {
      return premium;
   }

   @Override
   public String toString() {
      return "firstName='" + firstName + '\'' +
          ", address='" + address + '\'' +
          ", premium=" + premium;
   }
}
