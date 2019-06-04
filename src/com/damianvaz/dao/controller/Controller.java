package com.damianvaz.dao.controller;

import java.sql.SQLException;

import com.damianvaz.dao.model.DAOFactory;
import com.damianvaz.dao.model.Model;
import com.damianvaz.dao.model.Person;
import com.damianvaz.dao.model.PersonDAO;
import com.damianvaz.dao.view.CreateUserEvent;
import com.damianvaz.dao.view.CreateUserListener;
import com.damianvaz.dao.view.View;

public class Controller implements CreateUserListener
{
	private View view;
	private Model model;

//	private PersonDAO personDAO = MySQLDAOFactory.getPersonDAO();

	public Controller(View view, Model model)
	{
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event)
	{
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		PersonDAO personDAO = factory.getPersonDAO();
		
		try
		{
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
