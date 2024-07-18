public class Human {

    String name;
    int age;
    int heightInches;
    String eyeColor;


    public Human(){

    }

    public void speak(){
        System.out.println("Hola me llamo " + name);
        System.out.println("Mido " + heightInches + " cm  de altura");
        System.out.println("Tengo " + age +" años de edad");
        System.out.println("Mis ojos son de color " + eyeColor);        
    }

    public void eat(){
        System.out.println("commiendo...");
    }

    public void walk(){
        System.out.println("caminando...");
    }

    public void work(){
        System.out.println("trabajando...");
    }

}
