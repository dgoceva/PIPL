import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Types;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!
public class JDBC_example {
	Connection conn = null;

	public void getConnection() {
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/coffee?"
					+ "user=root");
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getSelectStatement(boolean isTopDown) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			if (isTopDown) {
				stmt = conn.createStatement();
				rs = stmt
						.executeQuery("select COF_NAME, PRICE, SALES, TOTAL from COFFEES");
				// or alternatively, if you don't know ahead of time that
				// the query will be a SELECT...
				// if (stmt.execute("select SUP_Name, CITY from Supplier")) {
				// rs = stmt.getResultSet();
				// }
				// Now do something with the ResultSet ....
				while (rs.next()) {
					String name = rs.getString("COF_NAME");
					float price = rs.getFloat("PRICE");
					String sale = rs.getString("SALES");
					int total = rs.getInt("TOTAL");
					System.out.println(name + "     " + price + "    " + sale
							+ "    " + total);
				}
			} else {
				stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				rs = stmt.executeQuery("SELECT COF_NAME, PRICE FROM COFFEES");
				if (rs.isAfterLast() == false) {
					rs.afterLast();
				}
				while (rs.previous()) {
					String name = rs.getString("COF_NAME");
					float price = rs.getFloat("PRICE");
					System.out.println(name + "     " + price);
				}
			}
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore
				stmt = null;
			}
		}
	}

	public void updateResultSet(String coffee_name, float coffee_price,
			float old_price) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select cof_name, price from coffees "
					+ "where price = " + old_price);
			rs.next();
			rs.updateString("COF_NAME", coffee_name);
			rs.updateFloat("price", coffee_price);
			rs.updateRow();
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore
				stmt = null;
			}
		}
	}

	public void updateTable(String sqlCommand) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sqlCommand);
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore
				stmt = null;
			}
		}
	}

	public void updatePreparedStatement() {
		PreparedStatement stmt = null;
		try {
			stmt = conn
					.prepareStatement("UPDATE COFFEES SET SALES = ? WHERE COF_NAME LIKE ? ");
			stmt.setInt(1, 0);
			stmt.setString(2, "Colombian");
			stmt.executeUpdate();
			stmt.setInt(1, 100);
			stmt.setString(2, "French_Roast");
			stmt.executeUpdate();
			stmt.setString(2, "Espresso");
			stmt.executeUpdate();
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore
				stmt = null;
			}
		}
	}

	public void getJoinSelect(String sqlSelect) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlSelect);
			System.out.println("Coffees bought from Acme, Inc.: ");
			while (rs.next()) {
				String coffeeName = rs.getString("COF_NAME");
				System.out.println("     " + coffeeName);
			}
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore
				stmt = null;
			}
		}
	}

	public void transactionExample() {
		PreparedStatement stmt = null;
		try {
			conn.setAutoCommit(false);
			stmt = conn
					.prepareStatement("UPDATE COFFEES SET SALES = ? WHERE COF_NAME LIKE ?");
			stmt.setInt(1, 50);
			stmt.setString(2, "Colombian");
			stmt.executeUpdate();
			stmt = conn
					.prepareStatement("UPDATE COFFEES SET TOTAL = TOTAL + ? WHERE COF_NAME LIKE ?");
			stmt.setInt(1, 50);
			stmt.setString(2, "Colombian");
			stmt.executeUpdate();
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {
				} // ignore
				stmt = null;
			}
		}
	}

	public void callableStatement() {
		//
		// Prepare a call to the stored procedure 'demoSp'
		// with two parameters
		//
		// Notice the use of JDBC-escape syntax ({call ...})
		//
		CallableStatement cStmt;
		try {
			cStmt = conn.prepareCall("{call demoSp(?, ?)}");
			//
			// Set a parameter by index
			//
			cStmt.setString(1, "abcdefg");
			//
			// Alternatively, set a parameter using
			// the parameter name
			//
			cStmt.setString("inputParam", "abcdefg");
			//
			// Set the 'in/out' parameter using an index
			//
			cStmt.setInt(2, 1);
			//
			// Alternatively, set the 'in/out' parameter
			// by name
			//
			cStmt.setInt("inOutParam", 1);
			//
			// Connector/J supports both named and indexed
			// output parameters. You can register output
			// parameters using either method, as well
			// as retrieve output parameters using either
			// method, regardless of what method was
			// used to register them.
			//
			// The following examples show how to use
			// the various methods of registering
			// output parameters (you should of course
			// use only one registration per parameter).
			//
			//
			// Registers the second parameter as output, and
			// uses the type 'INTEGER' for values returned from
			// getObject()
			//
			cStmt.registerOutParameter(2, Types.INTEGER);
			//
			// Registers the named parameter 'inOutParam', and
			// uses the type 'INTEGER' for values returned from
			// getObject()
			//
			cStmt.registerOutParameter("inOutParam", Types.INTEGER);
			boolean hadResults = cStmt.execute();
			//
			// Process all returned result sets
			//
			while (hadResults) {
				ResultSet rs = cStmt.getResultSet();
				// process result set
				rs.next();
				System.out.println(rs.getString(1));
				hadResults = cStmt.getMoreResults();
			}
			//
			// Retrieve output parameters
			//
			// Connector/J supports both index-based and
			// name-based retrieval
			//
			int outputValue = cStmt.getInt(2); // index-based
			outputValue = cStmt.getInt("inOutParam"); // name-based
			System.out.println(outputValue);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getGeneratedKeys() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//
			// Create a Statement instance that we can use for
			// 'normal' result sets assuming you have a
			// Connection 'conn' to a MySQL database already
			// available
			stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
					java.sql.ResultSet.CONCUR_UPDATABLE);
			//
			// Issue the DDL queries for the table for this example
			//
			stmt.executeUpdate("DROP TABLE IF EXISTS autoIncTutorial");
			stmt.executeUpdate("CREATE TABLE autoIncTutorial ("
					+ "priKey INT NOT NULL AUTO_INCREMENT, "
					+ "dataField VARCHAR(64), PRIMARY KEY (priKey))");
			//
			// Insert one row that will generate an AUTO INCREMENT
			// key in the 'priKey' field
			//
			stmt.executeUpdate("INSERT INTO autoIncTutorial (dataField) "
					+ "values ('Can I Get the Auto Increment Field?')",
					Statement.RETURN_GENERATED_KEYS);
			//
			// Example of using Statement.getGeneratedKeys()
			// to retrieve the value of an auto-increment
			// value
			//
			int autoIncKeyFromApi = -1;
			rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				autoIncKeyFromApi = rs.getInt(1);
			} else {
				// throw an exception from here
			}
			rs.close();
			rs = null;
			System.out.println("Key returned from getGeneratedKeys():"
					+ autoIncKeyFromApi);
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
					// ignore
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException ex) {
					// ignore
				}
			}
		}
	}

	public void select_Last_ID() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//
			// Create a Statement instance that we can use for
			// 'normal' result sets.
			stmt = conn.createStatement();
			//
			// Issue the DDL queries for the table for this example
			//
			stmt.executeUpdate("DROP TABLE IF EXISTS autoIncTutorial");
			stmt.executeUpdate("CREATE TABLE autoIncTutorial ("
					+ "priKey INT NOT NULL AUTO_INCREMENT, "
					+ "dataField VARCHAR(64), PRIMARY KEY (priKey))");
			//
			// Insert one row that will generate an AUTO INCREMENT
			// key in the 'priKey' field
			//
			stmt.executeUpdate("INSERT INTO autoIncTutorial (dataField) "
					+ "values ('Can I Get the Auto Increment Field?')");
			//
			// Use the MySQL LAST_INSERT_ID()
			// function to do the same thing as getGeneratedKeys()
			//
			int autoIncKeyFromFunc = -1;
			rs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
			if (rs.next()) {
				autoIncKeyFromFunc = rs.getInt(1);
			} else {
				// throw an exception from here
			}
			rs.close();
			System.out.println("Key returned from "
					+ "'SELECT LAST_INSERT_ID()': " + autoIncKeyFromFunc);
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
					// ignore
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException ex) {
					// ignore
				}
			}
		}
	}

	public void updatableResultSet() {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//
			// Create a Statement instance that we can use for
			// 'normal' result sets as well as an 'updatable'
			// one, assuming you have a Connection 'conn' to
			// a MySQL database already available
			//
			stmt = conn.createStatement(java.sql.ResultSet.TYPE_FORWARD_ONLY,
					java.sql.ResultSet.CONCUR_UPDATABLE);
			//
			// Issue the DDL queries for the table for this example
			//
			stmt.executeUpdate("DROP TABLE IF EXISTS autoIncTutorial");
			stmt.executeUpdate("CREATE TABLE autoIncTutorial ("
					+ "priKey INT NOT NULL AUTO_INCREMENT, "
					+ "dataField VARCHAR(64), PRIMARY KEY (priKey))");
			//
			// Example of retrieving an AUTO INCREMENT key
			// from an updatable result set
			//
			rs = stmt.executeQuery("SELECT priKey, dataField "
					+ "FROM autoIncTutorial");
			rs.moveToInsertRow();
			rs.updateString("dataField", "AUTO INCREMENT here?");
			rs.insertRow();
			//
			// the driver adds rows at the end
			//
			rs.last();
			//
			// We should now be on the row we just inserted
			//
			int autoIncKeyFromRS = rs.getInt("priKey");
			rs.close();
			rs = null;
			System.out.println("Key returned for inserted row: "
					+ autoIncKeyFromRS);
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
					// ignore
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException ex) {
					// ignore
				}
			}
		}
	}

	public static void main(String[] args) {
		JDBC_example jdbc = new JDBC_example();
		jdbc.getConnection();
		 jdbc.getSelectStatement(false);
		 jdbc.updateResultSet("Foldgers", (float) 10.99, (float) 7.99);
		 jdbc.getSelectStatement(true);
		 jdbc.updateResultSet("Colombian", (float)7.99, (float) 10.99);
		 jdbc.getSelectStatement(true);
		 jdbc.updateTable("UPDATE COFFEES SET SALES = 75 "
		 + "WHERE COF_NAME LIKE 'Colombian'");
		 jdbc.getSelectStatement(true);
		 jdbc.updatePreparedStatement();
		 jdbc.getSelectStatement(true);
		 jdbc
		 .getJoinSelect("SELECT COFFEES.COF_NAME FROM COFFEES, SUPPLIERS "
		 +
		 "WHERE SUPPLIERS.SUP_NAME LIKE 'Acme, Inc.' and SUPPLIERS.SUP_ID = COFFEES.SUP_ID");
		 jdbc.transactionExample();
		 jdbc.getSelectStatement(true);
		 jdbc.callableStatement();
		jdbc.getGeneratedKeys();
		jdbc.select_Last_ID();
		jdbc.updatableResultSet();
	}
}