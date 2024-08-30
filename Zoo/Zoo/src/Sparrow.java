public class Sparrow extends Bird implements Flyable{

    public Sparrow(String name, int age, String sexo, int pound, String color) {
        super(name, age, sexo, pound, color);
        
    }
    public void fly(){
        System.out.println("El gorrion puede volar");

    }

}
