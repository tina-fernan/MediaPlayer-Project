package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	MenuBar menu;
	Menu fileMenu;
	MenuItem openItem;
	FileChooser mediaChooser;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			
			mediaChooser=new FileChooser();
			
			menu=new MenuBar();
			fileMenu=new Menu("File");
			openItem=new MenuItem("open");
			
			fileMenu.getItems().add(openItem); 
			menu.getMenus().add(fileMenu);
			
			openItem.setOnAction((e) -> {
				File mediaFile=mediaChooser.showOpenDialog(primaryStage);
				System.out.println(mediaFile.getAbsolutePath());
			});
			
			root.setTop(menu);
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
