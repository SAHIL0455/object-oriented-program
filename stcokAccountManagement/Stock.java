package com.brigdelab.stcokAccountManagement;

public class Stock {
    private String ShareName;
    private int NumberofShare;
    private int SharePrice;
    private int NumberofStock;

    private int Value = 0;
    private int TotalValue = 0;


    public String getShareName() {
        return ShareName;
    }

    public void setShareName(String shareName) {
        ShareName = shareName;
    }

    public int getNumberofShare() {
        return NumberofShare;
    }

    public void setNumberofShare(int numberofShare) {
        NumberofShare = numberofShare;
    }

    public int getSharePrice() {
        return SharePrice;
    }

    public void setSharePrice(int sharePrice) {
        SharePrice = sharePrice;
    }

    public int getNumberofStock() {
        return NumberofStock;
    }

    public void setNumberofStock(int numberofStock) {
        NumberofStock = numberofStock;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public int getTotalValue() {
        return TotalValue;
    }

    public void setTotalValue(int totalValue) {
        TotalValue = totalValue;
    }

    @Override
    public String toString() {
        return
                "\n Share Name = '" + ShareName + '\'' +
                ",\n Number of Share = " + NumberofShare +
                ",\n Share Price = " + SharePrice +
                ",\n Value = " + Value ;
    }
}