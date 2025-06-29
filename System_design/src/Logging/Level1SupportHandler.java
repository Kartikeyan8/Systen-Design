package Logging;

public class Level1SupportHandler implements SupportHandler{
    SupportHandler nextob;
    @Override
    public void setNext(SupportHandler supportHandler) {
        this.nextob = supportHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.BASIC)
        {
            System.out.println("Level 1 Handled");
        }
        else{
            nextob.handleRequest(request);
        }

    }
}
