package com.bridgelabz;

public class Stock {

    private int numberOfStocks;

    private String nameOfShare;
    private int numberOfShares;

    private int sharePrice;

    public Stock() {

    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public String getNameOfShare() {
        return nameOfShare;
    }

    public void setNameOfShare(String nameOfShare) {
        this.nameOfShare = nameOfShare;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String toString() {
        return "Stock{" +
                "numberOfStocks=" + numberOfStocks +
                ", nameOfShare='" + nameOfShare + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
