package com.demo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.demo.beans.Exam;
import com.demo.beans.Question;

public class TestExam 
{
	public static void main(String[] args)
	{
		Question Q[]=  new Question[5];
		Exam ex[]=new Exam[2];
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		
		Q[0]=new Question(1,"sahdk","hdfg","jdfgh","fjdhg","jsdfh","fgjf","fhfg");
		String dt="22/09/2022";
		//convert String to Date
		Date expdt;
		try {
			expdt = sdf.parse(dt);
	          ex[0]=new Exam(1,"sourabh",expdt,Q);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
		System.out.println(ex[0]);
		
				
	
	}
}
