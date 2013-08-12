public class Pet {
    int  age ;
    float height ;
    float weight ;
    String color ;

    public void sleep() {
        System.out.println("I sleeping now");
    }

    public void eat() {
        System.out.println("I want eat");
    }

    public String say(String aWord) {
        String petResponse = " Ok " + aWord;
        return petResponse;
    }


}