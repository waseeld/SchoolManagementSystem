// Programmed by: Fahad Abdullah Aljabri (ID: 451008323)
public class Playground {

    private double area;
    private int classId;

    public Playground(double area) {
        this.area = area;
        this.classId = 0;
    }

    public void isOccupied() {
        if (classId == 0) {
            System.out.println("Playground is not occupied.");
        } else {
            System.out.println("Playground is occupied by class id: " + classId);
        }
    }

    public double getArea() {
        return area;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}