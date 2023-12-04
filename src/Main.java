public class Main {
    public static void main(String[] args) {

        Exercise ex1 = new Exercise();
        ex1.loop();

        System.out.println("---------------------------------------");

        Exercise2 ex2 = new Exercise2();
        ex2.number =11;
        System.out.println(ex2.checkNumber());

        System.out.println("---------------------------------------");

        Exercise3 ex3 = new Exercise3();
        ex3.var1 = 5;
        ex3.var2 = 10;
        System.out.println(ex3.returnSum());
        System.out.println(ex3.returnProduct());

        System.out.println("---------------------------------------");


    }
}