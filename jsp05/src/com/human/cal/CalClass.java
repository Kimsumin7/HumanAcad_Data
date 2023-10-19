package com.human.cal;

public class CalClass {
    private double price1, price2, price3, price4;
    private double discount; // 할인율을 저장할 변수
    private double discountedPrice1, discountedPrice2, discountedPrice3, discountedPrice4;

    public CalClass(double price1, double price2, double price3, double price4, double discount) {
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.price4 = price4;
        this.discount = discount;
    }

    public void calculateDiscountedPrices() {
        discountedPrice1 = price1 - (price1 * discount);
        discountedPrice2 = price2 - (price2 * discount);
        discountedPrice3 = price3 - (price3 * discount);
        discountedPrice4 = price4 - (price4 * discount);
    }

    public String getResult() {
        return "물건 1: 정가 " + price1 + ", 할인가 " + discountedPrice1 + "<br>" +
               "물건 2: 정가 " + price2 + ", 할인가 " + discountedPrice2 + "<br>" +
               "물건 3: 정가 " + price3 + ", 할인가 " + discountedPrice3 + "<br>" +
               "물건 4: 정가 " + price4 + ", 할인가 " + discountedPrice4 + "<br>";
    }
}
