package com.solly.db;


import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Class for accessing a JDBC database
 */
public class Database {
	public static Driver[]	drivers	= {};
	public URI				uri;
	
	public Database(URI uri) {
		this.uri = uri;
	}
	
	public Database(String uri) throws URISyntaxException {
		this.uri = new URI(uri);
	}
	
	public Database(URL url) throws URISyntaxException {
		this.uri = url.toURI();
	}
	
	public static void registerDriver() throws SQLException {
		for(Driver driver : drivers) {
			DriverManager.registerDriver(driver);
		}
	}
	
	public static void deregisterDriver() throws SQLException {
		for(Driver driver : drivers) {
			DriverManager.deregisterDriver(driver);
		}
	}
}
