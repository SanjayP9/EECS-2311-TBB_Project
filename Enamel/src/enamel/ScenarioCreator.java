package enamel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScenarioCreator {

	private JFrame parent;
	private JFrame frame;
	private JPanel panel;
	private JButton addCell;
	private JButton addButton;
	private JButton next;

	JPanel southPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	LinkedList<JPanel> panelList = new LinkedList<JPanel>();
	LinkedList<JButton> buttonList = new LinkedList<JButton>();

	ScenarioCreator(JFrame parent) {
		this.parent = parent;
		frame = new JFrame();
		frame.setTitle("Scenario Creator");
		frame.setBounds(100, 100, 627, 459);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());

		panel = new JPanel();
		panel.setSize(200, 50);

		addCell = new JButton("Add Cell");
		addCell.addMouseListener(new AddComponent());
		panel.add(this.addCell);

		addButton = new JButton("Add Button");
		addButton.addMouseListener(new AddComponent());
		this.panel.add(this.addButton);

		next = new JButton("Next");
		next.addMouseListener(new AddComponent());
		this.panel.add(this.next);

		frame.add(panel);
		frame.repaint();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.addWindowListener(new Close());
	}

	class AddComponent implements MouseListener {

		void addCell() {
			PinCells pinCells = new PinCells();
			pinCells.panel.setVisible(true);
			pinCells.panel.setSize(50, 50);
			pinCells.panel.setBorder(BorderFactory.createLineBorder(Color.black));

			panelList.add(pinCells.panel);
			centerPanel.add(pinCells.panel);
			frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
		}

		void addButton() {
			// please complex it
		}

		void next() {
			// please complex it
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				if (e.getSource().equals(addCell))
					addCell();
				if (e.getSource().equals(addButton))
					addButton();
				if (e.getSource().equals(next))
					next();
			}
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

	class Close implements WindowListener {
		@Override
		public void windowOpened(WindowEvent e) {
		}

		@Override
		public void windowClosing(WindowEvent e) {
		}

		@Override
		public void windowClosed(WindowEvent e) {
			parent.setVisible(true);
		}

		@Override
		public void windowIconified(WindowEvent e) {
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
		}

		@Override
		public void windowActivated(WindowEvent e) {
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
		}
	}
}
