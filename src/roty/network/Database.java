package roty.network;

import java.sql.*;

public class Database {

	private Connection dbconn;
	private Statement statement;
//	private PreparedStatement preparedStatement;
	private ResultSet result;
	
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
	
	public Database(String server, String db, String user, String pass) throws Exception
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connect(server, db, user, pass);
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
/*	
	private boolean isConnected()
	{
		if(dbconn != null) return true;
		
		return false;
	}
*/	
	
	public void connect(String server, String db, String user, String pass) throws Exception
	{
		try
		{
			//System.out.println("jdbc:mysql://" + server + "/" + db + "?user=" + user + "&password=" + pass);
			
			// Setup the connection with the DB
			dbconn = DriverManager.getConnection("jdbc:mysql://" + server + "/" + db + "?user=" + user + "&password=" + pass);
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	
	// You need to close the resultSet
	public void close() 
	{
		try 
		{
			if (result != null) 
			{
				result.close();
			}

			if (statement != null) 
			{
				statement.close();
			}
	
			if (dbconn != null) 
			{
				dbconn.close();
			}
		} 
		catch (Exception e){}
	}
	
	public void executeQuery(String _statement) throws Exception
	{
		try 
		{
			statement = dbconn.createStatement();
			result = statement.executeQuery(_statement);
		} 
		catch (Exception e) 
		{
			throw e;
		}
	}
	
	public ResultSet getResult() throws Exception
	{
		try 
		{}
		catch (Exception e) 
		{
			throw e;
		}	
		
		return result;
	}

}
