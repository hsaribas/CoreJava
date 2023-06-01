package practice08;

import java.time.LocalDate;

public class Market {
    //Type a supermarket program to see product name, product price and expiration date.
    String productName;
    double productPrice;
    String expirationDate;

    Market(String name, double price, int monthLater) {
        productName = name;
        productPrice = price;
        expirationDate = LocalDate.now().plusMonths(monthLater).toString();
    }

    Market(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        expirationDate = "The product does not have any expiration date";
    }
}
