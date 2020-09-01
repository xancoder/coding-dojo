countChar <- function(tmpString) {
  counts <- list()

  chars <- strsplit(tmpString, "")[[1]]
  for (letter in chars) {
    if (is.null(counts[[letter]])) {
      counts[[letter]] <- 1
    }
    else {
      counts[[letter]] <- counts[[letter]] + 1
    }
  }

  for (letter in names(counts)) {
    tmp <- counts[[letter]] / nchar(tmpString) * 100
    print(sprintf("'%s' %d %.2f", letter, counts[[letter]], tmp))
  }
}

stringAsACharSequence <- "12345678900000000000-Hello-World"
countChar(stringAsACharSequence)
