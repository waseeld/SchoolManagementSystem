// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter school name:");
        String schoolName = scanner.nextLine();

        System.out.println("Enter school address:");
        String address = scanner.nextLine();

        System.out.println("Enter contact number:");
        String contactNumber = scanner.nextLine();

        System.out.println("Enter medium of study:");
        String mediumOfStudy = scanner.nextLine();

        SchoolManagement school = new SchoolManagement(schoolName, address, contactNumber, mediumOfStudy);

        Teacher[] teachers = new Teacher[10];
        SupportStaff[] supportStaff = new SupportStaff[10];
        Student[] students = new Student[50];
        Classroom[] classrooms = new Classroom[10];
        Lab[] labs = new Lab[5];
        NoticeBoard noticeBoard = new NoticeBoard("Default Incharge");

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("===== School Management Menu =====");
            System.out.println("1. Show School Details");
            System.out.println("2. Add Teacher");
            System.out.println("3. Show Teacher Details");
            System.out.println("4. Add Student (Primary)");
            System.out.println("5. Add Student (Higher Secondary)");
            System.out.println("6. Show All Students");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    school.schoolDetails();
                    break;

                case 2:
                    System.out.println("Enter teacher id:");
                    int tId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter teacher name:");
                    String tName = scanner.nextLine();
                    System.out.println("Enter salary:");
                    double salary = scanner.nextDouble();
                    System.out.println("Enter department id:");
                    int depId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter subject:");
                    String subject = scanner.nextLine();

                    Teacher teacher = new Teacher(tId, tName, salary, depId, subject);
                    for (int i = 0; i < teachers.length; i++) {
                        if (teachers[i] == null) {
                            teachers[i] = teacher;
                            break;
                        }
                    }
                    System.out.println("Teacher added.");
                    break;

                case 3:
                    System.out.println("Teachers:");
                    for (Teacher t : teachers) {
                        if (t != null) {
                            t.employeeDetails();
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter student id:");
                    int psId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student name:");
                    String psName = scanner.nextLine();
                    System.out.println("Enter class id:");
                    int psClassId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter section:");
                    String psSection = scanner.nextLine();
                    System.out.println("Enter bus id:");
                    int psBusId = scanner.nextInt();
                    System.out.println("Enter standard (1-10):");
                    int standardP = scanner.nextInt();
                    scanner.nextLine();

                    PrimaryStudent pStudent = new PrimaryStudent(psId, psName, psClassId, psSection, psBusId, standardP);
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            students[i] = pStudent;
                            break;
                        }
                    }
                    System.out.println("Primary student added.");
                    break;

                case 5:
                    System.out.println("Enter student id:");
                    int hsId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student name:");
                    String hsName = scanner.nextLine();
                    System.out.println("Enter class id:");
                    int hsClassId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter section:");
                    String hsSection = scanner.nextLine();
                    System.out.println("Enter bus id:");
                    int hsBusId = scanner.nextInt();
                    System.out.println("Enter standard (11-12):");
                    int standardH = scanner.nextInt();
                    scanner.nextLine();

                    HigherSecondaryStudent hStudent = new HigherSecondaryStudent(hsId, hsName, hsClassId, hsSection, hsBusId, standardH);
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] == null) {
                            students[i] = hStudent;
                            break;
                        }
                    }
                    System.out.println("Higher secondary student added.");
                    break;

                case 6:
                    System.out.println("Students:");
                    for (Student s : students) {
                        if (s != null) {
                            s.studentDetails();
                            System.out.println();
                        }
                    }
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        scanner.close();
    }
}
