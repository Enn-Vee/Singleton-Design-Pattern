import java.util.Queue;
import java.util.LinkedList;

/**
 * JukeBox class which demonstrates the Singleton Design Pattern
 * @author Nick Bautista
 *
 */

public class JukeBox {
	private Queue<String> songQueue = new LinkedList();//Has to be initialized here because constructor is empty.
	private static JukeBox jukeBox;
	private JukeBox() {}
	
	/**
	 * Calls constructor only when no other instance exists which limits the number of instances to a maximum of 1
	 */
	public static JukeBox getInstance() {
		if(jukeBox == null) {
			System.out.println("Initializing the JukeBox!!! Let's get Dancing");
			jukeBox = new JukeBox();
		}
		return jukeBox;
	}
	
	/**
	 * Removes element at the front of the queue then returns it.
	 */
	public void playNextSong() {
		if(songQueue.isEmpty()) {
			System.out.println("You need to add songs to the list.");
			return;
		}
		System.out.println("Let's jam to " + songQueue.remove());
	}
	
	/**
	 * Adds parameter to the queue then displays how far it is in the queue. 
	 */
	public void requestSong(String songName) {
		songQueue.add(songName);
		System.out.println(songName + " is now number " + songQueue.size() + " on the list.");
	}
	
	/**
	 * Checks whether queue is empty or not.
	 * @return
	 */
	public boolean hasMoreSongs() {
			if(songQueue.isEmpty())
				return false;
			return true;
	}
}
