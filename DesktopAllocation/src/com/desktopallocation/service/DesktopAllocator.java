package com.desktopallocation.service;

public class DesktopAllocator {
int number;
public String allocateDesktopNumber(int rollNumber)
{
	String rno=Integer.toString(rollNumber);
	if(rollNumber%2==0)
	{
		return rno.charAt(0)+"A";
	}
	else
	{
		return rno.charAt(0)+"B";
	}
}
}
