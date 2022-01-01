package com.myengine.app;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.myengine.product.Book;
import com.myengine.product.MovieVideo;
import com.myengine.product.UpgradeMembership;

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
	 
	 @Test
	    public void VideoLearningToSkiShouldGenerateAdditionalPacking() {
		 MovieVideo thisVideo = new MovieVideo();
		thisVideo.title = "Learning to Ski";
		String actionList = thisVideo.orderAction();
		assertEquals(actionList, "PackingslipAction, PackingFirstAid");
	    }
	 @Test
	    public void MembershipShouldActivateAndSendEmail() {
		com.myengine.product.Membership thisMembership = new com.myengine.product.Membership();
		String actionList = thisMembership.orderAction();
		assertEquals(actionList, "MembershipActivationAction, MembershipActivationEmail");
	    }

	    @Test
	    public void MembershipUpgradeShouldUpgradeAndSendEmail() {
	    	UpgradeMembership thisMembershipUpgrade = new UpgradeMembership();
		String actionList = thisMembershipUpgrade.orderAction();
		assertEquals(actionList, "MembershipUpgradeAction, MembershipUpgradeEmail");
	    }
	    @Test
	    public void shouldAnswerWithTrue()
	    {
	        assertTrue( true );
	    }
}
