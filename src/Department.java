 //fahad abdullah aljabri-451008323 
public class Department {

    private int departmentId;
    private String departmentName;
    private String inchargeName;
    private String members = ""; 

    public Department(int departmentId, String departmentName, String inchargeName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.inchargeName = inchargeName;
    }

    public void addMember(String member) {
        members += member + " ";
    }

    public void departmentDetails() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Name: " + departmentName);
        System.out.println("Incharge: " + inchargeName);
        System.out.println("Members: " + members);
    }
}
