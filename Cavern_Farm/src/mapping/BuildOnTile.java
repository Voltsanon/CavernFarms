package mapping;

public class BuildOnTile {
	
	//Player Id = 99
	
	//empty space Id = 0
	
	//tilled land Id = 10
	
	static int totalNumberOfFurnaces = 0;
	//FurnaceId = 1
	
	int totalNumberOfPresses = 0;
	//PressId = 2;
	
	public void buildFurnace(int xCord, int yCord) 
		{
			if((xCord != 81) && (xCord != -81))
				if((yCord != 81) && (yCord != -81))
					{
						Tile.updateTile( xCord, yCord, 1);
						totalNumberOfFurnaces++;
					}
		}

	public static void removeFurnace(int xCord, int yCord) 
		{
			if((xCord != 81) && (xCord != -81))
				if((yCord != 81) && (yCord != -81))
				{
					TileManagement.updateTile( xCord, yCord, 0);
					totalNumberOfFurnaces--;
				}
		}
	
	public static void tileLand(int xCord, int yCord) 
	{
		if((xCord != 81) && (xCord != -81))
			if((yCord != 81) && (yCord != -81))
			{
				TileManagement.updateTile( xCord, yCord, 10);
			}
	}
}
