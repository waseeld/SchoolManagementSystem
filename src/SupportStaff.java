 //fahad abdullah aljabri-451008323 
public class SupportStaff extends Employee {

    public SupportStaff(int employeeId, String employeeName, double salary, int departmentId) {
        super(employeeId, employeeName, salary, departmentId);
    }

    
    public void employeeDetails() {
        System.out.println("Support Staff ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department ID: " + getDepartmentId());
    }

    
    public void checkIn() {
        System.out.println(getEmployeeName() + " checked in.");
    }

    
    public void receiveSalary() {
        System.out.println(getEmployeeName() + " received the salary.");
    }
}
