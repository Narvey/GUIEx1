import java.awt.Checkbox;

<<<<<<< HEAD
import javax.swing.BorderFactory;
=======
>>>>>>> origin/master
import javax.swing.JPanel;


public class ColorsPanel extends JPanel {
<<<<<<< HEAD
	Checkbox greenX;
	Checkbox blueX;
	Checkbox redX;
	
	public ColorsPanel() {
		setBorder(BorderFactory.createTitledBorder("Pick one or more colors"));
		//TODO initialize actual Components
=======
	Checkbox green = new Checkbox("Green");
	Checkbox red = new Checkbox("Red");
	Checkbox blue = new Checkbox("Blue");
	public ColorsPanel() {
		add(green);
		add(red);
		add(blue);
		//TODO add more Components
>>>>>>> origin/master
	}

}
