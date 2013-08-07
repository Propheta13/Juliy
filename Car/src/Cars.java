public class Cars {
	public void start () {
		System.out.println("Поехали");
	}
    public void stop () {
    	System.out.println("Останавливаемся");
    }
    int speed = 60;
    int distance = 0;
    public int drive (int howlong) {
        distance = howlong * speed; 
        System.out.println("Машина проехала " + distance + " км за " + howlong + " минут.");
        return distance;
    }
}
    