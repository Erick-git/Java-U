public class Earth {

    public static void main(String[] args) {
        
        Human tom;
        tom=new Human();
        
        Human joe;
        joe=new Human();

        
        tom.age =5;
        tom.eyeColor="Cafe";
        tom.heightInches=60;
        tom.name="Tom";

        joe.age =10;
        joe.eyeColor="Azul";
        joe.heightInches=70;
        joe.name="Joe";

        tom.speak();
        joe.speak();
    }
}
