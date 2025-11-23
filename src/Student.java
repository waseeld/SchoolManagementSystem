// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public abstract class Student {
    protected int studentId;
    protected String studentName;
    protected int classId;
    protected String section;
    protected int busId;

    public Student(int studentId, String studentName, int classId, String section, int busId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
        this.section = section;
        this.busId = busId;
    }

    public abstract void studentDetails();

    public abstract void payFees();

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getClassId() {
        return classId;
    }

    public String getSection() {
        return section;
    }

    public int getBusId() {
        return busId;
    }
}
