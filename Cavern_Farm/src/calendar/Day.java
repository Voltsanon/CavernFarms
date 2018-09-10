package calendar;

import calendar.Seasons;
import calendar.Time;

public class Day {

	//45 days a season
	Seasons SSFW = new Seasons();
	Time Clock = new Time();
	
	int currentDay = 1;
	String currentSeason = SSFW.getSeason();
	
	//Sleep action, caused by player choice
	public void advanceDay()
		{
			if(currentDay != 45)
				{
					currentDay++;
					Clock.resetTime();
				}
			else
				{
					currentDay = 1;
					Clock.resetTime();
					SSFW.advanceSeason();
				}
		}
	
	//means to tell the In game time
	
	public String checkClock()
		{
			String currentTime;
			if(Clock.getMin() == 00)
				{
					currentTime = (Clock.getHour() + ":00");
				}
			else
				{
					currentTime = (Clock.getHour() + ":" + Clock.getMin());
				}
			
			return currentTime; 
		}
	
}
