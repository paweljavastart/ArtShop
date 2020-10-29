package utils;

import customers.Customer;
import products.Product;

public class DiscountCalculator {
   public static double getDiscountedPrice(Product product, Customer customer) {
      double discountedPrice = product.getPrice();
      if (customer.isPremium()) {
         discountedPrice = product.getPrice() * 0.9;
      }
      return discountedPrice;
   }
}
