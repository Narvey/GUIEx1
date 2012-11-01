import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MainFrame extends JFrame{
	private java.awt.Color userColor;
	private ColorsPanel panel1 = new ColorsPanel();
	private NamesPanel panel3 = new NamesPanel();
	private ShowPanel panel2 = new ShowPanel();//TODO rename
	
	public MainFrame() {
		super("Wow, someone forgot to set the window title!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 600);
		addElements();
	}
	public MainFrame(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 600);
		addElements();
	}
	public void addElements(){
		JMenuBar menubar=new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem Exit = new JMenuItem("Exit");
		fileMenu.add(Exit);
		menubar.add(fileMenu);
		this.setJMenuBar(menubar);
		setLayout(new FlowLayout()); 
		this.add(panel1, FlowLayout.LEFT);
		this.add(panel2, FlowLayout.LEFT);
		this.add(panel3, FlowLayout.LEFT);
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
