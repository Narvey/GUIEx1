import java.awt.Checkbox;

import javax.swing.JPanel;


public class ColorsPanel extends JPanel {
	Checkbox green = new Checkbox("Green");
	Checkbox red = new Checkbox("Red");
	Checkbox blue = new Checkbox("Blue");
	public ColorsPanel() {
		add(green);
		add(red);
		add(blue);
		//TODO add more Components
	}

}
