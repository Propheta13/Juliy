public class Cars {
	public void start () {
		System.out.println("�������");
	}
    public void stop () {
    	System.out.println("���������������");
    }
    int speed = 60;
    int distance = 0;
    public int drive (int howlong) {
        distance = howlong * speed; 
        System.out.println("������ �������� " + distance + " �� �� " + howlong + " �����.");
        return distance;
    }
}
    