package collectables;

import java.util.Random;

import calendar.Seasons;

public class InsectList {

	//Note to self fill these arrays with more the five fish
	
	private String[] springInsect = new String[5];
	private String[] summerInsect = new String[5];
	private String[] fallInsect = new String[5];
	private String[] winterInsect = new String[5];
	
	private void prepareInsectList()
		{
			springInsect[0] = "TestFishSP1";
			springInsect[1] = "TestFishSP2";
			springInsect[2] = "TestFishSP3";
			springInsect[3] = "TestFishSP4";
			springInsect[4] = "TestFishSP5";
			
			summerInsect[0] = "TestFishSM1";
			summerInsect[1] = "TestFishSM2";
			summerInsect[2] = "TestFishSM3";
			summerInsect[3] = "TestFishSM4";
			summerInsect[4] = "TestFishSM5";
			
			fallInsect[0] = "TestFishFL1";
			fallInsect[1] = "TestFishFL2";
			fallInsect[2] = "TestFishFL3";
			fallInsect[3] = "TestFishFL4";
			fallInsect[4] = "TestFishFL5";
			
			winterInsect[0] = "TestFishWI1";
			winterInsect[1] = "TestFishWI2";
			winterInsect[2] = "TestFishWI3";
			winterInsect[3] = "TestFishWI4";
			winterInsect[4] = "TestFishWI5";
		}
		
	public String currentInsect()
	{
		//used to determine the caught insect by using the season id tag
		//and a random number for the insect array index
		
		prepareInsectList();
		
		Seasons quater = new Seasons();
		
		String bug;
		int insectIndex;
		
		int tag = quater.getSeasonTag();
		
		Random insectFinder = new Random();
		insectIndex = insectFinder.nextInt(5);
		
		bug = caughtInsect(tag, insectIndex);
		
		return bug;
	}
		public String caughtInsect(int sTag, int IIndex)
		{
			String finalInsect;
			
			if(sTag == 1)
				{
					finalInsect = (springInsect[IIndex]);
				}
			
			if(sTag == 2)
				{
					finalInsect =	(summerInsect[IIndex]);
				}
			
			if(sTag == 3)
				{
					finalInsect = (fallInsect[IIndex]);
				}
			
			if(sTag == 4)
				{
					finalInsect = (winterInsect[IIndex]);
				}
			
			else
				{
					finalInsect = "issue with season tag please contact devloper";
				}
			
			return finalInsect;
		}
}
