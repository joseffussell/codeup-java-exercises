public class Person {

    private String name;

    public Person() {

    }
    public Person(String name) {
        this.name = name;

    }

    public String getName(){
    //TODO: return the person's name
        return name;
    }

    public void setName(String name){
    //TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.println("Hello " + getName());
    }

    public static void main(String[] args) {
        Person character = new Person("John");
        character.setName("Pat");
        System.out.print(character.getName() + " ");
        character.sayHello();


        Person person = new Person("John");
        person.setName("John");
        System.out.println(person.getName());
        person.sayHello();
    }
}

