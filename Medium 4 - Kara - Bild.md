```Java
//Programmieren Sie Kara so, dass er ein "Negativbild" von dem Kleeblattbild innerhalb des Baumrechtecks erstellt.
//Wo ein Kleeblatt liegt, soll er es aufnehmen, und wo keines liegt, soll er eines hinlegen.
//Kara startet immer oben links in der Ecke mit Blick nach rechts.

// Program Kara to create a "negative image" of the clover pattern within the rectangle of trees.
// Where there is a clover, he should pick it up, and where there is none, he should place one.
// Kara always starts in the top left corner facing right.

import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {

void turnRight(){ // function to turn right
    if(kara.treeFront()){
        kara.turnRight();
        putRemoveLeaf();
        kara.move();
        kara.turnRight();
    }   
}

void turnLeft(){ // function to turn left
    if(kara.treeFront()){
        kara.turnLeft();
        putRemoveLeaf();
        kara.move();
        kara.turnLeft();
    }
}

void putRemoveLeaf(){ // function to add / remove leaf
    if(kara.onLeaf()){
        kara.removeLeaf();    
    }else{
        kara.putLeaf();    
    }
}

void turnSwitch(boolean x){ // function to swith previus direction
        if(x){
           turnLeft();
        }else{
           turnRight();
        }
}
boolean previous = false; // switch

public void myProgram() { // main program
                while(true){ // never ending loop
                
                if(kara.treeFront() && kara.treeRight()){ // is tree in front AND is tree on the right?
                    if(kara.treeFront() && kara.treeRight()){ // if tree front AND right == we reached the end, turn around
                        kara.turnLeft();
                        kara.turnLeft();
                        putRemoveLeaf();
                    }else{
                        previous = true;
                        turnSwitch(previous);
                    }
                    
                }else if(kara.treeFront() && kara.treeLeft()){ // is tree in front AND is tree on the left?
                    previous = false;
                    turnSwitch(previous);
                }else if(!kara.treeLeft() && !kara.treeRight() && kara.treeFront()){ // theres no tree on the left? AND there is no tree on the right? AND there is tree in the front?
                    previous = !previous;
                    turnSwitch(previous);
                }

                putRemoveLeaf();
                kara.move();
            }
                 
    }
  }
```

