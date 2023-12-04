class Exercise4 {
    /*Here's the breakdown of the exercise:
    Create a new Java class called 'StaticExercise'.
    Inside 'StaticExercise', declare a static variable of type int named 'counter'. Initialize it to 0.
    Next, create a static method named 'incrementCounter'. This method should increase the value of 'counter' by 1 every time it's called.
    Create a static block that prints a message "Static block is executed" whenever the class is loaded.
    Finally, in the main method, create a loop that calls 'incrementCounter' five times. After each call, print the current value of 'counter'.*/

    static int counter = 0;

    public static void incrementCounter() {
        counter+=1;
    }

    public static void block(){
        System.out.println("Static block is executed");
    }

    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            incrementCounter();
            System.out.println(counter);
        }
    }
}
