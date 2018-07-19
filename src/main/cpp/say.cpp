#include "say.hpp"
#include <iostream>

void say(const int len, const char* str) {
	  std::cout << std::string(str, len) << std::endl;
}
