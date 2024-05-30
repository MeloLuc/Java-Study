package listEmployee.entities;

public class Employee {
    
    private String id;
    private float salary;
    private String name;

    public Employee(String id, float salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    //                                   100% = 100.0
    public void increasePercentSalary(float percent){
        this.salary +=  salary*percent/100.0;
    }

    public String getId() {
        return id;
    }
    public float getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "[id=" + id + ", salary=" + salary + ", name=" + name + "]";
    }
    
    
}
