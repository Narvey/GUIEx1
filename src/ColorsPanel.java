import java.awt.Checkbox;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class ColorsPanel extends JPanel {
	Checkbox greenX;
	Checkbox blueX;
	Checkbox redX;
	
	public ColorsPanel() {
		setBorder(BorderFactory.createTitledBorder("Pick one or more colors"));
		//TODO initialize actual Components
	}

}
