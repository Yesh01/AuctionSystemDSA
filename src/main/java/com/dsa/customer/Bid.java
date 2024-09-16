package com.dsa.customer;

public class Bid {

    // Most Likely a Linked-list data Flow

        // Items in Bids Initialization

        private int bidId;
        private int itemId;
        private String bidderName;
        private double bidPrice;
        private boolean isWinningBid;
    
        // Common Contruction Worker.

        public Bid(int bidId, int itemId, String bidderName, double bidPrice) {
    
            this.bidId = bidId;
            this.itemId = itemId;
            this.bidderName = bidderName;
            this.bidPrice = bidPrice;
            this.isWinningBid = false;

        }

        //Retrieve & Update ->

        public int getBidId() {
            return bidId;
        }
    
        public void setBidId(int bidId) {
            this.bidId = bidId;
        }

        // [ Same ] Continue nlng gantong Logic sa iba pa. --->


    @Override
    public String toString() {

        return "Bid [ bidId = " + bidId + ", itemId = " + itemId + ", bidderName = " + bidderName + ", bidPrice = " + bidPrice + 
               ", isWinningBid = " + isWinningBid + "] ";
    }

}
