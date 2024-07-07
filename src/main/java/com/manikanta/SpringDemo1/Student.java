package com.manikanta.SpringDemo1;

public class Student {
   int sid;
   String sname;
   public void  show() {
	   System.out.println("sid"+ sid);
	   System.out.println("sname"+ sname);
   }
   public  Student() {
	   System.out.println("default Constructor");
   }
   public Student(int sid) {
	   System.out.println("one arg cons");
	   this.sid=sid;
	   
   }
   public Student(String sname) {
	   this.sname=sname;
	   
   }
   public Student (int sid, String sname)
   {
	   this.sid=sid;
	   this.sname=sname;
	   
   }
   
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}
   
}
