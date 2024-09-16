package com.dsa.admin;

import java.util.LinkedList;
import java.util.List;

public class AuctionManager {

    //for funcs

    private List<AuctionItem> auctionItems;
    private boolean auctionActive;
    
    public AuctionManager() {
        this.auctionItems = new LinkedList<>();
        this.auctionActive = false;
    }

}
