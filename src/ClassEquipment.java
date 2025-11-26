 //fahad abdullah aljabri-451008323 
public class ClassEquipment extends Equipment {

    private int classId;
    private int benchCount;
    private int fanCount;
    private int lightCount;

    public ClassEquipment(int equipmentId, double cost, int classId, int benchCount, int fanCount, int lightCount) {
        super(equipmentId, cost);
        this.classId = classId;
        this.benchCount = benchCount;
        this.fanCount = fanCount;
        this.lightCount = lightCount;
    }

    public void equipmentDetails() {
        System.out.println("Class Equipment ID: " + getEquipmentId());
        System.out.println("Class ID: " + classId);
        System.out.println("Benches: " + benchCount);
        System.out.println("Fans: " + fanCount);
        System.out.println("Lights: " + lightCount);
        System.out.println("Cost: " + getCost());
    }

    public void purchaseEquipment() {
        System.out.println("Purchasing class equipment...");
    }

    public void repair() {
        System.out.println("Repairing class equipment...");
    }
}
