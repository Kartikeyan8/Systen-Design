package Proxy;

public class ProxyImage implements Image {
    String filename;
    RealImage realimage;
    public ProxyImage(String filename)
    {
        this.filename= filename;
    }
    @Override
    public void display() {
        if(realimage == null)
        {
            realimage = new RealImage(filename);
        }
        else{
            realimage.display();
        }
    }
}
