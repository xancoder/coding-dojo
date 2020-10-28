using System;

namespace Collatz
{
    internal static class Program
    {
        private static void Main()
        {
            const int inputNumber = 27;
            Console.Out.WriteLine(collatz_iteration(inputNumber));
            collatz_recursive(inputNumber);
        }

        private static int collatz_iteration(int number)
        {
            var steps = 0;
            while (number != 1)
            {
                Console.Out.Write(number + " ");
                if (number % 2 == 0)
                {
                    number /= 2;
                }
                else
                {
                    number = 3 * number + 1;
                }

                steps++;
            }

            Console.Out.WriteLine(number);
            return steps;
        }

        private static void collatz_recursive(int number)
        {
            Console.Out.Write(number + " ");
            if (number == 1)
            {
                return;
            }

            if (number % 2 == 0)
            {
                collatz_recursive(number / 2);
            }
            else
            {
                collatz_recursive(3 * number + 1);
            }
        }
    }
}
