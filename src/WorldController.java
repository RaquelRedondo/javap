import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

public class WorldController {

	@FXML
	private ImageView imageView;

	@FXML
	private ImageView basketView;
	
	private int i = 1;
	public void Initialise() {
        Image image = new Image("1.jpg");
        //imageView.setImage(image);
        
        int[] x = {0,0};
        Location location = new Location("cocina", x);
        image = location.getImage("cocina", 4);
        imageView.setImage(image);
	}
	
    public void pressButton(ActionEvent event) {
       Image basket = new Image("basket.png");
        basketView.setImage(basket);
        
        if (i > 4){
        	i = 1;
        }
        System.out.println(i);
        Image image = new Image("1.jpg");
        int[] x = {0,0};
        Location location = new Location("cocina", x);
        image = location.getImage("cocina", i);
        imageView.setImage(image);
        
        i++;
    }
    
    public void right(MouseEvent event){
    	Image basket = new Image("basket.png");
        basketView.setImage(basket);
        
        if (i > 4){
        	i = 1;
        }
        System.out.println(i);
        Image image = new Image("1.jpg");
        int[] x = {0,0};
        Location location = new Location("cocina", x);
        image = location.getImage("cocina", i);
        imageView.setImage(image);
        
        i++;
    }
}
