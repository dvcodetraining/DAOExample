package com.damianvaz.dao;

import javax.swing.SwingUtilities;

import com.damianvaz.dao.controller.Controller;
import com.damianvaz.dao.model.Model;
import com.damianvaz.dao.view.View;

public class Application
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				runApp();
			}

		});
	}

	public static void runApp()
	{
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);

		view.setLoginListener(controller);
	}

}
