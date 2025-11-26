 // Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public class SchoolManagement {
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;

    public SchoolManagement(String schoolName, String address, String contactNumber, String mediumOfStudy) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.mediumOfStudy = mediumOfStudy;
    }

    public void isOpen() {
        System.out.println("Checking if the school is open...");
        System.out.println("Yes...\n");

    }

    public void schoolDetails() {
        System.out.println("Displaying school details...");
        System.out.println("schoolName : " + this.schoolName);
        System.out.println("address : " + this.address);
        System.out.println("contactNumber : " + this.contactNumber);
        System.out.println("mediumOfStudy : " + this.mediumOfStudy +"\n");
    }
}