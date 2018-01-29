package enamel;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame {
	private JFrame frame;

	private JPanel panel;
	private JButton open;
	private JButton create;

	public MainFrame() {
		frame = new JFrame();
		frame.setTitle("Main");
		frame.setBounds(100, 100, 627, 459);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		panel = new JPanel();
		panel.setSize(200, 50);

		open = new JButton("Open");
		open.addMouseListener(new Click());
		panel.add(this.open);

		create = new JButton("Create");
		open.addActionListener(null);
		this.panel.add(this.create);

		frame.add(panel);
		frame.repaint();
		frame.setVisible(true);
	}

	class Click implements MouseListener {
		private void open() {
			// here should be file chooser
		}

		private void create() {
			// here should open a new UI to create the file
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1)
				if (e.getSource().equals(open))
					open();
			if (e.getSource().equals(create))
				create();
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
	}
}
