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
	public void addColor(Color in){
		float[] carr = new float[3];
		float[] iarr = new float[3];
		chromos.getRGBColorComponents(carr);
		in.getRGBColorComponents(iarr);
		for(int i=0;i<3;i++){
			carr[i] += iarr[i];
		}
		chromos=new Color(carr[0], carr[1], carr[2]);
		setBackground(chromos);
		
	}
	public void subtractColor(Color in){
		float[] carr = new float[3];
		float[] iarr = new float[3];
		chromos.getRGBColorComponents(carr);
		for(int i=0;i<3;i++){
			carr[i] -= iarr[i];
		}
		chromos=new Color(carr[0], carr[1], carr[2]);
		setBackground(chromos);
	}
	public void setText(String text){
		bigLabel.setText(text);
	}
}
