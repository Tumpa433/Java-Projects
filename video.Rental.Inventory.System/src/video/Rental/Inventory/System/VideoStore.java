package video.Rental.Inventory.System;

public class VideoStore {
	
	// Member variables
	
	private Video[]store;
	private int count;
	
	// constructor
	public VideoStore(int capacity) {
		store = new Video[capacity];
		count = 0;
	}
	
	// Member functions
	
	// Method to add a video
    public void addVideo(String name) {
        if (count < store.length) {
            store[count] = new Video(name);
            count++;
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store is full, cannot add more videos.");
        }
    }
    
	public void doCheckout(String name) {
		Video video =findbyName(name);
		if(video!=null) {
			video.doCheckout();
			System.out.println("Video"+name+"checked out successfully.");
		}else {
			System.out.println("Video"+name+"is not found.");
		}
	}
	
	public void doReturn(String name){
		Video video =findbyName(name);
		if(video!=null) {
			video.doReturn();
			System.out.println("Video"+name+"returned successfully.");
		}else {
			System.out.println("Video"+name+"is not found.");
		}
	}
	
	public void receiveRating(String name, int rating){
		Video video =findbyName(name);
		if(video!=null) {
			video.receiveRating(rating);
			System.out.println("Rating"+rating+"added  successfully to the "+name+".");
		}else {
			System.out.println("Video"+name+"is not found.");
		}
	}
	
	// Method to list inventory
    public void listInventory() {
        if (count == 0) {
            System.out.println("No videos in inventory.");
        } else {
            System.out.printf("%-20s %-15s %-10s%n", "Video Name", "Checkout Status", "Rating");
            System.out.println("---------------------------------------------------------");
            for (int i = 0; i < count; i++) {
                if (store[i] != null) {
                    System.out.printf("%-20s %-15s %-10d%n", store[i].getName(), store[i].getCheckout(), store[i].getRating());
                }else {
                	System.out.println("Debug:Null video at index"+i);
                }
            }
        }
    }

	
	
	// helper method
	private Video findbyName(String name) {
		for(int i=0;i<count;i++) {
			if(store[i]!=null && store[i].getName().equalsIgnoreCase(name)) {
				return store[i];
			}
		}
		return null;
	}

}
