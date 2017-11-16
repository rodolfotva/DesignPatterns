package adapterPattern.concretes;

import adapterPattern.intefaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vic");
	}

	@Override
	public void playMp4(String fileName) {}

}
