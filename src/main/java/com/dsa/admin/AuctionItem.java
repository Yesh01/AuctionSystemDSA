package com.dsa.admin;

public class AuctionItem {

    //for linked-lists

    // Items in Auction Initialization

    private int itemID;
    private String itemName;
    private String description;
    private double startingPrice;
    private double highestBid;
    private String highestBidder;
    private String imagePath;
    private double soldPrice;
    private boolean isSold;
    private String bidderName;

    // Common Contruction Worker

    public AuctionItem(int itemID, String itemName, String description, double startingPrice, double highestBid, String highestBidder, String imagePath, double soldPrice, boolean isSold, String bidderName) {
        
        this.itemID = itemID;
        this.itemName = itemName;
        this.description = description;
        this.startingPrice = startingPrice;
        this.highestBid = highestBid;
        this.highestBidder = highestBidder;
        this.imagePath = imagePath;
        this.soldPrice = 0.0;
        this.isSold = false;
        this.bidderName = null;

    }

    // Retrieve & Update 

    public int getItemId() {   // Getters
        return itemID;
    }
    public void setItemId(int itemId) {  // Setters
        this.itemID = itemId;
    }

    // Continue nlng gantong Logic sa iba pa. --->



    // It said is Recommended -->
    @Override
    public String toString() {
        return "Auction Item [ itemId = " + itemID + ", itemName = " + itemName + ", startingPrice = " + startingPrice + 
               ", bidderName = " + bidderName + ", soldPrice = " + soldPrice + ", isSold = " + isSold + " ] ";
    }



}
