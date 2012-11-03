import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JPanel;


public class ShowPanel extends JPanel {
	private Color chromos;
	private Label bigLabel;
	public ShowPanel() {
		chromos = Color.WHITE;
		bigLabel = new Label("Some Text");
		bigLabel.setFont(new Font("Arial", Font.BOLD,23));
		add(bigLabel);
		setBackground(chromos);
	}
	public void setColor(Color in){
		chromos = in;
		setBackground(chromos);
	}

	public void setText(String text){
		bigLabel.setText(text);
	}
}
