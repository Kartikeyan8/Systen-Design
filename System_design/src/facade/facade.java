package facade;

public class facade {
    public DVDPlayer dvdPlayer;
    public Projector projector;
    public SoundSystem soundSystem;
    public facade(DVDPlayer dvdPlayer,Projector projector,SoundSystem soundSystem)
    {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }
    public void watchMovie()
    {
        System.out.println("Setting up stuff");
        dvdPlayer.on();
        dvdPlayer.play("Pyaar ka Panchnama");
        soundSystem.on();
        soundSystem.setVolume(20);
        projector.on();
        projector.setInput("DVD");
    }
    public void endMovie() {
        System.out.println("Shutting down theater...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}
