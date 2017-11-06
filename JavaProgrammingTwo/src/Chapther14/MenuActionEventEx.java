package Chapther14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuActionEventEx extends JFrame {
	private static final long serialVersionUID = -5734501928797882065L;
	Container contentPane;
	JLabel label = new JLabel("Hello");

	MenuActionEventEx() {
		setTitle("Menu 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}

	void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu fileMenu = new JMenu("Text");//메뉴 만들기
		//메뉴안에 Action 만들기
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = { "Color", "Font", "Top", "Bottom" };
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);//맵핑
			menuItem[i].addActionListener(new MenuActionListener());
			fileMenu.add(menuItem[i]);
		}
		
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	//Action 메서드 로직
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.equals("Color"))
				label.setForeground(Color.BLUE);
			else if (cmd.equals("Font"))
				label.setFont(new Font("Ravie", Font.ITALIC, 30));
			else if (cmd.equals("Top"))
				label.setVerticalAlignment(SwingConstants.TOP);
			else
				label.setVerticalAlignment(SwingConstants.BOTTOM);
		}
	}

	public static void main(String[] args) {
		new MenuActionEventEx();
	}
}