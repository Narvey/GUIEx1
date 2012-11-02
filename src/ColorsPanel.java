import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		green.addActionListener(new CheckboxListener(Color.GREEN));
		add(red);
		green.addActionListener(new CheckboxListener(Color.RED));
		add(blue);
		green.addActionListener(new CheckboxListener(Color.BLUE));
		otherPanel = o;
	}
	private class CheckboxListener implements ActionListener{
		Color chosenColor;
		public CheckboxListener(Color chosenColor) {
			this.chosenColor = chosenColor;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			otherPanel.setText("WORKS");			
			if(((Checkbox)e.getSource()).getState())
			otherPanel.addColor(chosenColor);
			else otherPanel.subtractColor(chosenColor);

		}
		
	}

}
