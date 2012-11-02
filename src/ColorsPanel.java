import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class ColorsPanel extends JPanel {
	JRadioButton green = new JRadioButton("Green");
	JRadioButton red = new JRadioButton("Red");
	JRadioButton blue = new JRadioButton("Blue");
	ButtonGroup grp = new ButtonGroup();
	ShowPanel otherPanel;
	
	public ColorsPanel(ShowPanel o) {
		setBorder(BorderFactory.createTitledBorder("Pick a color"));
		otherPanel = o;
		green.addActionListener(new RadioListener(Color.GREEN));  
		red.addActionListener(new RadioListener(Color.RED));
		blue.addActionListener(new RadioListener(Color.BLUE));
		grp.add(green);
		grp.add(red);
		grp.add(blue);
		add(green);
		add(blue);
		add(red);
	}
	private class RadioListener implements ActionListener{
		Color chosenColor;
		public RadioListener(Color chosenColor) {
			this.chosenColor = chosenColor;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			otherPanel.setColor(chosenColor);
			//otherPanel.setText(getParent().getWidth()+","+getParent().getHeight());
			//else otherPanel.subtractColor(chosenColor);			
		}
	}

}
