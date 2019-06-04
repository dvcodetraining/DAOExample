package com.damianvaz.dao.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database
{

	private static Database instance = new Database();

	private Connection con;

	private Database()
	{

	}

	public static Database getInstance()
	{
		return instance;
	}

	/*
	 * private static Database instanceOld;
	 * 
	 * public static Database getInstanceOld() { if(instanceOld == null) {
	 * instanceOld = new Database(); }
	 * 
	 * return instanceOld; }
	 */

	/*
	 * Add whatever methods you like to your singleton class.
	 */

	public Connection getConnection()
	{
		return con;
	}

	public void connect() throws Exception
	{
		if (con != null)
		{
			return;
		}
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e)
		{
			throw new Exception("Driver not found");
		}
	//	jdbc:mysql://localhost:3306/?user=root ?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC
		//String url = String.format("jdbc:mysql://localhost:%d/patterns", 3306);
		//jdbc:mysql://127.0.0.1:3306/sys?user=root  root@127.0.0.1:3306
		String url = String.format("jdbc:mysql://127.0.0.1:%d/sys?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", 3306);

		con = DriverManager.getConnection(url, "root", "letmein");
		System.out.println("Database Connected Successfully ");
		
	}

	public void disconnect()
	{
		if (con != null)
		{
			try
			{
				con.close();
			} catch (SQLException e)
			{
				System.out.println("Can't close connection");
			}
		}

		con = null;
		System.out.println("Conection to database closed");
	}

}
