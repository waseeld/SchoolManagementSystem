// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public class HigherSecondaryStudent extends Student {
    private int standard;

    public HigherSecondaryStudent(int studentId, String studentName, int classId, String section, int busId, int standard) {
        super(studentId, studentName, classId, section, busId);
        this.standard = standard;
    }

    public void studentDetails() {
        System.out.println("Higher Secondary Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Class ID: " + classId);
        System.out.println("Section: " + section);
        System.out.println("Bus ID: " + busId);
        System.out.println("Standard: " + standard);
    }

    public void payFees() {
        System.out.println("Processing fee payment for higher secondary student: " + studentName);
    }

    public int getStandard() {
        return standard;
    }
}