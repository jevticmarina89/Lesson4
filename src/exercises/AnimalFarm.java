package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/* 1. Ask the user which animal they want, then play the sound of that animal. */
		int a = 0;
		do {
		String animal = JOptionPane.showInputDialog("Enter the animal you want to hear?");
		
		if(animal.equals("cow")) {
			playMoo();
		}
		else if(animal.equals("duck")) {
			playQuack();
		}
		else if(animal.equals("dog")) {
			playWoof();
		}
		else if(animal.equals("cat")) {
			playNoise(meowFile) ;
		}
		else if(animal.equals("llama")) {
			playNoise(llamaFile) ;
		}
		else if(animal.equals("pig")) {
			playNoise(oinkFile);
		}
		a = JOptionPane.showConfirmDialog(null, "Enter another animal:", "", JOptionPane.YES_NO_OPTION);
		}while(a == 0);
		
		}
		/* 2. Make it so that the user can keep entering new animals. */

	

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	void playOink() {
		playNoise(oinkFile);
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";
	String oinkFile = "sound/oink.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
