package collectables;

public class Fish {
	String species;
	int weight;
	
	FishList fL = new FishList();


	public String nameCaughtFish()
	// determines the fish caught by the player
	{
		String name;
		name = fL.currentFish();
		return name;
	}
}
//Fish list