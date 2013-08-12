
public class Fish extends Pet {
	int currentDepth=0;
	
	public int dive (int howDeep) {
		currentDepth = currentDepth + howDeep;
        if (currentDepth > 100){
            System.out.println("I am a little fish and can't dive more that 100 meters");
            currentDepth -= howDeep;
        }
        else {
            System.out.println("Pogryzhaiys na glybiny " + howDeep + "metrov");
            System.out.println("Ja na glybine" + currentDepth + "metrov");
        }
        return currentDepth;
    }

    //	@Override
    public String say(String aWord) {
        return "Riby ne razgovarivayut.";
    }
}



