// use FlowLayout

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.*;

public class NamesPanel extends JPanel {
	private JTextField name1, name2, name3, name4, name5; 
	private Color color;
	
	public NamesPanel() {
		
		setLayout(new GridLayout(2,4));
		setBorder(BorderFactory.createEtchedBorder());
		
		JLabel nameLabel1 = new JLabel("Protagonist");
		JTextField name1 = new JTextField("David Flynn", 10);
		JLabel nameLabel2 = new JLabel("Antagonist");
		JTextField name2 = new JTextField("Clu", 10);
		name2.setFont(new Font("Courier", Font.ITALIC, 15));
		name2.setForeground(color.MAGENTA);
		JLabel nameLabel3 = new JLabel("Old Reluctant Hero");
		JTextField name3 = new JTextField("Tron", 5);
		JLabel nameLabel4 = new JLabel("Young Hero");
		JTextField name4 = new JTextField("Sam Flynn", 10);
		JLabel nameLabel5 = new JLabel("Sidekick");
		JTextField name5 = new JTextField("Allen", 10);

		add(nameLabel1);
		add(nameLabel2);
		add(nameLabel3);
		add(nameLabel4);
		add(nameLabel5);
		
		add(name1);
		add(name2);
		add(name3);
		add(name4);
		add(name5);
	}

	public NamesPanel(LayoutManager layout) {
		super(layout);   //required Constructor; don't delete
	}
}
