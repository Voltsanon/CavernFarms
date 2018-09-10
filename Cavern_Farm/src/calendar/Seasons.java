package calendar;

public class Seasons {
	private static int seasonTag = 1;
	public static String currentSeason = "Spring";
	
	public int getSeasonTag()
	{
		return seasonTag;
	}
	
	public String getSeason()
	{	
		return currentSeason;
	}

	public void advanceSeason()
	{
		if(seasonTag == 1)
			{
				seasonTag++;
				currentSeason = "Summer";
			}
		
		if(seasonTag == 2)
			{
				seasonTag++;
				currentSeason = "Fall";
			}
		
		if(seasonTag == 2)
			{
				seasonTag++;
				currentSeason = "Winter";
			}
		
		else
			{
				seasonTag = 1;
				currentSeason = "Spring";
			}
	}
	
}
