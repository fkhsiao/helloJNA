#include "hello-world.hpp"
#include <iostream>

void helloWorld(const int len, const char* str) {
	  std::cout << std::string(str, len) << std::endl;
}
