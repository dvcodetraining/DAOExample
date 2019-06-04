package com.damianvaz.dao.model;

import java.sql.SQLException;
import java.util.List;

public class OraclePersonDAO implements PersonDAO
{
/*
 * (non-Javadoc)
 * @see com.damianvaz.dao.model.PersonDAO#addPerson(com.damianvaz.dao.model.Person)
 * Dummy implementation of a Oracle SQL database
 */
	@Override
	public int addPerson(Person person) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Person getPerson(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getPeople() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePerson(Person person) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePerson(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll() throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
