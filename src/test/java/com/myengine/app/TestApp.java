package com.myengine.app;



import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.myengine.product.Book;

public class TestApp {
	
	 @Test
	    public void PhysicalProductShouldGeneratePacking() {
		Book thisBook = new Book();
		String actionList = thisBook.orderAction();
		assertEquals(actionList, "PackingslipAction, RoyaltyOrderAction");
		
	    }
	   
	   
}
