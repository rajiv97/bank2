package com.icici.banking.users.helper;

import java.util.Scanner;

import com.icici.banking.users.Dao.LogDao;
import com.icici.banking.users.dto.LogDto;
import com.icici.banking.users.views.LogView;

public class LogHelper {
	LogDto[] array;
	
	
	public boolean changepsswrd(LogDto data,String newpsswrd){
		if(data!=null){
		data.setPassword(newpsswrd);
		return true;
	}
	return false;	
	}
	
	
	
	public LogDto checklogin(LogDto logdto,LogDto[] arrayy)
	{
		//LogDao logdao= new LogDao();
		array= arrayy;
				//logdao.userDao();
		
		for(LogDto data : array){
			if((logdto.getUserId().equals(data.getUserId()))&&
					(logdto.getPassword().equals(data.getPassword())))
			{
				
				return data;
			//System.out.println("Welcome jaan");
			}
			
//			else {
//				System.out.println("1.try again /n 2. want to change password?");
//				Scanner scanner=new Scanner(System.in);
//				int ans= scanner.nextInt();
//				if(ans==1){
//				LogView logview = new LogView();
//			logview.doLogin();
//		}
//				else
//				{
//					String newpsswrd= scanner.next();
//					
//					data.setPassword(newpsswrd);
//					System.out.println("new psswrd is "+ data.getPassword());
////   				LogView logview= new LogView();
////					logview.doLogin();
////					LogHelper loghelper=new LogHelper();
////					loghelper.checklogin(logdto);
//				}
//				}
			
				
		}
		return null;
	}
	
}


