// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;
    protected int departmentId;

    public Employee(int employeeId, String employeeName, double salary, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public abstract void employeeDetails();

    public abstract void checkIn();

    public abstract void receiveSalary();

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }
}
