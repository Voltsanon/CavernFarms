package collectables;

public class Insects {
	String species;
	int size;
	
	InsectList iL = new InsectList();


	public String nameCaughtInsect()
	// determines the fish caught by the player
	{
		String name;
		name = iL.currentInsect();
		return name;
	}
}
