package Quiz_2;

public class Subklasse extends Superklasse {

    Subklasse() {
    	super(10);
    	//er word "10" voor de "p" geschreven, dus word "n10ps" uitgeprint.
        System.out.print("p");
    }
    public static void main(String[] args) {
        new Subklasse().printLetter('s');
    }
}