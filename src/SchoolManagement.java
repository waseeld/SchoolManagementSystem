 // Programmed by: Wasel Mohammed Almahri (ID: 451014913)
import java.util.ArrayList;
import java.util.List;
public class SchoolManagement {
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;

    private List<Teacher> teachers;
    private List<Student> students;
    private List<Bus> buses;
    private List<Classroom> classrooms;
    private List<Lab> labs;

    public Auditorium auditorium;
    public Playground playground;
    public NoticeBoard noticeBoard;

    public SchoolManagement(String schoolName, String address, String contactNumber, String mediumOfStudy) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.mediumOfStudy = mediumOfStudy;

        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.buses = new ArrayList<>();
        this.classrooms = new ArrayList<>();
        this.labs = new ArrayList<>();
    }


    public void createAuditorium(int totalSeats) {
        this.auditorium = new Auditorium(totalSeats);
    }
    
    public void createPlayground(double area) {
        this.playground = new Playground(area);
    }
    
    public void createNoticeBoard(String inchargeName) {
        this.noticeBoard = new NoticeBoard(inchargeName);
    }

     public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void addBus(Bus bus) {
        buses.add(bus);
    }
    
    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }
    
    public void addLab(Lab lab) {
        labs.add(lab);
    }

    public List<Teacher> getTeachers() { return teachers; }
    public List<Student> getStudents() { return students; }
    public List<Bus> getBuses() { return buses; }
    public List<Classroom> getClassrooms() { return classrooms; }
    public List<Lab> getLab() { return labs; }
    public Auditorium getAuditorium() { return auditorium; }
    public Playground getPlayground() { return playground; }
    public NoticeBoard getNoticeBoard() { return noticeBoard; }

    public void isOpen() {
        System.out.println("Checking if the school is open...");
        System.out.println("Yes...\n");

    }

    public void schoolDetails() {
        System.out.println("Displaying school details...");
        System.out.println("schoolName : " + this.schoolName);
        System.out.println("address : " + this.address);
        System.out.println("contactNumber : " + this.contactNumber);
        System.out.println("mediumOfStudy : " + this.mediumOfStudy);
        System.out.println("Teachers: " + teachers.size());
        System.out.println("Students: " + students.size());
        System.out.println("Buses: " + buses.size());
        System.out.println("Classrooms: " + classrooms.size() + "\n");
    }
}