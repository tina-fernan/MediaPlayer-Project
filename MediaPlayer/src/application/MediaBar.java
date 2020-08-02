package application;

import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.media.MediaPlayer;

public class MediaBar extends HBox
{
	Slider time;
	Slider vol;
	
	MediaPlayer player;
	
	public MediaBar(MediaPlayer play)
	{
		player= play;
		
		vol = new Slider();
		
		getChildren().add(vol); 
		
		vol.prefWidth(70);
		vol.setMinWidth(30);
		vol.setValue(100);
		vol.valueProperty().addListener((o) ->{
			player.setVolume(vol.getValue()/100);
			
		});
		
	}
	

}
