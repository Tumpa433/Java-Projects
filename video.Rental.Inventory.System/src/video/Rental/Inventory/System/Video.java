package video.Rental.Inventory.System;

import java.util.UUID;

public class Video {
	
	//Member variables
	
	private String videoId;
	private String videoName;
	private boolean checkout;
	private int rating;
	
	// Member functions
	
	public String getId() {
		return videoId;
	}
	
	public String getName() {
		return videoName;
	}
	
	public void doCheckout() {
		this.checkout=true;
	}
	
	public void doReturn() {
		this.checkout=false;
	}
	
	public void receiveRating(int rating) {
		this.rating=rating;
	}
	
	public int getRating() {
		return rating;
	}
	
	public boolean getCheckout() {
		return checkout;
	}
	
	// Constructor
	
	public Video(String name) {
		this.videoId=UUID.randomUUID().toString();
		this.videoName=name;
		this.checkout=false;
		this.rating=0;
	}
	
	@Override
	public String toString() {
		return "Video Name :"+videoName+",Checkout Status :"+checkout+",Rating :"+rating;
	}

}
