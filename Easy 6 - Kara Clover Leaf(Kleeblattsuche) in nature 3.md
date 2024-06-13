

``` Java
// In Karas Welt gibt es Wälder mit Rundgängen, in denen Kara auf Kleeblättersuche geht. Jedes Feld in einem Rundgang hat genau zwei freie benachbarte Felder.
//Eines davon liegt hinter Kara, von diesem Feld aus ist auf das aktuelle Feld gekommen.
//Das heisst, genau hinter einem der drei Fragezeichen in der folgenden Abbildung ist ein leeres Feld, hinter den beiden anderen Fragezeichen liegen Felder mit Bäumen:


// In Kara's world, there are forests with circular paths where Kara searches for clovers. Each field in a circular path has exactly two free adjacent fields.
// One of these fields is behind Kara, from which he came to the current field.
// This means that exactly behind one of the three question marks in the following illustration is an empty field, and behind the other two question marks are fields with trees:
import javakara.JavaKaraProgram;       
public class ulala extends JavaKaraProgram {

void moveRight(){ // Function/Method to turn Right
    if(kara.treeFront() && kara.treeLeft()){
       kara.turnRight();
       kara.move();
    }    
}

void moveLeft(){ // Function/Method to turn Left
       kara.turnLeft();
       kara.move();
}

void moveForward(){ // Function/Method to keep moving forward
    if(!kara.treeFront()){
        kara.move();
    }else if(kara.treeFront() && kara.treeLeft()){
        moveRight();
    }else if(kara.treeFront() && kara.treeRight()){
        moveLeft();
    }
}

public void myProgram() {
    while(true){ // never ending loop
        moveForward();
    if(kara.onLeaf()){
        kara.removeLeaf();
        break;
    }        
    }  
}
}
```