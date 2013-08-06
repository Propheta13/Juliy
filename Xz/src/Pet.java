public class Pet {
    int  age ;
    float height ;
    float weight ;
    String color ;

    public void sleep() {
        System.out.println("Спокойной ночи. До завтра");
    }

    public void eat() {
        System.out.println("Я очень голоден.");
    }

    public String say(String aWord) {
        String petResponse = " Ну ладно " + aWord;
        return petResponse;
    }


}