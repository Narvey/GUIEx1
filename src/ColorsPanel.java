import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class ColorsPanel extends JPanel {
	Checkbox green = new Checkbox("Green");
	Checkbox red = new Checkbox("Red");
	Checkbox blue = new Checkbox("Blue");
	ShowPanel otherPanel;
	
	public ColorsPanel(ShowPanel o) {
		setBorder(BorderFactory.createTitledBorder("Pick one or more colors"));
		add(green);
		green.addItemListener(new CheckboxListener(Color.GREEN));
		add(red);
		green.addItemListener(new CheckboxListener(Color.RED));
		add(blue);
		green.addItemListener(new CheckboxListener(Color.BLUE));
		otherPanel = o;
	}
	private class CheckboxListener implements ItemListener{
		Color chosenColor;
		public CheckboxListener(Color chosenColor) {
			this.chosenColor = chosenColor;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==e.SELECTED)
			otherPanel.addColor(chosenColor);
			else otherPanel.subtractColor(chosenColor);
			
		}
		
	}

}
