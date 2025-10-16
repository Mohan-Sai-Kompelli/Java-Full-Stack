
public class MP4Player implements AdvancedMediaPlayer{

	@Override
	public void playvlc(String filename) {
		// do nothiung mp4 player doesnt suppor vlc in this example
	}

	@Override
	public void playmp4(String filename) {
		System.out.println("Playing Mp4 file : "+filename);
		
	}
	
	
}
