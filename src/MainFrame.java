import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class MainFrame extends JFrame{
	private java.awt.Color userColor;
	private ShowPanel panel2 = new ShowPanel();
	private ColorsPanel panel3 = new ColorsPanel(panel2);
	private NamesPanel panel1 = new NamesPanel();
	
	
	public MainFrame() {
		super("Wow, someone forgot to set the window title!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(656, 200);
		addElements();
	}
	public MainFrame(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(656, 200);
		addElements();
	}
	public void addElements(){
		JMenuBar menubar=new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem Exit = new JMenuItem("Exit");
		Exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		fileMenu.add(Exit);
		menubar.add(fileMenu);
		this.setJMenuBar(menubar);
		setLayout(new FlowLayout()); 
		
		this.add(panel1,FlowLayout.LEFT);
		this.add(panel2);
		this.add(panel3);
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		panel4.add(new Label("Do some checks:"),BorderLayout.NORTH);
		panel4.add(new Checkbox("Check me."),BorderLayout.WEST);
		panel4.add(new Checkbox("Or me!"),BorderLayout.EAST);
		this.add(panel4);
	} 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainFrame main = new MainFrame("Interesting proggy");
		main.setVisible(true);
	}

}
//BorderLayout is north, south
//FlowLayout
//GridLayout
