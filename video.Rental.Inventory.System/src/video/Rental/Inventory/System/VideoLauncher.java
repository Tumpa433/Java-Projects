package video.Rental.Inventory.System;

import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		VideoStore store = new VideoStore(10); // create a videoStore with a capacity 10 videos.
		
		while(true) {
			System.out.println("MAIN MENU");
			System.out.println("1. Add Videos:");
			System.out.println("2. Check Out Video:");
			System.out.println("3. Return Video:");
			System.out.println("4. Receive Rating:");
			System.out.println("5. List Inventory:");
			System.out.println("6. Exit:");
			System.out.print("Enter your choice (1..6): ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
			    System.out.print("Enter the name of the video you want to add: ");
			    String nameToAdd = scanner.nextLine();
			    
			    store.addVideo(nameToAdd);
			break;
			
			case 2:
			    System.out.print("Enter the name of the video you want to check out: ");
			    String nameToCheckout = scanner.nextLine();
			    
			    store.doCheckout(nameToCheckout);
			break;
			
			case 3:
			    System.out.print("Enter the name of the video you want to return: ");
			    String nameToReturn = scanner.nextLine();
			    
			    store.doReturn(nameToReturn);
			break;
			
			case 4:
			    System.out.print("Enter the name of the video you want to rate: ");
			    String nameToRate = scanner.nextLine();
			    
			    System.out.print("Enter the rating for this video: ");
			    int rating = scanner.nextInt();
			    scanner.nextLine();
			    store.receiveRating(nameToRate, rating);
			    
			break;
			
			case 5:
				store.listInventory();
				break;
				
			case 6:
				System.out.println("Thank you for using the application");
				scanner.close();
				return;
				
				default:
					System.out.println("Invalid!....Please enter a number between 1..6.");
					
			}
		}

	}

}
