//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Moods", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "happy", "sad", "mad" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if (userMood==0) {
	playVideo("http://www.youtube.com/watch?v=y-HKSdLms8Y");
}				
else if(userMood==1) {
	playVideo("https://www.youtube.com/watch?v=w0AOGeqOnFY");
}
else if(userMood==2) {
	playVideo("https://www.youtube.com/watch?v=Rx1ZH0WV164");
}
		// 4. Play different songs for other moods.

/**
* If you can’t think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



