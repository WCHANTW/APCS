public class HelloWorld {
    
    
public static void main(String args[]) {

    Notekeeper n = new Notekeeper();

    Note n1 = new Note("pick up drycleaning");
    Note n2 = new Note("special dog chow");
    Note n3 = new Note("car registration");
    Note n4 = new Note("dentist Monday");
    Note n5 = new Note("dog license");
   
   n.add(n1);
   n.add(n2);
   n.add(n3);
   n.add(n4);
   n.add(n5);

    n.printNotes();
    n.removeNotes("car");
    n.printNotes();   
}
}
