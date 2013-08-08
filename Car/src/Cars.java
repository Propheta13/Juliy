public class Cars {
	public void start () {
		System.out.println("Start car");
	}
    public void stop () {
    	System.out.println("Stop car");
    }
    int speed = 60;
    int distance = 0;
    public int drive (int howlong) {
        distance = howlong * speed; 
        System.out.println("The car drove  " + distance + " km for " + howlong + " minutes.");
        return distance;
    }
}
    