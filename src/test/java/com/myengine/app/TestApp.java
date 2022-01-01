package com.myengine.app;



import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.myengine.product.Book;
import com.myengine.product.MovieVideo;

public class TestApp {
	
	 @Test
	    public void PhysicalProductShouldGeneratePacking() {
		Book thisBook = new Book();
		String actionList = thisBook.orderAction();
		assertEquals(actionList, "PackingslipAction, RoyaltyOrderAction");
		
	    }
	 @Test
	    public void VideoProductShouldGeneratePacking () {
		MovieVideo thisVideo = new MovieVideo();
		String actionList = thisVideo.orderAction();
		assertEquals(actionList, "PackingslipAction");
	    }
	   
}
