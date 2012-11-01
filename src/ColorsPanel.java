import java.awt.Checkbox;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class ColorsPanel extends JPanel {
	Checkbox green = new Checkbox("Green");
	Checkbox red = new Checkbox("Red");
	Checkbox blue = new Checkbox("Blue");
	public ColorsPanel() {
		setBorder(BorderFactory.createTitledBorder("Pick one or more colors"));
		add(green);
		add(red);
		add(blue);
		//TODO add more Components
	}

}
