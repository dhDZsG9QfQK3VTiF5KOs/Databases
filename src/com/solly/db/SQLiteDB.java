package com.solly.db;


import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Driver;

import org.sqlite.JDBC;


public class SQLiteDB extends Database {
	public static Driver[] drivers = {new JDBC()};
	
	public SQLiteDB(File file) throws URISyntaxException {
		super(new URI("jdbc:sqlite:" + file.toString()));
	}
	
	public SQLiteDB(URI uri) throws URISyntaxException {
		super(new URI("jdbc:sqlite:" + uri.toString()));
	}
	
	public SQLiteDB(String uri) throws URISyntaxException {
		super(new URI("jdbc:sqlite:" + uri));
	}
}
