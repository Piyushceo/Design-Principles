package com.piyush.main;

import com.piyush.creational.DBConn;

public class DBConnImpl {

	public static void main(String[] args) {

		DBConn db1 = DBConn.getInstance();
		DBConn db2 = DBConn.getInstance();
		System.out.println(db1.equals(db2));
	}

}
