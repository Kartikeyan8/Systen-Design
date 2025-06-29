package Logging;

public interface SupportHandler {
    void setNext(SupportHandler supportHandler);
    void handleRequest(Request request);
}
