package abstract_classes.farm;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Dog extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		play();
	
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		playsleep();
	
	}
	public void play() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("MuchWow.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void playsleep() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("ZZZ.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}



}
