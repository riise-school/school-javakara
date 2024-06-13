

``` java
//Erweitern Sie Ihr Programm von Aufgabe 4 so, dass Kara auch mit mehreren nebeneinander stehenden Bäumen fertig wird!
//Hinweis: Die Lösung dieser Aufgabe erfordert zwei Zustände!
//Warum reicht ein Zustand nicht aus?


//Extend your program from task 4 so that Kara can also handle multiple trees standing next to each other!
//Note: Solving this task requires two states!
//Why is one state not enough?

import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {
void treeInFront(){ // checks if theres a tree in front, if not keep moving
    if(kara.treeFront()){
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.move();
        while(kara.treeRight()){ // if tree on the right, keep moving forward
            kara.move();
        }
        kara.turnRight();
        kara.move();
        kara.turnLeft();
    }else{
        kara.move();    
    }
}



public void myProgram() {
    while(!kara.onLeaf()){
            treeInFront(); // call method/function 
    }
    if(kara.onLeaf()){
        kara.removeLeaf();
    }     
}
}
```