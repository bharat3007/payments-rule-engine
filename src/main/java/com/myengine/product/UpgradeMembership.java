package com.myengine.product;


public class UpgradeMembership  extends Product{
    
    @Override
    public String orderAction(){
	return "MembershipUpgradeAction, MembershipUpgradeEmail";
    }


}

