package com.brigdelab.stcokAccountManagement;

import java.util.Arrays;
import java.util.Scanner;

public class StockPortfolio {
    private static Scanner scanner = new Scanner(System.in);
    private static Stock stock = new Stock();
    private static Stock[] stocks;
    private static int Totalvalue = 0;

    public static void main(String[] args) {
        System.out.println("Enter the Number of Stock");
        stock.setNumberofStock(scanner.nextInt());
        stocks = new Stock[stock.getNumberofStock()];
        multipleStock(stock.getNumberofStock());
        System.out.println("Welcome to my Portfolio");
        System.out.println(Arrays.toString(stocks));
        System.out.println("Total Investing value of all Stock is " + Totalvalue);
    }
    public static void multipleStock(int noOfStock) {
        for (int i = 0; i < noOfStock; i++) {
            System.out.println("Add " + (i + 1) + " Stock Datails");
            addStock();
        }
    }

    public static Stock addStock() {
        Stock stock = new Stock();
        System.out.println("Enter the Name of Stock");
        stock.setShareName(scanner.next());
        System.out.println("Enter the Number of Share");
        stock.setNumberofShare(scanner.nextInt());
        System.out.println("Enter the Share Price");
        stock.setSharePrice(scanner.nextInt());
        int value = stock.getNumberofShare() * stock.getSharePrice();
        stock.setValue(value);
        System.out.println("Investing Value of " + stock.getShareName() + " is " + stock.getValue());
        Totalvalue += value;
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] == null) {
                stocks[i] = stock;
                return stock;
            }
        }
        return stock;
    }
}
