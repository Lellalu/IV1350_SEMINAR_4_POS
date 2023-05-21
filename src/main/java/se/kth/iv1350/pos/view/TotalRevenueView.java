package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.model.SaleInformation;

/**
 * Shows a running total of a sale process of each sale.
*/

class TotalRevenueView implements RevenueObserver{
    private double totalRevenue;

    public void completedSale(SaleInformation saleInformation) {
        totalRevenue += saleInformation.getTotalPrice();
        printCurrentRevenue();
    }

    private void printCurrentRevenue(){
        System.out.println("### Current income of total sales is " + Double.toString(totalRevenue) + ". ### "); 
    }
}


