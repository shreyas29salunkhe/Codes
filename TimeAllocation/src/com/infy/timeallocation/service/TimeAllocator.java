package com.infy.timeallocation.service;

import com.desktopallocation.service.DesktopAllocator;

public class TimeAllocator {
	static DesktopAllocator desktopAllocator=new DesktopAllocator();
	public String allocateTimeSlot(String desktopNumber) {
		if(desktopNumber.charAt(1)=='A')
		{
			return "9.00am";
		}
		else
		{
			return "1.00";
		}
	}
}
