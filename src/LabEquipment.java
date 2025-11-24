// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public class LabEquipment extends Equipment {
    private String equipmentName;
    private int equipmentCount;

    public LabEquipment(int equipmentId, double cost, String equipmentName, int equipmentCount) {
        super(equipmentId, cost);
        this.equipmentName = equipmentName;
        this.equipmentCount = equipmentCount;
    }

    public void equipmentDetails() {
        System.out.println("Lab Equipment ID: " + equipmentId);
        System.out.println("Name: " + equipmentName);
        System.out.println("Count: " + equipmentCount);
        System.out.println("Cost: " + cost);
    }

    public void purchaseEquipment() {
        System.out.println("Purchasing new lab equipment: " + equipmentName);
    }

    public void repair() {
        System.out.println("Repairing lab equipment: " + equipmentName);
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public int getEquipmentCount() {
        return equipmentCount;
    }
}
