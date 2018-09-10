package collectables;

import java.util.Random;
import calendar.Seasons;

public class FishList {

	//Note to self fill these arrays with more the five fish
	
	private String[] springFish = new String[5];
	private String[] summerFish = new String[5];
	private String[] fallFish = new String[5];
	private String[] winterFish = new String[5];
	
	private void prepareFishList()
		{
			springFish[0] = "TestFishSP1";
			springFish[1] = "TestFishSP2";
			springFish[2] = "TestFishSP3";
			springFish[3] = "TestFishSP4";
			springFish[4] = "TestFishSP5";
			
			summerFish[0] = "TestFishSM1";
			summerFish[1] = "TestFishSM2";
			summerFish[2] = "TestFishSM3";
			summerFish[3] = "TestFishSM4";
			summerFish[4] = "TestFishSM5";
			
			fallFish[0] = "TestFishFL1";
			fallFish[1] = "TestFishFL2";
			fallFish[2] = "TestFishFL3";
			fallFish[3] = "TestFishFL4";
			fallFish[4] = "TestFishFL5";
			
			winterFish[0] = "TestFishWI1";
			winterFish[1] = "TestFishWI2";
			winterFish[2] = "TestFishWI3";
			winterFish[3] = "TestFishWI4";
			winterFish[4] = "TestFishWI5";
		}
		
	public String currentFish()
	{
		//used to determine the caught fish by using the season id tag
		//and a random number for the Fish array index
		
		prepareFishList();
		
		Seasons quater = new Seasons();
		
		String fishy;
		int fishIndex;
		
		int tag = quater.getSeasonTag();
		
		Random fishFinder = new Random();
		fishIndex = fishFinder.nextInt(5);
		
		fishy = caughtFish(tag, fishIndex);
		
		return fishy;
	}
		public String caughtFish(int sTag, int fIndex)
		{
			String finalFish;
			
			if(sTag == 1)
				{
					finalFish = (springFish[fIndex]);
				}
			
			if(sTag == 2)
				{
					finalFish =	(summerFish[fIndex]);
				}
			
			if(sTag == 3)
				{
					finalFish = (fallFish[fIndex]);
				}
			
			if(sTag == 4)
				{
					finalFish = (winterFish[fIndex]);
				}
			
			else
				{
					finalFish = "issue with season tag please contact devloper";
				}
			
			return finalFish;
		}
	
}
