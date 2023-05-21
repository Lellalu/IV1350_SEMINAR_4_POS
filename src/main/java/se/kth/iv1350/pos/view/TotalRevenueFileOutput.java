package se.kth.iv1350.pos.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import se.kth.iv1350.pos.model.SaleInformation;

class TotalRevenueFileOutput implements RevenueObserver{
    private double totalRevenue;
    private PrintWriter logFile;

    public TotalRevenueFileOutput(String filename) throws IOException { 
        logFile = new PrintWriter(new FileWriter(filename), true);
    }
    /**
     * Invoked when a sale is ended.
     *
     * @param saleInformation The sale information of a sale.
    */
    public void completedSale(SaleInformation saleInformation) {
        totalRevenue += saleInformation.getTotalPrice();
        logCurrentRevenue();
    }

    /**
     * Show total revenue in a file.
    */
    private void logCurrentRevenue(){
        logFile.println("Total revenue = " + Double.toString(totalRevenue));
    }
}
