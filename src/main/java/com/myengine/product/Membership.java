package com.myengine.product;

public class Membership extends Product{
    
    @Override
    public String orderAction(){
	return "MembershipActivationAction, MembershipActivationEmail";
    }
}