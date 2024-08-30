public class Bird extends Animal{
    public Bird(String name, int age, String sexo, int pound, String color) {
        super(name, age, sexo, pound, color);
    }

    public void fly() {
        System.out.println("Volando....");

    }

    @Override
    void eat() {
       
        System.out.println("Desayuno semillitas de girazol");
    }
    

}
