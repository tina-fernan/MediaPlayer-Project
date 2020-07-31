package application;
	
import javafx.application.Application;
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
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			
			menu=new MenuBar();
			fileMenu=new Menu("File");
			openItem=new MenuItem("open");
			
			fileMenu.getItems().add(openItem); 
			menu.getMenus().add(fileMenu);
			
			openItem.setOnAction((e) -> {
				System.out.println("clicked on open!");
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
