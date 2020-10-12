class Collatz {

    public static void main(String[] args) {
        int inputNumber = 27;
        System.out.println(collatz_iteration(inputNumber));
        collatz_recursive(inputNumber);
    }

    public static int collatz_iteration(int number) {
        int steps = 0;
        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
            steps++;
        }
        System.out.println(number);
        return steps;
    }

    public static void collatz_recursive(int number) {
        System.out.print(number + " ");
        if (number == 1) {
            return;
        }
        if (number % 2 == 0) {
            collatz_recursive(number / 2);
        } else {
            collatz_recursive(3 * number + 1);
        }
    }
}
