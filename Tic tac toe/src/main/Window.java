package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Window extends JFrame
{
	private Panel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9;
	
	protected int SCREEN_WIDTH = 999, SCREEN_HEIGHT = 999;
	protected static ArrayList<Panel> panelList = new ArrayList<>();
	
	Window()
	{
		this.setTitle("Tic Tac Toe");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		setPanes();
	}
	
	private void setPanes()
	{
		panel1 = new Panel(0, 0, 1, Color.BLACK);
		panel2 = new Panel(1, 0, 2, Color.RED);
		panel3 = new Panel(2, 0, 3, Color.GREEN);
		panel4 = new Panel(0, 1, 4, Color.BLACK);
		panel5 = new Panel(1, 1, 5, Color.RED);
		panel6 = new Panel(2, 1, 6, Color.GREEN);
		panel7 = new Panel(0, 2, 7, Color.BLACK);
		panel8 = new Panel(1, 2, 8, Color.RED);
		panel9 = new Panel(2, 2, 9, Color.GREEN);
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);
		this.add(panel7);
		this.add(panel8);
		this.add(panel9);
		panelList.add(panel1);
		panelList.add(panel2);
		panelList.add(panel3);
		panelList.add(panel4);
		panelList.add(panel5);
		panelList.add(panel6);
		panelList.add(panel7);
		panelList.add(panel8);
		panelList.add(panel9);
	}
	
	public static ArrayList<Panel> getpanelList()
	{
		return panelList;
	}
}
