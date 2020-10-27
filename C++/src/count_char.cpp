#include <iostream>
#include <cmath>
#include <map>

void countChar(const std::string &tmpString);

int main() {
    std::string inputString = "12345678900000000000-Hello-World";
    countChar(inputString);
    return EXIT_SUCCESS;
}

void countChar(const std::string &tmpString) {
    std::map<char, int> counts;

    for (char letter : tmpString) {
        auto search = counts.find(letter);
        if (search != counts.end()) {
            counts.at(letter) = counts.find(letter)->second + 1;
        } else {
            counts.emplace(letter, 1);
        }
    }

    for (auto const &letter : counts) {
        float percent = static_cast<float>(letter.second) / tmpString.length();
        float nearestPercent = roundf(percent * 100) / 100;
        std::cout << '\'' << letter.first << '\''
                  << ' ' << letter.second
                  << ' ' << nearestPercent
                  << std::endl;
    }
}
