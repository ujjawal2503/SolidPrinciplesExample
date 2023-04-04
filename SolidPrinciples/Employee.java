package SolidPrinciples;

public class Employee {
    private int id;
    private String name;

    Address address;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printMe(){
        System.out.println("Id: " + this.id + " Name: " + this.name);
    }

//    private String address;
//    private String state;
//    private String city;
}
