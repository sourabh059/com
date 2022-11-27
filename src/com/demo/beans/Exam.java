package com.demo.beans;


import java.util.Date;

public class Exam 
{
	private int examid;
	private String ename;
	private Date edate;
	private Question[] Q;
	

	public Exam() 
	{
		
		this.examid = 0;
		this.ename = null;
		this.edate = null;
		Q = null;
	}

	public Exam(int examid, String ename,Date edate, Question Q[]) 
	{
		this.examid = examid;
		this.ename = ename;
		this.edate = edate;
		this.Q = Q;
	}

	

	public int getExamid() 
	{
		return examid;
	}

	public void setExamid(int examid)
	{
		this.examid = examid;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public Date getEdate() 
	{
		return edate;
	}

	public void setEdate(Date edate)
	{
		this.edate = edate;
	}

	public Question[] getQ()
	{
		return Q;
	}

	public void setQ(Question[] q) 
	{
		Q = q;
	}

	@Override
	public String toString() {
	    String  str= "Exam [examid= " + examid + ", ename= " + ename + "edate= "+edate;
		for(int i=0;i<Q.length;i++) {
			 str+=" "+Q[i]+"\n";
			 System.out.println(Q[i]);
		 }
		return str;
	}
	




}
