package Logging;

public class Level2SupportHandler implements SupportHandler{
    SupportHandler nextob;
    @Override
    public void setNext(SupportHandler supportHandler) {
        this.nextob = supportHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.INTERMEDIATE)
        {
            System.out.println("level 2 handled");
        }
        else{
            nextob.handleRequest(request);
        }
    }
}
