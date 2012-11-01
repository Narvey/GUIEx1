import java.awt.Button;
import java.awt.FlowLayout;
<<<<<<< HEAD
=======
import java.awt.MenuBar;
>>>>>>> origin/master
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MainFrame extends JFrame{
	private java.awt.Color userColor;
<<<<<<< HEAD
	private ColorsPanel panel1;
	private ShowPanel panel2;
	private NamesPanel panel3;
=======
	private ColorsPanel panel1 = new ColorsPanel();
	private NamesPanel panel2 = new NamesPanel();
	private ShowPanel panelzzzz = new ShowPanel();//TODO rename
>>>>>>> origin/master
	
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
		JMenu fileMenu = new JMenu();
<<<<<<< HEAD
		JMenuItem Exit = new JMenuItem("");
		setLayout(new FlowLayout());
		menus.add(fileMenu);
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
=======
		JMenuItem Exit = new JMenuItem("Exit");
		fileMenu.add(Exit);
		menubar.add(fileMenu);
		this.add(menubar);
		this.add(panel1, FlowLayout.LEFT);
		this.add(panel2, FlowLayout.LEFT);
>>>>>>> origin/master
		this.getComponent(0).setEnabled(false);
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