package com.bridgelabz;

import java.util.Scanner;

public class StockPortfolio {

    //Scanner to take input from user
    private static Scanner scanner = new Scanner(System.in);

    //Object of stock
    private static Stock stock = new Stock();


    //Main method calculates the value of stock and total value of all the stocks
    public static void main(String[] args) {
        System.out.println("Welcome to stock portfolio program");
        System.out.println("Enter the number of stocks");
        stock.setNumberOfStocks(scanner.nextInt());
        double valueOfStock = 0;
        double totalValueOfStock = 0;
        for (int i = 0; i < stock.getNumberOfStocks(); i++) {
            System.out.println(detailsOfStock());
            System.out.println(" ");
            valueOfStock = stock.getNumberOfShares() * stock.getSharePrice();
            System.out.println("Invested money for " + stock.getNameOfShare() + " of " + stock.getSharePrice() + " is: " + valueOfStock);
            System.out.println(" ");
            totalValueOfStock += valueOfStock;
        }
        System.out.println("Total invested amount of all stocks is: " + totalValueOfStock);
    }

    //Displays the message entered and takes input from user
    public static Stock detailsOfStock() {
        System.out.println("Enter the name of share");
        stock.setNameOfShare(scanner.next());
        System.out.println("Enter the number of shares");
        stock.setNumberOfShares(scanner.nextInt());
        System.out.println("Enter the share price");
        stock.setSharePrice(scanner.nextInt());
        return stock;
    }

}
