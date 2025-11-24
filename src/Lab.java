// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public class Lab {
    private int labId;
    private int inchargeId;
    private String labName;
    private int equipmentId;

    public Lab(int labId, int inchargeId, String labName, int equipmentId) {
        this.labId = labId;
        this.inchargeId = inchargeId;
        this.labName = labName;
        this.equipmentId = equipmentId;
    }

    public void labDetails() {
        System.out.println("Lab ID: " + labId);
        System.out.println("Incharge ID: " + inchargeId);
        System.out.println("Lab Name: " + labName);
        System.out.println("Equipment ID: " + equipmentId);
    }

    public void isOccupied() {
        System.out.println("Checking if the lab is occupied...");
    }

    public void payFine() {
        System.out.println("Processing fine for damaged lab equipment...");
    }

    public int getLabId() {
        return labId;
    }

    public int getInchargeId() {
        return inchargeId;
    }

    public String getLabName() {
        return labName;
    }

    public int getEquipmentId() {
        return equipmentId;
    }
}