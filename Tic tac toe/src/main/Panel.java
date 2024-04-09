package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Panel extends JPanel
{	
	private Mouse mouse;
	private JLabel label;
	private BufferedImage image;
	
	protected int num, state = 0, won = 0, direction = 0;
	
	Panel(int x, int y, int name, Color color)
	{
		//this.setBackground(color);
		this.setBounds(x*333, y*333, 333, 333);
		this.setPreferredSize(new Dimension(333, 333));
		this.setMinimumSize(new Dimension(333, 333));
		this.setMaximumSize(new Dimension(333, 333));
		this.setDoubleBuffered(true);
		this.setEnabled(true);
		this.setFocusable(true);//idk
		num = name;
		this.setVisible(true);
		mouse = new Mouse();
		this.addMouseListener(mouse);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		if(state == 1)
		{
			try
			{
				image = ImageIO.read(new File("res/Circle.png"));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
				
		}
		
		if(state == 2)
		{
			try
			{
				image = ImageIO.read(new File("res/X.png"));
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
				
		}
		
		g.drawImage(image, 90, 90,null);
		
		if(state == 3)
		{
			g.clearRect(0, 0, 333, 333);
			mouse.setenabled(true);
			won = 0;
			state = 0;
		}
		
		g.drawLine(0, 0, 0, 333);
		g.drawLine(0, 0, 333, 0);
		
		if(won == 1)
		{
			for(int i = 0; i < 9; i++)
			{	
				Window.getpanelList().get(i).mouse.setenabled(false);
			}
			
			if(direction == 1)
			{
				g.drawLine(0, 333/2, 333, 333/2);
			}
			else if(direction == 2)
			{
				g.drawLine(333/2, 0, 333/2, 333);
			}
			else if(direction == 3)
			{
				g.drawLine(0, 0, 333, 333);
			}
			else if(direction == 4)
			{
				g.drawLine(333, 0, 0, 333);
			}
		}
	}
	
	public int getname()
	{
		return num;
	}
	
	public void setstate(int state)
	{
		this.state = state;
	}
	
	public int getstate()
	{
		return state;
	}
	
	public void setwon(int won)
	{
		this.won = won;
	}
	
	public void setdirection(int direction)
	{
		this.direction = direction;
	}
}
