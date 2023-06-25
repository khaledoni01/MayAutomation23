package dayNine;

public class Toyota implements Vehicle {

    public void doors() {
        System.out.println("4 doors");
    }

    public void wheels() {
        System.out.println("4 wheels");
    }

    public static void main(String[] args) {

        Toyota t = new Toyota();
    }

}
