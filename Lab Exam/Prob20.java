class videotape
{
    String title = "JAVA course";
    String length = "12 hours";
    String available = "yes";

    public void show()
    {
        System.out.println(title);
        System.out.println(length);
        System.out.println(available);
    }
}
class Movie extends videotape
{
    int directorrating = 9;
    public void show()
    {
        System.out.println(directorrating);
    }
}

class Musicvideo extends videotape
{
    String Artistcompany = "VIT";

    public void show()
    {
        System.out.println(Artistcompany);
    }
}
public class Prob20 {
    public static void main(String[] args) {
        Movie m = new Movie();
        videotape v = new videotape();
        Musicvideo mv = new Musicvideo();

        v.show();
        m.show();
        mv.show();
    }
}
