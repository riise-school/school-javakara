``` Java
//Kara möchte einen Wald im Uhrzeigersinn patrouillieren. Programmieren Sie Kara so, dass er endlos im Uhrzeigersinn um diesen Wald läuft.

//Kara wants to patrol a forest in a clockwise direction. Program Kara so that he endlessly runs around this forest in a clockwise direction.

// is not done!
// is not done!
// is not done!

import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {

boolean startPosition = false; // true = left / false = right

void blindSpot(){ // turn around
    kara.turnLeft();
    kara.turnLeft();
}

void whileTreeLeft(){ // move on the left side
    if(!kara.treeFront() && !kara.treeRight() && kara.treeLeft()){ // if no tree in front
        kara.move();
    }else if(kara.treeFront() && kara.treeLeft() && kara.treeRight()){ // if surrounded with trees
        blindSpot();
    }else if(kara.treeFront() && kara.treeRight() && !kara.treeLeft()){ // if no tree on the left
        kara.turnLeft();
        kara.move();
    }
startPosition = true;
}

void whileTreeRight(){ // move on the right side
    if(!kara.treeFront() && !kara.treeLeft() && kara.treeRight()){
        kara.move();
    }else if(kara.treeFront() && kara.treeLeft() && kara.treeRight()){ // if surrounded with trees
        blindSpot();
    }else if(kara.treeFront() && !kara.treeRight() && kara.treeLeft()){
        kara.turnRight();
        kara.move();
    }
startPosition = false;
}

void findTree(){ // if kara in void
    if(!kara.treeLeft() && !kara.treeFront() && !kara.treeRight()){
        findPreviousDirection();
        kara.move();
    }
}
void findPreviousDirection(){ // finds direction that was used previous
        if(startPosition){
            kara.turnLeft();
        }else{
            kara.turnRight();
        }
}
public void myProgram() {
    while(true){
        findTree();
        if(kara.treeLeft() && kara.treeRight() && !kara.treeFront()){
            kara.move();
        }else if(kara.treeRight()){
            whileTreeLeft();
        }else if(kara.treeLeft()){
            whileTreeRight();
        }else if((kara.treeLeft() && !kara.treeRight())|| (kara.treeRight() && !kara.treeLeft())){
            kara.move();
        }
    }
}
}
```