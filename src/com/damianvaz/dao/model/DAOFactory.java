package com.damianvaz.dao.model;

public abstract class DAOFactory
{
	public static final int MYSQL   = 0;
	public static final int ORACLE  = 1;
	public static final int MONGODB = 3;
	
	public abstract PersonDAO getPersonDAO();
	
	public static DAOFactory getDAOFactory(int databaseType)
	{
		switch(databaseType)
		{
			case(MYSQL):
			{
				return new MySQLDAOFactory();
			}
			case(ORACLE):
			{
				return new OracleDAOFactory();
			}
			default:
			{
				return null;
			}
		}
	}
}