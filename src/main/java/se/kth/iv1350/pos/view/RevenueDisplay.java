package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.model.SaleInformation;

public abstract class RevenueDisplay implements RevenueObserver{
    protected double totalRevenue = 0;

    public void completedSale(SaleInformation saleInformation) {
        totalRevenue += saleInformation.getTotalPrice();
        writeRevenue();
    }

    protected abstract void writeRevenue();
}
