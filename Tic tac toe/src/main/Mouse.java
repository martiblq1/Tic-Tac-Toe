package main;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener
{	
	protected boolean enabled;
	
	Mouse()
	{
		enabled = true;
	}
	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		if(!enabled || Game.getclicks() == 9)
		{
			Game.restart();
		}
		else if(enabled)
		{
			for(int i = 0; i < 9; i++)
			{
				if(e.getSource().hashCode() == Window.getpanelList().get(i).hashCode())
				{
					System.out.println(Window.getpanelList().get(i).getname());
					Game.draw(Window.getpanelList().get(i).getname());
				}
			}
		}
	}

	public void setenabled(boolean enabled)
	{
		this.enabled = enabled;
	}
	
	@Override
	public void mouseEntered(MouseEvent e)
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{		
		
	}
}
