import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

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
		green.addInputMethodListener(new CheckboxListener(Color.GREEN));  //green.addActionListener(new CheckboxListener(Color.GREEN));
		add(red);
		green.addInputMethodListener(new CheckboxListener(Color.RED));
		add(blue);
		green.addInputMethodListener(new CheckboxListener(Color.BLUE));
		otherPanel = o;
	}
	private class CheckboxListener implements ActionListener, InputMethodListener{
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

		@Override
		public void caretPositionChanged(InputMethodEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void inputMethodTextChanged(InputMethodEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
