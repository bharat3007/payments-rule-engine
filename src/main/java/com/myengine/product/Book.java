package com.myengine.product;

public class Book extends Product{
    
    @Override
    public String orderAction(){
	return "PackingslipAction, RoyaltyOrderAction";
    }


}