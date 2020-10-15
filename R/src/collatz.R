collatzIteration <- function(number) {
  steps <- 0
  output <- ""
  while (number != 1) {
    output <- paste(output, number, sep = " ")
    if ((number %% 2) == 0) {
      number <- number / 2
    } else {
      number <- 3 * number + 1
    }
    steps <- steps + 1
  }
  output <- paste(output, number, sep = " ")
  print(output)
  return(steps)
}

collatzRecursive <- function(number) {
  cat(sprintf("%d ", number))
  if (number == 1) {
    return(0)
  }
  if (number %% 2 == 0) {
    collatzRecursive(number / 2)
  } else {
    collatzRecursive(3 * number + 1)
  }
}

inputNumber <- 27
print(collatzIteration(inputNumber))
collatzRecursive(inputNumber)
