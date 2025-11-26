 //fahad abdullah aljabri-451008323 
public class Classroom {

    private int classId;
    private String className;
    private int teacherId;
    private int studentCount;
    private int equipmentId;

    public Classroom(int classId, String className, int teacherId, int studentCount, int equipmentId) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
        this.studentCount = studentCount;
        this.equipmentId = equipmentId;
    }

    public void classDetails() {
        System.out.println("Class ID: " + classId);
        System.out.println("Class Name: " + className);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Students: " + studentCount);
        System.out.println("Equipment ID: " + equipmentId);
    }
}
