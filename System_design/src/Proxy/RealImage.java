package Proxy;

public class RealImage implements Image{
    Image image;
    String filename;
    RealImage(String filename)
    {
        this.filename=filename;
        loadfromDisk();
    }
        public void loadfromDisk()
        {
            System.out.println("Loading from disk");
        }
    @Override
    public void display() {
        System.out.println("Displayed Cached Image of " + filename );
    }
}
