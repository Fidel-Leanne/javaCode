package src;

// Java Program to find Sum of Even and Odd Numbers in an Array using For Loop
import java.util.LinkedList;
import java.util.Scanner;


public class other {
	
	public static void main(String[] args) 
	{
		Scanner random= new Scanner(System.in);
		System.out.println("Please enter number of songs you wish to have in the playlist");
        int numberOfSongs =random.nextInt();
		

		int i=0;

		LinkedList<String> Playlist= new LinkedList<>();
        while(i<=numberOfSongs){
			System.out.println("Please add song of choice");
            String song = random.nextLine();
			Playlist.add(song);

			i++;
		}
		
		System.out.println(Playlist);

		System.out.println("Are you satisfied or dissatisfied?");
		String result= random.nextLine();
		System.out.println(result );
		System.out.println("PLAY");


	}
}