// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public class Teacher extends Employee {
    private String subject;

    public Teacher(int employeeId, String employeeName, double salary, int departmentId, String subject) {
        super(employeeId, employeeName, salary, departmentId);
        this.subject = subject;
    }

    public void employeeDetails() {
        System.out.println("Teacher ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department ID: " + departmentId);
        System.out.println("Subject: " + subject);
    }

    public void checkIn() {
        System.out.println("Teacher " + employeeName + " checked in to school.");
    }

    public void receiveSalary() {
        System.out.println("Teacher " + employeeName + " received salary: " + salary);
    }

    public String getSubject() {
        return subject;
    }
}
