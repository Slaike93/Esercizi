public class Main {
    public static void main(String[] args) {

        Exercise ex1 = new Exercise();
        ex1.loop();

        System.out.println("---------------------------------------");

        Exercise2 ex2 = new Exercise2();
        ex2.number =11;
        System.out.println(ex2.checkNumber());

        System.out.println("---------------------------------------");


    }
}