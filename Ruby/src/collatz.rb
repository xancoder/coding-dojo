def collatz_iteration(number)
  steps = 0
  while number != 1 do
    print("#{number} ")
    if number % 2 == 0
      number = number / 2
    else
      number = 3 * number + 1
    end
    steps = steps + 1
  end
  puts(number)
  steps
end

def collatz_recursive(number)
  print("#{number} ")
  if number == 1
    return
  end
  if number % 2 == 0
    collatz_recursive(number / 2)
  else
    collatz_recursive(3 * number + 1)
  end
end

input_number = 27
puts(collatz_iteration(input_number))
collatz_recursive(input_number)
