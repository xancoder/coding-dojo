use std::collections::BTreeMap;

fn main() {
    let input_string: &str = "12345678900000000000-Hello-World";
    count_char(input_string);
}

fn count_char(tmp_string: &str) {
    let mut counts: BTreeMap<char, u32> = BTreeMap::new();

    for letter in tmp_string.chars() {
        let counter: &mut u32 = counts.entry(letter).or_insert(0);
        *counter += 1;
    }

    for (letter, value) in counts.iter() {
        let percent = *value as f32 / tmp_string.len() as f32 as f32;
        println!("'{}' {} {:.2}", letter, value, percent);
    }
}
