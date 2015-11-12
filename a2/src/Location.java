import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.util.HashMap;

public class Location {
	
	private HashMap<Integer,Image> locImages = new HashMap<Integer,Image>();
	private int coordinates[] = {0,0,0,};
	Image def = new Image("2.jpg");
	
	public Location(String name, int[] coord){
		this.coordinates[0] = coord[0];  
		this.coordinates[1] = coord[1];
		
		Image image1 = new Image("1.jpg");
		Image image2 = new Image("2.jpg");
		Image image3 = new Image("3.jpg");
		Image image4 = new Image("4.jpg");
		
		coordinates[2] = 1;
		locImages.put(1, image1);
		
		coordinates[2] = 2;
		locImages.put(2, image2);
		
		coordinates[2] = 3;
		locImages.put(3, image3);
		
		coordinates[2] = 4;
		locImages.put(4, image4);
	}
	
	public Image getImage(String name, int direction){
		coordinates[2] = direction;
		Image prueba1 = locImages.getOrDefault(direction, def);
		return prueba1;		
	}

}
