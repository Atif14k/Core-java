package Java_core;

public class Constructor {
    String name;
    int age;

    //Assigned the value in the default constructor
    public Constructor() {
        name = "Atif";
        age = 23;
    }

    //This is the parameterised constructor
    public Constructor(String name , int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        //object of the default constructor
        Constructor constructor = new Constructor();

        //Object of the parameterised constructor
        Constructor constructor2 = new Constructor("Khan", 20);

        
        System.out.println(constructor.name +" : "+ constructor.age );
        System.out.println(constructor2.name +" : "+ constructor2.age);
    }
}
