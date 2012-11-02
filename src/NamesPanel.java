// use FlowLayout

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.*;



public class NamesPanel extends JPanel {
	private JTextField name1, name2;

	
	
	public NamesPanel() {
		setSize(400, HEIGHT);
		setLayout(new FlowLayout(FlowLayout.LEFT, 3, 15));
		
		setBorder(BorderFactory.createEtchedBorder());
		//setBorder(BorderFactory.createTitledBorder("The Players"));
		
		JLabel nameLabel1 = new JLabel("Protagonist");
		JTextField name1 = new JTextField("David Flynn", 10);
		add(nameLabel1);
		add(name1);
		JLabel nameLabel2 = new JLabel("Antagonist");
		JTextField name2 = new JTextField("Clu", 10);
		add(nameLabel2);
		add(name2);
		//text wrap is not working!!
		JLabel nameLabel3 = new JLabel("Reluctant Hero");
		JTextField name3 = new JTextField("Sam Flynn", 10);
		add(nameLabel3);
		add(name3);
	}

	public NamesPanel(LayoutManager layout) {
		super(layout);
// TODO: noting to do yet.		
	}
}
