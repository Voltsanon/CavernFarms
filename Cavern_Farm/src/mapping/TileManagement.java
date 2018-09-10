package mapping;

public class TileManagement {

	static int[][] farmGrid = new int[80][80];
	
	public static void updateTile(int xCord, int yCord, int machineID) 
		{
			farmGrid[xCord][yCord] = machineID;
		}

}
