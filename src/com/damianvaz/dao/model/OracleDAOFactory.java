package com.damianvaz.dao.model;

public class OracleDAOFactory extends DAOFactory
{

	@Override
	public PersonDAO getPersonDAO()
	{
		return new OraclePersonDAO();
	}

}
