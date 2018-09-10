package calendar;

import java.util.Timer;
import java.util.TimerTask;

public class Time {
	private Timer crystalClock = new Timer();
	private Mins minuteHandCC = new Mins();
	private int dayStartTimeHour = 7;
	private int dayStartTimeMin = 00;
	
	public int currentTimeHour = 7;
	public int currentTimeMin = 0;
	public boolean morning = true;
	
	public void timeStart()
		{
			crystalClock.schedule(minuteHandCC, 120000, 120000);
		}
	
	public int getHour()
		{
			return currentTimeHour;
		}
		
	public int getMin()
		{
			return currentTimeMin;
		}
	
	public void resetTime()
		{
			currentTimeHour = dayStartTimeHour;
			currentTimeMin = dayStartTimeMin;
			morning = true;
		}
		
	public void advanceMin()
		{

			if(getMin() < 40)
				{
					currentTimeMin = (getMin() + 20);
				}
			
			else
				{
					advanceHour();
					currentTimeMin = 0;
				}
		
		}
	public void advanceHour()
	{
			if((currentTimeHour < 11) && morning)
				{
					currentTimeHour++;
				}
			
			if((currentTimeHour == 11) && morning)
				{
					currentTimeHour++;
					morning = false;
				}
			if((currentTimeHour < 11) && !morning)
				{
					currentTimeHour++;
				}
			if((currentTimeHour == 11) && !morning)
			{
				currentTimeHour++;
				morning = true;
			}
		}
}

class Mins extends TimerTask {
	private Time minuteCount = new Time();
	
    public void run() 
	    {
    		minuteCount.advanceMin();
	    }
}
