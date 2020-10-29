import customers.Customer;
import customers.EnterpriseCustomer;
import customers.PrivateCustomer;
import customers.SuperCustomer;
import documents.Document;
import products.Product;

public class ShopTest {


   public static void main(String[] args) {
      Product product = new Product("czekolada", "4353", 5);
      Customer customers[] = {new PrivateCustomer("Jan", "Kowalski", "3323423", false),
          new EnterpriseCustomer("IBM", "chicago", "32323", true), new SuperCustomer("super", "klient", true)};


      for (Customer customer : customers) {
         Document generatedDocument = customer.createDocumentFor(product);
         if (generatedDocument != null) {
            generatedDocument.print();
            System.out.println();
         }
      }

   }

}
