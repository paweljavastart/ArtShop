import customers.Customer;
import customers.EnterpriseCustomer;
import customers.PrivateCustomer;
import customers.SuperCustomer;
import documents.Document;
import documents.Invoice;
import documents.Receipt;
import products.Product;

public class DocumentGenerator {

   // ten kod został zastopiony przez uzycie polimorfizmu w klasach Customer i jej podrzędnych
   public static Document generate(Product product, customers.Customer customer) {
      if (customer instanceof PrivateCustomer) {
         double discountedPrice = getDiscountedPrice(product, customer);
         return new Receipt(product, product.getPrice(), discountedPrice);
      } else if (customer instanceof EnterpriseCustomer) {
         double discountedPrice = getDiscountedPrice(product, customer);
         return new Invoice(product, product.getPrice(), discountedPrice, customer);
      } else if (customer instanceof SuperCustomer) {
         return new Receipt(product, product.getPrice(), 1);
      } else {
         System.out.println("Nie umiem stworzyć dokumentu dla tego typu klienta");
         return null;
      }
   }

   private static double getDiscountedPrice(Product product, Customer customer) {
      double discountedPrice = product.getPrice();
      if (customer.isPremium()) {
         discountedPrice = product.getPrice() * 0.9;
      }
      return discountedPrice;
   }

}
