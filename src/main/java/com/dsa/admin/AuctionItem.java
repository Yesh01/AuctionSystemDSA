package com.dsa.admin;

public class AuctionItem {

    private String itemName;
    private String description;
    private double startingPrice;
    private double highestBid;
    private String highestBidder;

    //Contruction Worker Naman :>

    public AuctionItem(String itemNamne, String description, double startingPrice, double highestBid, String highestBidder) {
        
        this.itemName = itemNamne;
        this.description = description;
        this.startingPrice = startingPrice;
        this.highestBid = highestBid;
        this.highestBidder = highestBidder;
    
    }


}
