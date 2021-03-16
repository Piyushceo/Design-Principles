package com.piyush.creational;

public class DBConn {

	private static DBConn instance = new DBConn();
	private DBConn()
	{
		super();
	}
	public static DBConn getInstance() {
		return instance;
	}
	

}
