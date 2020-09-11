using System;
using System.Collections.Generic;

namespace cs
{
    internal static class Program
    {
        private static void Main()
        {
            const string inputString = "12345678900000000000-Hello-World";
            CountChar(inputString);
        }

        private static void CountChar(string tmpString)
        {
            var counts = new SortedDictionary<char, int>();
            foreach (var letter in tmpString)
            {
                if (!counts.ContainsKey(letter))
                {
                    counts.Add(letter, counts.GetValueOrDefault(letter, 0) + 1);
                }
                else
                {
                    counts[letter] = counts[letter] + 1;
                }
            }

            foreach (var (key, count) in counts)
            {
                var percent = (double) count / tmpString.Length;
                Console.WriteLine($"'{key}' {count} {percent:F2}");
            }
        }
    }
}
