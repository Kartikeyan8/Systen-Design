package memento;

import java.util.ArrayList;
import java.util.Stack;

public class Caretaker {
    Stack<Memento>list = new Stack<>();
    public void addMemento(Memento ob)
    {
        list.add(ob);
    }
    public Memento undo()
    {
        if(!list.isEmpty())
        {
            Memento latest= list.peek();
            list.pop();
            return latest;
        }
        return null;
    }
}
