package com.demo.beans;

public class Question
{
	private int queno;
	private String que;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	private String marks;
	public Question() 
	{
		super();
		this.queno = 0;
		this.que = null;
		this.opt1 = null;
		this.opt2 = null;
		this.opt3 = null;
		this.opt4 = null;
		this.ans = null;
		this.marks = null;
	}



	public Question(int queno, String que, String opt1, String opt2, String opt3, String opt4, String ans, String marks) 
	{
		super();
		this.queno = queno;
		this.que = que;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.marks = marks;
	}



	public int getQueno() 
	{
		return queno;
	}



	public void setQueno(int queno) 
	{
		this.queno = queno;
	}



	public String getQue()
	{
		return que;
	}



	public void setQue(String que)
	{
		this.que = que;
	}



	public String getOpt1() 
	{
		return opt1;
	}



	public void setOpt1(String opt1) 
	{
		this.opt1 = opt1;
	}



	public String getOpt2()
	{
		return opt2;
	}



	public void setOpt2(String opt2)
	{
		this.opt2 = opt2;
	}



	public String getOpt3() 
	{
		return opt3;
	}



	public void setOpt3(String opt3)
	{
		this.opt3 = opt3;
	}



	public String getOpt4() 
	{
		return opt4;
	}



	public void setOpt4(String opt4) 
	{
		this.opt4 = opt4;
	}



	public String getAns()
	{
		return ans;
	}



	public void setAns(String ans)
	{
		this.ans = ans;
	}



	public String getMarks()
	{
		return marks;
	}



	public void setMarks(String marks) 
	{
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Question [queno=" + queno + ", que=" + que + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
				+ ", opt4=" + opt4 + ", ans=" + ans + ", marks=" + marks + "]";
	}
	


}
