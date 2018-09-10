package machines;
import java.lang.Thread;
import player.Player;
import mapping.Direction;
public class Furnace {
	
	private boolean inuse = false;
	public boolean playerInteraction = false;
	public int xCord = 0;
	public int yCord = 0;

	
	//broken due to switch to enums
	public void buildNewFurnace()
		{
			int xCord = Player.getPlayerXCord(); 
			int yCord = Player.getPlayerYCord();
			int compassDirection = Player.getOrientation();
			
				switch
			
			mapping.BuildOnTile.buildFurnace(xCord, yCord);
		}
	
	public void removeExistingFurnace()
	{
		int xCord = Player.getPlayerXCord(); 
		int yCord = Player.getPlayerYCord();
		int compassDirection = Player.getOrientation();
		
		if(compassDirection <= 2)
			{
				xCord++;
				yCord++;
			}
		else
			{
				xCord--;
				yCord--;
			}
		mapping.BuildOnTile.removeFurnace(xCord, yCord);
	}
	
	public void smeltStart() throws InterruptedException
		{
			if(!inuse)
				{
					inuse = true;
					
					int smeltable = Player.getHeldItemId();
					
					if((smeltable <= 1) && (smeltable >= 11))
						{
							if((smeltable > 0) && ( smeltable <= 3))
								{
									Thread.sleep(6000);
									smeltFinish(smeltable);
									
								}
							if((smeltable > 3) && ( smeltable <= 5))
								{
									Thread.sleep(12000);
									smeltFinish(smeltable);
									
								}
							if(smeltable == 6)
								{
									Thread.sleep(12500);
									smeltFinish(smeltable);
								}
						}
				}
		}
	
		private void smeltFinish(int smelted)
			{
				
				if((smelted <= 1) && (smelted >= 11))
					{
						if((smelted > 0) && ( smelted <= 3))
							{
							
								try {
									
									wait();
									
								} catch (InterruptedException playerCharacterInteraction) 
								
								{
									Player.pickUpItem(smelted * 2);
								}
							}
						if((smelted > 3) && ( smelted <= 5))
							{
								try 
									{
										wait();
									} 
								catch (InterruptedException playerCharacterInteraction) 
								
									{
										Player.pickUpItem(smelted * 2);
									}
							}	
						if(smelted == 6)
							{	
								try 
									{
										wait();
									} 
								catch (InterruptedException playerCharacterInteraction) 
						
									{
										Player.pickUpItem(smelted * 2);
									}
							}
					}
			}
}
