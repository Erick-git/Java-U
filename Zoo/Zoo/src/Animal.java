public abstract class Animal 

    
 {
    String name;
    int age;
    String gender;
    int pound;
    String color;
 
    public Animal(String name, int age, String sexo, int pound, String color) {
        
        this.name = name;
        this.age = age;
        this.gender = sexo;
        this.pound = pound;
        this.color = color;
    }

    public void speak() {
      
        System.out.println("Mi nombre es " + name);
        System.out.println("Tengo " + age + " años de edad");
        System.out.println("Soy " + gender);
        System.out.println("Peso aprox " + pound + " libras");
        System.out.println("Soy de color " + color);
    }

    public void walk(){
        System.out.println("Corro en la selva");
    }

     abstract void eat(); 
       
    


    public void sleep(){
        System.out.println("Duermo en el día");
    }
    
   

}

