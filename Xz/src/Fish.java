
public class Fish extends Pet {
	int currentDepth=0;
	
	public int dive (int howDeep) {
		currentDepth = currentDepth + howDeep;
		System.out.println("����� �� ������� " + howDeep + "�����");
		System.out.println("� �� �������" + currentDepth + "����� ���� ������ ����");
		return currentDepth;	
	   } 
	
//	@Override
	public String say(String aWord) {
        return "Griby ne razgovarivayut.";
    }

	
}