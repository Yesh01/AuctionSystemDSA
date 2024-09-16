package com.dsa.admin;

public class AuctionItem {

    //for linked-lists

    // Items in Auction Initialization

    private String itemName;
    private String description;
    private double startingPrice;
    private double highestBid;
    private String highestBidder;

    // Common Contruction Worker

    public AuctionItem(String itemName, String description, double startingPrice, double highestBid, String highestBidder) {
        
        this.itemName = itemName;
        this.description = description;
        this.startingPrice = startingPrice;
        this.highestBid = highestBid;
        this.highestBidder = highestBidder;

    }

}
