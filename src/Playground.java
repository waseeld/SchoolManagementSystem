 //fahad abdullah aljabri-451008323 
public class Playground {

    private String area;
    private int classId;

    public Playground(String area, int classId) {
        this.area = area;
        this.classId = classId;
    }

    public void isOccupied() {
        System.out.println("Playground occupied by Class ID: " + classId);
    }
}
