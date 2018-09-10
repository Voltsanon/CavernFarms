package player;
import mapping.Direction;

public class Player {

	//funds management
	public static double funds = 3500;
	
	//energy management
	public static int currentMaxEnergy = 250;
	public static int currentEnergy = 250;
	private static int peakEnergy = 2500;

	//inventory management
	public static int currentHeldItemId = 2018;
	public static int currentInventoryRowCount = 1;
	
	static int[] inventoryRowOne = new int[10];
	static 	int[] inventoryRowTwo = new int[10];
	static 	int[] inventoryRowThree = new int[10];
	static 	int[] inventoryRowFour = new int[10];
	
	//inventory item count management
	
	static 	int[] inventoryICRowOne = new int[10];
	static 	int[] inventoryICRowTwo = new int[10];
	static 	int[] inventoryICRowThree = new int[10];
	static 	int[] inventoryICRowFour = new int[10];
	
	//Positioning
	
	static int pXCord = 0;
	static int pYCord = 0;

	// 1 is up, 2 is right, 3 is down, 4 is left
	static Direction playerOrientation = Direction.Down;
	
	// getter methods 
	
	public static int getPlayerXCord()
		{
			return pXCord;
		}

	public static int getPlayerYCord()
		{
			return pYCord;
		}

	public static Direction getOrientation()
		{
			return playerOrientation;
		}

	//inventory methods
	
	public static int getHeldItemId()
		{
			return currentHeldItemId;
		}
	
	public static  int getNumOfInventoryRows()
		{
			return currentInventoryRowCount;
		}
	
	//when the player picks up a item, either from a machine or from gathering this will search
	// for the integer 2018(empty space) 
	public static void pickUpItem(int targetItemId)
		{
			int inventSlot = 1;
		
			if (currentHeldItemId == 2018)
				{
					currentHeldItemId = targetItemId;
				}
			
			else		
				{
					if(getNumOfInventoryRows() == 1)
						{
							while(inventSlot != 11)
								{
									if(inventoryRowOne[inventSlot] == 2018)
										{
											inventoryRowOne[inventSlot] = targetItemId;
											break;
										}
									if(inventoryRowOne[inventSlot] == targetItemId)
									{
										inventoryICRowOne[inventSlot]++;
										break;
									}
									else
										inventSlot++;
								}
						}
					
					
					if(getNumOfInventoryRows() == 2)
					{
						while(inventSlot != 11)
						{
							if(inventoryRowOne[inventSlot] == 2018)
								{
									inventoryRowOne[inventSlot] = targetItemId;
									break;
								}
							if(inventoryRowOne[inventSlot] == targetItemId)
							{
								inventoryICRowOne[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					inventSlot = 1;
						
					while(inventSlot != 11)
						{
							if(inventoryRowTwo[inventSlot] == 2018)
								{
									inventoryRowTwo[inventSlot] = targetItemId;
									break;
								}
							if(inventoryRowTwo[inventSlot] == targetItemId)
							{
								inventoryICRowTwo[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					}
					
					
					if(getNumOfInventoryRows() == 3)
					{
						while(inventSlot != 11)
						{
							if(inventoryRowOne[inventSlot] == 2018)
								{
									inventoryRowOne[inventSlot] = targetItemId;
									break;
								}
							if(inventoryRowOne[inventSlot] == targetItemId)
							{
								inventoryICRowOne[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					inventSlot = 1;
						
					while(inventSlot != 11)
						{
							if(inventoryRowTwo[inventSlot] == 2018)
								{
									inventoryRowTwo[inventSlot] = targetItemId;
									break;
								}
							if(inventoryRowTwo[inventSlot] == targetItemId)
							{
								inventoryICRowOne[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					inventSlot = 1;
					
					while(inventSlot != 11)
						{
							if(inventoryRowThree[inventSlot] == 2018)
								{
									inventoryRowThree[inventSlot] = 2018;
									break;
								}
							if(inventoryRowThree[inventSlot] == targetItemId)
							{
								inventoryICRowOne[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					}
					
					
					
					
					if(getNumOfInventoryRows() == 4)
					{
						while(inventSlot != 11)
						{
							if(inventoryRowOne[inventSlot] == 2018)
								{
									inventoryRowOne[inventSlot] = 2018;
									break;
								}
							if(inventoryRowOne[inventSlot] == targetItemId)
							{
								inventoryICRowOne[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					inventSlot = 1;
						
					while(inventSlot != 11)
						{
							if(inventoryRowTwo[inventSlot] == 2018)
								{
									inventoryRowTwo[inventSlot] = 2018;
									break;
								}
							if(inventoryRowTwo[inventSlot] == targetItemId)
							{
								inventoryICRowTwo[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					inventSlot = 1;
					
					while(inventSlot != 11)
						{
							if(inventoryRowThree[inventSlot] == 2018)
								{
									inventoryRowThree[inventSlot] = 2018;
									break;
								}
							if(inventoryRowThree[inventSlot] == targetItemId)
							{
								inventoryICRowThree[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					inventSlot = 1;
					
					while(inventSlot != 11)
						{
							if(inventoryRowFour[inventSlot] == 2018)
								{
									inventoryRowFour[inventSlot] = 2018;
									break;
								}
							if(inventoryRowFour[inventSlot] == targetItemId)
							{
								inventoryICRowFour[inventSlot]++;
								break;
							}
							else
								inventSlot++;
						}
					
					}
				}
		}
	
	//end of pickup item method
	
	//Player Interaction method used to determine what the player can and cant do with a tile
	
	public void playerInteract()
		{
		
		}
	
	public void playerPlaceMachine()
		{
		
		}
	
	// used when the player upgrades their character's storage (backpack)
	public void inventoryExpansion()
		{
			currentInventoryRowCount++;
		}
	
	// used when the player upgrades their energy
	public void energyPowerUp()
		{
			if(currentMaxEnergy != peakEnergy)
				{
					currentMaxEnergy = (currentMaxEnergy + 250);
				}
		}

}
