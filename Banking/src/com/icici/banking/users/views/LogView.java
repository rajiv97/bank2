package com.icici.banking.users.views;

import java.util.Scanner;

import com.icici.banking.users.Dao.LogDao;
import com.icici.banking.users.dto.LogDto;
import com.icici.banking.users.helper.LogHelper;

public class LogView {
	static LogDto[] arrayy;

	public void doLogin(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the userId");
	String userId= scanner.next();
	System.out.println("enter the password");
	String password= scanner.next();
	LogDto logdto=new LogDto();
	logdto.setUserId(userId);
	logdto.setPassword(password);
	LogHelper loghelper=new LogHelper();
	LogDto Return= loghelper.checklogin(logdto,arrayy);
	
	if(Return!=null){
		System.out.println("Welcome ");
		System.out.println("enter the new psswrd");
		String newpsswrd = scanner.next();
		if(loghelper.changepsswrd(Return, newpsswrd)){
			System.out.println("passwrd has changed");
			System.out.println("new psswrd is "+ newpsswrd);
		}
		
	}
	
	
	}
	
	public static void main(String args[]){
		System.out.println("want to add");
		LogDao logdao= new LogDao();
		arrayy = logdao.userDao();
		System.out.println("*******************************************");
		LogView logview= new LogView();
		logview.doLogin();
		
	}
}
