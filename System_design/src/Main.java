import Builder.Computer;
import Builder.Director;
import Builder.GamingComputer;
import Builder.NormalComputer;
import Logging.*;
import Observer.ObserverImpl;
import Observer.SubjectImpl;
import Proxy.Image;
import Proxy.ProxyImage;
import adaptor.BabyWeight;
import adaptor.WeightMachine;
import adaptor.adaptorinterface;
import adaptor.adaptorinterfaceimpl;
import decorator.Coffee;
import decorator.MilkCoffee;
import decorator.PlainCoffee;
import decorator.SugarCoffee;
import facade.facade;
import memento.Caretaker;
import memento.Memento;
import memento.Originator;
import stratergy.Context;
import stratergy.PaymentStratergy;
import stratergy.UPIPayment;
import facade.DVDPlayer;
import facade.Projector;
import facade.SoundSystem;

public class Main {
    public static void main(String[] args) {
//        facade
//        facade ob= new facade(new DVDPlayer(),new Projector(),new SoundSystem());
//        ob.watchMovie();
        // Adaptor
//        adaptorinterface ob = new adaptorinterfaceimpl(new BabyWeight());
//        System.out.println(ob.getWeightInKg());

        //memento
//        Caretaker ct = new Caretaker();
//        Originator og = new Originator(1,2);
//
//        Memento snap1 = og.createMemento();
//        ct.addMemento(snap1);
//        og.seth(3);
//        og.setw(4);
//
//        Memento snap2 = og.createMemento();
//        ct.addMemento(snap2);
//
//        og.restoreMemento(ct.undo());
//        System.out.println("Height " + og.h +" Width " +  og.w);
//        og.restoreMemento(ct.undo());
//        System.out.println("Height " + og.h +" Width " +  og.w);



//        Builder
//        Director d = new Director();
//        NormalComputer computer = new NormalComputer();
//
//        d.construct(computer);
//        Computer normalob = computer.getResult();
//        normalob.displayInfo();
        //          Proxy
//            Image image = new ProxyImage("kart.jpg");
//            image.display();
//            image.display();

//         Logging
//        SupportHandler level1 = new Level1SupportHandler();
//        SupportHandler level2 = new Level2SupportHandler();
//        level1.setNext(level2);
//        level1.handleRequest(new Request(Priority.INTERMEDIATE));
        //Decorator
//        Coffee sugar = new SugarCoffee(new MilkCoffee(new PlainCoffee()));
//        System.out.println(sugar.getDescription());
//        System.out.println(sugar.getCost());
//        Stratergy
//        Context context = new Context();
//        context.setContext(new UPIPayment());
//        context.payNow(100);


//        Observer
//        SubjectImpl ob = new SubjectImpl();
//        ob.addObserver(new ObserverImpl());
//        ob.setWeather("23");




    }
}