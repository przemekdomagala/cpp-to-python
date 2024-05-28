#include <iostream>

enum Color{
    YELLOW = 1,
    BLUE,
    RED = 2
};

enum Colo{
    BLACK
};

int main(int var = 2, char a = 'x', bool b = false, float f = 0.2f){
    int x;
    x = 2;
    if(!(2>3)){
        x = 1;
        x = 2;
        x = 3;
        if(x > 3){
            float a = 0.2;
        }
    }
    else if(x<1){
        x--;
        x+=2;
        x/=25;
        int a = 7;
        if(x){
            x *= 1234234;
        }
    }
    else{
        x = 123;
    }
    int y = Color::YELLOW;
    return 0;
}

