public class Fish extends Animal{
    
    public Fish(String name, int age, String sexo, int pound, String color) {
        super(name, age, sexo, pound, color);    
    }

    public void swim(){          
        System.out.println("Nadando....");
    }

    //@Override
    /*void eat() {
       
        System.out.println("Soy un ejemplo de override");
    }*/


}
