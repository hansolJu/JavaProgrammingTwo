package Chapther14;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	private static final long serialVersionUID = 1L;

	MenuEx() {
		setTitle("Menu 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}

	void createMenu() {
		JMenuBar mb = new JMenuBar();
		//1번째 방법
		JMenu fileMenu = new JMenu("File");

		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();//줄삽입(분할)
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.add(new JMenuItem("SaveAs"));
		
		mb.add(fileMenu);
		//2번째 방법
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		this.setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuEx();
	}
}