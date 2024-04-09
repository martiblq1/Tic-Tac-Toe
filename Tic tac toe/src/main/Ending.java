package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ending extends JFrame
{
	private JPanel panel;
	private JLabel label;
	
	private int ach = 0; // 1-tedko, 2-dick, 3-CORNER, 4-box, 5-diagonal, 6-plus
	
	Ending(int cell)
	{
		this.setVisible(true);
		this.setSize(400, 100);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		panel = new JPanel();
		label = new JLabel();
		label.setVisible(true);
		//label.setText("WOn");
		achievemnt();
		
		if(ach == 1)
		{
			label.setText("Ending 3 : Tedko");
		}
		else if(ach == 2)
		{
			label.setText("Ending 4 : Dick");
		}
		else if(ach == 3)
		{
			label.setText("Ending 5 : CORNER");
		}
		else if(ach == 4)
		{
			label.setText("Ending 6 : you got a box... are you happy?");
		}
		else if(ach == 5)
		{
			label.setText("Ending 7 : Was the double diagonal worth breaking my game?");
		}
		else if(ach == 6)
		{
			label.setText("Ending 8 : *sigh* you did it again...");
		}
		else if(cell == 69)
		{
			label.setText("Ending 9 : Purgatory. The true ending?");
		}
		else if(Window.getpanelList().get(cell-1).getstate() == 1)
		{
			label.setText("Ending 1 : Yes, yes, you won... But at what cost?");
		}
		else if(Window.getpanelList().get(cell-1).getstate() == 2)
		{
			label.setText("Ending 2 : Either you are very smart or player 1 is... not smart.");
		}
		
		label.setBounds(0, 0, 400, 80);
		panel.setVisible(true);
		panel.add(label);
		this.add(label);
	}
	
	public void achievemnt()
	{
		//tedko
		if(Window.getpanelList().get(1-1).getstate() != Window.getpanelList().get(5-1).getstate() &&
				Window.getpanelList().get(5-1).getstate() == Window.getpanelList().get(8-1).getstate() &&
				Window.getpanelList().get(1-1).getstate() != 0 && Window.getpanelList().get(5-1).getstate() != 0 &&
				Window.getpanelList().get(4-1).getstate() == 0 && Window.getpanelList().get(6-1).getstate() == 0 &&
				Window.getpanelList().get(7-1).getstate() == 0 && Window.getpanelList().get(9-1).getstate() == 0)
		{
			ach = 1;
		}
		//dick
		if(Window.getpanelList().get(1-1).getstate() == 0 && Window.getpanelList().get(2-1).getstate() == 1 &&
				Window.getpanelList().get(3-1).getstate() == 0 && Window.getpanelList().get(4-1).getstate() == 0 &&
				Window.getpanelList().get(5-1).getstate() == 1 && Window.getpanelList().get(6-1).getstate() == 0 &&
				Window.getpanelList().get(7-1).getstate() == 2 && Window.getpanelList().get(8-1).getstate() == 1 &&
				Window.getpanelList().get(9-1).getstate() == 2)
		{
			ach = 2;
		}
		//CORNER
		if(Window.getpanelList().get(1-1).getstate() != 0 && Window.getpanelList().get(2-1).getstate() != 0 &&
				Window.getpanelList().get(3-1).getstate() != 0 && Window.getpanelList().get(4-1).getstate() != 0 &&
				Window.getpanelList().get(5-1).getstate() == 0 && Window.getpanelList().get(6-1).getstate() == 0 &&
				Window.getpanelList().get(7-1).getstate() != 0 && Window.getpanelList().get(8-1).getstate() == 0 &&
				Window.getpanelList().get(9-1).getstate() == 0)
		{
			ach = 3;
		}
		//box
		if(Window.getpanelList().get(1-1).getstate() != 0 && Window.getpanelList().get(2-1).getstate() != 0 &&
				Window.getpanelList().get(3-1).getstate() != 0 && Window.getpanelList().get(4-1).getstate() != 0 &&
				Window.getpanelList().get(5-1).getstate() == 0 && Window.getpanelList().get(6-1).getstate() != 0 &&
				Window.getpanelList().get(7-1).getstate() != 0 && Window.getpanelList().get(8-1).getstate() != 0 &&
				Window.getpanelList().get(9-1).getstate() != 0)
		{
			ach = 4;
		}
		//diagonal
		if(Window.getpanelList().get(1-1).getstate() == 1 && Window.getpanelList().get(2-1).getstate() == 2 &&
				Window.getpanelList().get(3-1).getstate() == 1 && Window.getpanelList().get(4-1).getstate() == 2 &&
				Window.getpanelList().get(5-1).getstate() == 1 && Window.getpanelList().get(6-1).getstate() == 2 &&
				Window.getpanelList().get(7-1).getstate() == 1 && Window.getpanelList().get(8-1).getstate() == 2 &&
				Window.getpanelList().get(9-1).getstate() == 1)
		{
			ach = 5;
		}
		//plus
		if(Window.getpanelList().get(1-1).getstate() == 2 && Window.getpanelList().get(2-1).getstate() == 1 &&
				Window.getpanelList().get(3-1).getstate() == 2 && Window.getpanelList().get(4-1).getstate() == 1 &&
				Window.getpanelList().get(5-1).getstate() == 1 && Window.getpanelList().get(6-1).getstate() == 1 &&
				Window.getpanelList().get(7-1).getstate() == 2 && Window.getpanelList().get(8-1).getstate() == 1 &&
				Window.getpanelList().get(9-1).getstate() == 2)
		{
			ach = 6;
		}
	}
}
