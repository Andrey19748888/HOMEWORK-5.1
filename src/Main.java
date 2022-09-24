public class Main {
    public static void main(String[] args) {
        task1();
        task3();


    }

    private static void task3() {

        // task 1
        int[] list2;
        list2 = new int[3];
        list2[0] = 1;
        list2[1] = 2;
        list2[2] = 3;
        for (int i = 2; i >= 0; i --) {
            System.out.print(list2 [i] + ", ");
        }
        System.out.println();

        // task2

        double[] numbers1 = new double[3];
        numbers1[0] = 1.57;
        numbers1[1] = 7.654;
        numbers1[2] = 9.986;
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers1[i] + ", ");}
        System.out.println();

        // task 3

        int[] speed = new int[5];
        speed [0] = 2;
        speed [1] = 4;
        speed [2] = 6;
        speed [3] = 8;
        speed [4] = 10;
        for (int i = 4; i >= 0; i--) {
            System.out.print(speed[i] + ", ");}
        System.out.println();

    }







    private static void task1() {
        // task 1-2
        int[] list;
        list = new int[3];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        for (int i = 0; i < 3; i ++) {
            System.out.print(list [i] + ", ");
            }
        System.out.println();

        //task1-2

        double[] numbers = new double[3];
        numbers[0] = 1.57;
        numbers[1] = 7.654;
        numbers[2] = 9.986;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");}
        System.out.println();

        // task1-2

        int[] speed = new int[5];
        speed [0] = 2;
        speed [1] = 4;
        speed [2] = 6;
        speed [3] = 8;
        speed [4] = 10;
        for (int i = 0; i < speed.length; i++) {
            System.out.print(speed[i] + ", ");
        }
        System.out.println();



    }

}


