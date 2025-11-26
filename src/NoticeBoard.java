 //fahad abdullah aljabri-451008323 
public class NoticeBoard {

    private String newsList = "";
    private String inchargeName;

    public NoticeBoard(String inchargeName) {
        this.inchargeName = inchargeName;
    }

    public void addContent(String content) {
        newsList += content + "\n";
    }

    public void display() {
        System.out.println("---- Notice Board ----");
        System.out.println(newsList);
    }
}
