#include <iostream>

class Y{
    public:
    void y(int x, int y){
        x = 2;
        y = 3;
    }
    private:
    int x;
    int y;
    public:
    int z;
    int w;
};

class X: protected Y{
    X(int y){
        y = 2;
    }
public:
    int x;
private:
    void func(){
        x++;
    }
};

enum Color{
    YELLOW = 1,
    BLUE,
    RED = 2
};

enum Colo{
    BLACK
};

int main(int var = 2, char a = 'x', bool b = false, float f = 0.2f, double d){
    int d;
    int x = 2;
    x = 2;

    while(x > 0 && x < 10){
        x--;
    }

    for(int i=0; i<5; i++){
        x++;
        if(x<2){
            continue;
        }
    }

    if(!(2>3)){
        x = 1;
        x = 2;
        x = 3;
        int a = 5;
        int int_;
        if(x > 3 && x < 5 || x == 3){
            float a = 0.2f;
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

