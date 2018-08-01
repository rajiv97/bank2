package com.icici.banking.users.Dao;

import java.util.Scanner;

import com.icici.banking.users.dto.LogDto;

public class LogDao {
	Scanner scanner = new Scanner(System.in);
int i;
public LogDto[] userDao(){
	
	LogDto array[]= new LogDto[4];
	for(i=0;i<=3;i++){
	LogDto logdto= new LogDto();
	System.out.println("enter the userrrrrId");
	String userId= scanner.next();
	logdto.setUserId(userId);
	System.out.println("enter the psswrrrrrd");
	String password = scanner.next();
	logdto.setPassword(password);
	array[i]= logdto;
	}
return array;	

}


}
