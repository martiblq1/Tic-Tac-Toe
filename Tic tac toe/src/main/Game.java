package main;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Game
{
	private static Window window;
	private static Ending end;
	
	private static int state = 1, lines = 0;
	protected static int clicks = 0;
	
	Game()
	{
		window = new Window();
	}
	
	public static void draw(int num)
	{
		if(Window.getpanelList().get(num-1).getstate() == 0)
		{
			Window.getpanelList().get(num-1).setstate(state);
			Window.getpanelList().get(num-1).repaint();
			if(state == 1)
			{
				state = 2;
			}
			else
			{
				state = 1;
			}
			clicks++;
		}
		
		check();
	}
	
	public static void check()
	{
		//horizontal
		if(Window.getpanelList().get(1-1).getstate() == Window.getpanelList().get(2-1).getstate() && 
				Window.getpanelList().get(1-1).getstate() == Window.getpanelList().get(3-1).getstate() && 
				Window.getpanelList().get(1-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(1-1).getstate() + " won!");
			win(1, 1, 2, 3);
			lines = 1;
		}
		
		if(Window.getpanelList().get(4-1).getstate() == Window.getpanelList().get(5-1).getstate() && 
				Window.getpanelList().get(4-1).getstate() == Window.getpanelList().get(6-1).getstate() && 
				Window.getpanelList().get(4-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(4-1).getstate() + " won!");
			win(1, 4, 5, 6);
			lines = 1;
		}
		
		if(Window.getpanelList().get(7-1).getstate() == Window.getpanelList().get(8-1).getstate() && 
				Window.getpanelList().get(7-1).getstate() == Window.getpanelList().get(9-1).getstate() && 
				Window.getpanelList().get(7-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(7-1).getstate() + " won!");
			win(1, 7, 8, 9);
			lines = 1;
		}
		
		//vertical
		if(Window.getpanelList().get(1-1).getstate() == Window.getpanelList().get(4-1).getstate() && 
				Window.getpanelList().get(1-1).getstate() == Window.getpanelList().get(7-1).getstate() && 
				Window.getpanelList().get(1-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(1-1).getstate() + " won!");
			win(2, 1, 4, 7);
			lines = 1;
		}
		
		if(Window.getpanelList().get(2-1).getstate() == Window.getpanelList().get(5-1).getstate() && 
				Window.getpanelList().get(2-1).getstate() == Window.getpanelList().get(8-1).getstate() && 
				Window.getpanelList().get(2-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(2-1).getstate() + " won!");
			win(2, 2, 5, 8);
			lines = 1;
		}
		
		if(Window.getpanelList().get(3-1).getstate() == Window.getpanelList().get(6-1).getstate() && 
				Window.getpanelList().get(3-1).getstate() == Window.getpanelList().get(9-1).getstate() && 
				Window.getpanelList().get(3-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(3-1).getstate() + " won!");
			win(2, 3, 6, 9);
			lines = 1;
		}
		
		//diagonal
		if(Window.getpanelList().get(1-1).getstate() == Window.getpanelList().get(5-1).getstate() && 
				Window.getpanelList().get(1-1).getstate() == Window.getpanelList().get(9-1).getstate() && 
				Window.getpanelList().get(1-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(1-1).getstate() + " won!");
			win(3, 1, 5, 9);
			lines = 1;
		}
		
		if(Window.getpanelList().get(3-1).getstate() == Window.getpanelList().get(5-1).getstate() && 
				Window.getpanelList().get(3-1).getstate() == Window.getpanelList().get(7-1).getstate() && 
				Window.getpanelList().get(3-1).getstate() != 0)
		{
			System.out.println(Window.getpanelList().get(3-1).getstate() + " won!");
			win(4, 3, 5, 7);
			lines = 1;
		}
		
		if(clicks == 9 && lines == 0)
		{
			lost(69);
		}
	}
	
	public static void win(int direction, int cell1, int cell2, int cell3)//direction: 1- horizontal, 2- vertical, 3- diagonal-right, 4-diagonal-left
	{
		Window.getpanelList().get(cell1-1).setdirection(direction);
		Window.getpanelList().get(cell1-1).setwon(1);
		Window.getpanelList().get(cell1-1).repaint();
		Window.getpanelList().get(cell2-1).setdirection(direction);
		Window.getpanelList().get(cell2-1).setwon(1);
		Window.getpanelList().get(cell2-1).repaint();
		Window.getpanelList().get(cell3-1).setdirection(direction);
		Window.getpanelList().get(cell3-1).setwon(1);
		Window.getpanelList().get(cell3-1).repaint();
		end = new Ending(cell1);
	}
	
	public static void lost(int cell1)
	{
		end = new Ending(cell1);
	}
	
	public static void restart()
	{
		for(int i = 0; i < 9; i++)
		{
			Window.getpanelList().get(i).setstate(3);
			Window.getpanelList().get(i).repaint();
			state = 1;
			clicks = 0;
			lines = 0;
		}
	}
	
	public static int getclicks()
	{
		return clicks;
	}
}
