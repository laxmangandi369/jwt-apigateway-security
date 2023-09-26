package com.springboot.bean;
2
3
import java.io.Serializable;
4
5
public class Student implements Serializable{
6
	
7
	private static final long serialVersionUID = -339516038496531943L;
8
	private String sno;
9
	private String name;
10
	private String sex;
11
	public String getSno() {
12
		return sno;
13
	}
14
	public void setSno(String sno) {
15
		this.sno = sno;
16
	}
17
	public String getName() {
18
		return name;
19
	}
20
	public void setName(String name) {
21
		this.name = name;
22
	}
23
	public String getSex() {
24
		return sex;
25
	}
26
	public void setSex(String sex) {
27
		this.sex = sex;
28
	}
29
	
30
	
31
}
