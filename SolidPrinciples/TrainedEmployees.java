package SolidPrinciples;

public class TrainedEmployees extends Employee{

    private String trainingArea;

    TrainedEmployees(int id, String name, String trainingArea) {
        super(id, name);
        this.trainingArea = trainingArea;
    }
}
