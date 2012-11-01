import java.awt.Color;

import javax.swing.JPanel;


public class ShowPanel extends JPanel {
	private Color chromos;
	public void addColor(Color in){
		float[] carr = new float[3];
		float[] iarr = new float[3];
		chromos.getRGBColorComponents(carr);
		for(int i=0;i<3;i++){
			carr[i] += iarr[i];
		}
		chromos=new Color(carr[0], carr[1], carr[2]);
		this.setBackground(chromos);
		
	}
	public void subtractColor(Color in){
		float[] carr = new float[3];
		float[] iarr = new float[3];
		chromos.getRGBColorComponents(carr);
		for(int i=0;i<3;i++){
			carr[i] -= iarr[i];
		}
		chromos=new Color(carr[0], carr[1], carr[2]);
		this.setBackground(chromos);
	}
}
