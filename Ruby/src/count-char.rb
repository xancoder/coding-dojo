def count_char(tmp_string)
  counts = {}

  chars = tmp_string.split('')
  chars.each do |letter|
    if counts.key?(letter)
      counts[letter] += 1
    else
      counts[letter] = 1
    end
  end

  counts.each do |k, v|
    percent = v.to_f / tmp_string.length
    puts "'%s' %d %.2f" % [k, v, percent]
  end
end

input_string = "12345678900000000000-Hello-World"
count_char(input_string)
