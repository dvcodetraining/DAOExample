package com.damianvaz.dao.model;

public class MySQLDAOFactory extends DAOFactory
{
	@Override
	public PersonDAO getPersonDAO()
	{
		return new MySQLPersonDAO();
	}
}
