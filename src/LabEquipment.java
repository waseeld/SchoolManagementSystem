// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public class LabEquipment extends Equipment {
    private String equipmentName;
    private int equipmentCount;

    // Override
    public void equipmentDetails() {
        System.out.println("Displaying lab equipment details...");
    }

    // Override
    public void purchaseEquipment() {
        System.out.println("Purchasing new lab equipment...");
    }

    // Override
    public void repair() {
        System.out.println("Repairing lab equipment...");
    }
}
