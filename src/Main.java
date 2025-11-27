// Programmed by: Wasel Mohammed Almahri (ID: 451014913)

import java.util.Scanner;

public class Main {

    public static void MenuMsg() {
        System.out.println();
        System.out.println("===== School Management Menu =====");
        System.out.println("A- Bus");
        System.out.println("B- Student");
        System.out.println("C- Employee");
        System.out.println("D- Class");
        System.out.println("E- NoticeBoard");
        System.out.println("F- Auditorium");
        System.out.println("G- ShowSchoolDetails");
        System.out.println("H- Exit");
        System.out.print("Choose option: ");
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter school name:");
        String schoolName = scanner.nextLine();

        System.out.print("Enter school address:");
        String address = scanner.nextLine();

        System.out.print("Enter contact number:");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter medium of study:");
        String mediumOfStudy = scanner.nextLine();

        SchoolManagement school = new SchoolManagement(schoolName, address, contactNumber, mediumOfStudy);

        System.out.print("Enter number of seats in auditorium:");
        int totalSeats = scanner.nextInt();
        scanner.nextLine();
        Auditorium auditorium = new Auditorium(totalSeats);

        System.out.print("Enter playground area:");
        double playgroundArea = scanner.nextDouble();
        scanner.nextLine();
        Playground playground = new Playground(playgroundArea);

        System.out.print("dfsfHow many classrooms?");
        int classCount = scanner.nextInt();
        scanner.nextLine();
        Classroom[] classrooms = new Classroom[classCount];

        for (int i = 0; i < classCount; i++) {
            System.out.println("Classroom " + (i + 1) + " details:");
            System.out.print("Enter class id:");
            int classId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter class name:");
            String className = scanner.nextLine();
            System.out.print("Enter teacher id:");
            int teacherId = scanner.nextInt();
            System.out.print("Enter student count:");
            int studentCount = scanner.nextInt();
            System.out.print("Enter equipment id:");
            int equipmentId = scanner.nextInt();
            scanner.nextLine();

            classrooms[i] = new Classroom(classId, className, teacherId, studentCount, equipmentId);
        }

        System.out.println("How many labs?");
        int labCount = scanner.nextInt();
        scanner.nextLine();
        Lab[] labs = new Lab[labCount];

        for (int i = 0; i < labCount; i++) {
            System.out.println("Lab " + (i + 1) + " details:");
            System.out.print("Enter lab id:");
            int labId = scanner.nextInt();
            System.out.print("Enter incharge id:");
            int inchargeId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter lab name:");
            String labName = scanner.nextLine();
            System.out.print("Enter equipment id:");
            int eqId = scanner.nextInt();
            scanner.nextLine();

            labs[i] = new Lab(labId, inchargeId, labName, eqId);
        }

        System.out.println("How many teachers?");
        int teacherCount = scanner.nextInt();
        scanner.nextLine();
        Teacher[] teachers = new Teacher[teacherCount];

        for (int i = 0; i < teacherCount; i++) {
            System.out.println("Teacher " + (i + 1) + " details:");
            System.out.print("Enter id:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name:");
            String name = scanner.nextLine();
            System.out.print("Enter salary:");
            double salary = scanner.nextDouble();
            System.out.print("Enter department id:");
            int depId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter subject:");
            String subject = scanner.nextLine();

            teachers[i] = new Teacher(id, name, salary, depId, subject);
        }

        System.out.println("How many support staff?");
        int staffCount = scanner.nextInt();
        scanner.nextLine();
        SupportStaff[] supportStaff = new SupportStaff[staffCount];

        for (int i = 0; i < staffCount; i++) {
            System.out.println("Support staff " + (i + 1) + " details:");
            System.out.print("Enter id:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name:");
            String name = scanner.nextLine();
            System.out.print("Enter salary:");
            double salary = scanner.nextDouble();
            System.out.print("Enter department id:");
            int depId = scanner.nextInt();
            scanner.nextLine();

            supportStaff[i] = new SupportStaff(id, name, salary, depId);
        }

        System.out.println("Enter notice board incharge name:");
        String inchargeName = scanner.nextLine();
        NoticeBoard noticeBoard = new NoticeBoard(inchargeName);

        Student[] students = new Student[100];
        Bus[] buses = new Bus[20];

        boolean running = true;

        while (running) {
            MenuMsg();
            String option = scanner.nextLine().toUpperCase();

            switch (option) {
                case "A":
                    System.out.println("1- Add Bus");
                    System.out.println("2- Show Bus Details");
                    System.out.println("3- Show Seats");
                    System.out.println("4- Go back");
                    System.out.print("Choose: ");
                    int busChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (busChoice == 1) {
                        System.out.print("Enter bus id:");
                        int busId = scanner.nextInt();
                        System.out.print("Enter driver id:");
                        int driverId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter bus number:");
                        String busNumber = scanner.nextLine();
                        System.out.print("Enter capacity:");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter area list:");
                        String areaList = scanner.nextLine();

                        Bus bus = new Bus(busId, driverId, areaList, busNumber, capacity);
                        for (int i = 0; i < buses.length; i++) {
                            if (buses[i] == null) {
                                buses[i] = bus;
                                break;
                            }
                        }
                        System.out.println("Bus added.");
                    } else if (busChoice == 2) {
                        for (Bus b : buses) {
                            if (b != null) {
                                b.busDetails();
                                System.out.println();
                            }
                        }
                    } else if (busChoice == 3) {
                        for (Bus b : buses) {
                            if (b != null) {
                                b.showSeats();
                                System.out.println();
                            }
                        }
                    }
                    break;

                case "B":
                    System.out.println("1- Add Student");
                    System.out.println("2- Show Student Details");
                    System.out.println("3- Pay Fee");
                    System.out.println("4- Go back");
                    System.out.print("Choose: ");
                    int studChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (studChoice == 1) {
                        System.out.println("1- Primary student");
                        System.out.println("2- Higher secondary student");
                        int type = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter student id:");
                        int sid = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter student name:");
                        String sname = scanner.nextLine();
                        System.out.print("Enter class id:");
                        int sClassId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter section:");
                        String section = scanner.nextLine();
                        System.out.print("Enter bus id:");
                        int sBusId = scanner.nextInt();
                        System.out.print("Enter standard:");
                        int standard = scanner.nextInt();
                        scanner.nextLine();

                        Student s;
                        if (type == 1) {
                            s = new PrimaryStudent(sid, sname, sClassId, section, sBusId, standard);
                        } else {
                            s = new HigherSecondaryStudent(sid, sname, sClassId, section, sBusId, standard);
                        }

                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null) {
                                students[i] = s;
                                break;
                            }
                        }
                        System.out.println("Student added.");
                    } else if (studChoice == 2) {
                        for (Student s : students) {
                            if (s != null) {
                                s.studentDetails();
                                System.out.println();
                            }
                        }
                    } else if (studChoice == 3) {
                        System.out.println("Enter student id to pay fee:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        for (Student s : students) {
                            if (s != null && s.getStudentId() == id) {
                                s.payFees();
                                break;
                            }
                        }
                    }
                    break;

                case "C":
                    System.out.println("1- Teacher");
                    System.out.println("2- Support Staff");
                    System.out.println("4- Go back");
                    System.out.print("Choose: ");
                    int empChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (empChoice == 1) {
                        System.out.println("1- Show Teacher Details");
                        System.out.println("2- Receive Salary");
                        System.out.println("3- Go back");
                        int tChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (tChoice == 1) {
                            for (Teacher t : teachers) {
                                if (t != null) {
                                    t.employeeDetails();
                                    System.out.println();
                                }
                            }
                        } else if (tChoice == 2) {
                            System.out.print("Enter teacher id:");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            for (Teacher t : teachers) {
                                if (t != null && t.getEmployeeId() == id) {
                                    t.receiveSalary();
                                    break;
                                }
                            }
                        }
                    } else if (empChoice == 2) {
                        System.out.println("1- Show Support Staff Details");
                        System.out.println("2- Receive Salary");
                        System.out.println("3- Go back");
                        int sChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (sChoice == 1) {
                            for (SupportStaff st : supportStaff) {
                                if (st != null) {
                                    st.employeeDetails();
                                    System.out.println();
                                }
                            }
                        } else if (sChoice == 2) {
                            System.out.print("Enter staff id:");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            for (SupportStaff st : supportStaff) {
                                if (st != null && st.getEmployeeId() == id) {
                                    st.receiveSalary();
                                    break;
                                }
                            }
                        }
                    }
                    break;

                case "D":
                    System.out.println("1- Show Class Details");
                    System.out.println("2- Go back");
                    System.out.print("Choose: ");
                    int classChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (classChoice == 1) {
                        for (Classroom c : classrooms) {
                            if (c != null) {
                                c.classDetails();
                                System.out.println();
                            }
                        }
                    }
                    break;

                case "E":
                    System.out.println("1- Display");
                    System.out.println("2- AddContent");
                    System.out.println("3- Go back");
                    System.out.print("Choose: ");
                    int nbChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (nbChoice == 1) {
                        noticeBoard.display();
                    } else if (nbChoice == 2) {
                        System.out.print("Enter content:");
                        String content = scanner.nextLine();
                        noticeBoard.addContent(content);
                        System.out.print("Content added.");
                    }
                    break;

                case "F":
                    System.out.println("1- BookAuditorium");
                    System.out.println("2- Show Event Details");
                    System.out.println("3- Show Seats");
                    System.out.println("4- Go back");
                    System.out.print("Choose: ");
                    int audChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (audChoice == 1) {
                        System.out.print("Enter event name:");
                        String eventName = scanner.nextLine();
                        System.out.print("Enter event date:");
                        String eventDate = scanner.nextLine();
                        System.out.print("Enter event time:");
                        String eventTime = scanner.nextLine();
                        System.out.print("Enter number of participants:");
                        int participants = scanner.nextInt();
                        scanner.nextLine();

                        auditorium.bookAuditorium(eventName, eventDate, eventTime, participants);
                    } else if (audChoice == 2) {
                        auditorium.eventDetails();
                    } else if (audChoice == 3) {
                        auditorium.displaySeats();
                    }
                    break;

                case "G":
                    school.schoolDetails();
                    break;

                case "H":
                    running = false;
                    System.out.println("Stopping program...");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        scanner.close();
    }
}