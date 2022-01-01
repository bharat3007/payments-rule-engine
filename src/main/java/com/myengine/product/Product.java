package com.myengine.product;

public class Product {
	 private boolean isPhysicalProduct = false;
	    private ProductType prodType;
	    public boolean isPhysical( ){
		return isPhysicalProduct;
	    }
	    
	    public String orderAction(){
		return "DefaultOrderAction";
	    }

}
