package SolidPrinciples;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Pradipto");

        TrainedEmployees emp = new TrainedEmployees(2,"Ujjawal", "G**nd");

        Client client = new Client();
        client.useMeToPrint(emp);
    }
    void useMeToPrint(Employee e){
        e.printMe();
    }
}
