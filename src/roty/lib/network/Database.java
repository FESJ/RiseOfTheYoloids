package roty.lib.network;

import java.sql.*;

public class Database {

	private Connection dbconn;
//	private Statement statement;
//	private PreparedStatement preparedStatement;
//	private ResultSet resultSet;
	
	public Database() throws Exception
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			dbconn = null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	public Database(String db, String user, String pass) throws Exception
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect(db, user, pass);
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	
	public void connect(String db, String user, String pass) throws Exception
	{
		try
		{
			// Setup the connection with the DB
			dbconn = DriverManager.getConnection("jdbc:" + db + "?user=" + user + "&password=" + pass);
		}
		catch (Exception e){}
	}
	
	
	// You need to close the resultSet
	public void close() 
	{
		try 
		{	/*
			if (resultSet != null) 
			{
				resultSet.close();
			}

			if (statement != null) 
			{
				statement.close();
			}
			*/
			if (dbconn != null) 
			{
				dbconn.close();
			}
		} 
		catch (Exception e){}
	  }

}
