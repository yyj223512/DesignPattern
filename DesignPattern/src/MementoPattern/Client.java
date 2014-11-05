package MementoPattern;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        caretaker.setMemento(originator.setMemento());

        originator.getMemento();
    }
}
