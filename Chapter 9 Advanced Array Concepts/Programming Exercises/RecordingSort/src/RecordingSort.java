import java.util.Scanner;

public class RecordingSort {
	public static void main(String[] args) {
		Recording[] recordings = new Recording[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < recordings.length; i++) {
			int j = i + 1;
			System.out.println("Enter song " + j + "'s title: ");
			String title = sc.nextLine();
			System.out.println("Enter artist: ");
			String artist = sc.nextLine();
			System.out.println("Enter playing time in seconds: ");
			int playtime = sc.nextInt();
			sc.nextLine(); // don't remove this as it will break the loop because it wont prompt 
							//for the next song's artist
			recordings[i] = new Recording(title, artist, playtime);
			System.out.println(); // new line between prompt and output
		}
		
		int choice;
		do {
			System.out.println("Enter number to sort by: 1) title 2) artist 3) playing time");
			choice = sc.nextInt();
			if(choice > 0 && choice < 4) {
				int a,b;
				int high = recordings.length-1;
				for(a = 0; a < high; a++) {
					for(b = 0; b < high; b++) {
						int c = b + 1;
						// sort by title
						if(choice == 1) {
							if(recordings[b].getTitle().compareTo(recordings[c].getTitle()) > 0) {
								Recording temp = recordings[b];
								recordings[b] = recordings[c];
								recordings[c] = temp;
							}
						}
						
						//sort by artist
						else if(choice == 2) {
							if(recordings[b].getArtist().compareTo(recordings[c].getArtist()) > 0) {
								Recording temp = recordings[b];
								recordings[b] = recordings[c];
								recordings[c] = temp;
							}
						}
						
						// sort by playing time
						else if(choice == 3) {
							if(recordings[b].getArtist().compareTo(recordings[c].getArtist()) > 0) {
								Recording temp = recordings[b];
								recordings[b] = recordings[c];
								recordings[c] = temp;
							}
						}
					}
				}
			}
			else {
				System.out.println("Error. Invalid choice. Enter 1, 2, or 3.");
			}
		}while(choice < 1 || choice > 3);
		System.out.println(); // add space
		
		//display output
		for(int i = 0; i < recordings.length; i++) {
			System.out.println("Song " + (i+1) + ":" + "\nTitle: " + recordings[i].getTitle() + "\nArtist: " +
								recordings[i].getArtist() + "\nPlaying time: " + recordings[i].getPlayTime() + " seconds");
		}
		
		//close scanner
		sc.close();
	}
}