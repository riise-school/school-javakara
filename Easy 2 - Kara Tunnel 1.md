``` Java
//Kara sucht den Eingang eines geraden Tunnels (Feld 2a). Schreiben Sie ein Programm, das ihn auf dem ersten Feld im Tunnelinnern anhalten lässt.
//Aber Achtung: manche Tunnels haben zunächst eine einseitige Wand, manche links, manche rechts.

//Kara is looking for the entrance of a straight tunnel (field 2a). Write a program that stops him on the first field inside the tunnel.
//But be careful: some tunnels initially have a wall on one side, some on the left, some on the right.

import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {

void emptyField(){ // Function/Method checking if kara is in the void (no tree left, right, front)
    if(!kara.treeLeft() && !kara.treeRight() && !kara.treeFront()){
        kara.move();
    }else {
        hitsTree(); // when tree appears on one of the sides, calls function/method
    }
}

void turnLeft(){ // Function/Method turns left
    kara.turnLeft();
    kara.move();
        if(!kara.treeRight()){ // checks if theres a tree on the right after turning
            kara.turnRight();
            kara.move();
        }
}

void turnRight(){ // Function/Method turns right
    kara.turnRight();
    kara.move();
        if(!kara.treeRight()){ // checks if theres a tree on the left after turning
            kara.turnRight();
            kara.move();
        }
}

void hitsTree(){ // Function/Method to check
    if(kara.treeFront() && kara.treeLeft()){ // free front AND left, turn left
        turnRight();
    }else if(kara.treeFront() && kara.treeRight()){ // free front AND left, turn right
        turnLeft();
    }else if(kara.treeFront()){ // tree front? turn left
        turnLeft();
    }else if(!kara.treeFront() && kara.treeRight() && !kara.treeLeft()){ // NO tree front AND tree right AND no tree left, kara move, kara turn right
        kara.move();
        kara.turnRight();     
    }else{
        kara.move();
    }

}

public void myProgram() {
   
    while(true){
        emptyField(); // calls function/method
    }
}
}
```