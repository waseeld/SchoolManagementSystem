// Programmed by: Wasel Mohammed Almahri (ID: 451014913)
public abstract class Equipment {
    protected int equipmentId;
    protected double cost;

    public Equipment(int equipmentId, double cost) {
        this.equipmentId = equipmentId;
        this.cost = cost;
    }

    public abstract void equipmentDetails();

    public abstract void purchaseEquipment();

    public abstract void repair();

    public int getEquipmentId() {
        return equipmentId;
    }

    public double getCost() {
        return cost;
    }
}
