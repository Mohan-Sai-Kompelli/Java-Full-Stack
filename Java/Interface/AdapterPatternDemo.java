
public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer audioplayer = new AudioPlayer();
		audioplayer.play("Mp3","Beyound the horizon.mp3");
		// formats supported via Adapter Pattern
		audioplayer.play("Mp4","Alone.mp4");
		audioplayer.play("vlc","far_far_away.vlc");
		
		//unsupported format
		audioplayer.play("avi","Mind_me.avi");
	}

}
