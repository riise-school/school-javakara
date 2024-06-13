``` Java
// Kara möchte zwischen den Bäumen Slalom fahren. Der Anfang des Slaloms ist im Bild eingezeichnet.
//Programmieren Sie Kara so, dass er den Slalom endlos hin- und zurück fährt.
//Am Anfang ist Kara immer so platziert, dass er zuerst eine Linkskurve machen muss.
//Wie lange der Parcour ist (wieviele Bäume der Slalom hat), weiss Kara zu Beginn natürlich nicht.
//Es soll ihm auch egal sein, ob die Bäume horizontal oder vertikal nebeneinander stehen.

// Kara wants to slalom between the trees. The start of the slalom is marked in the picture.
// Program Kara so that he endlessly goes back and forth through the slalom.
// At the beginning, Kara is always positioned so that he has to make a left turn first.
// Of course, Kara doesn't know in advance how long the course is (how many trees the slalom has).
// It should also not matter to him whether the trees are standing horizontally or vertically next to each other.

import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {
    
void left(){ // turning left
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.move();
        kara.turnLeft();
}

void right(){ // turning right
        kara.move();
        kara.turnRight();
        kara.move();
        kara.move();
        kara.turnRight();
}

public void myProgram() {
       boolean x = true;  // switch for changing directions
       
       while(true){ // infinite loop
               if(kara.treeFront()){kara.turnRight();kara.move();} // is a tree in front of kara?
          else if(kara.treeLeft() && kara.treeRight()){ // is kara between two trees?
                   if(x){
                        right();
                   }else{
                        left();
                   }
                 x = !x; // changing direction
          }else if(kara.treeLeft()){
                   left();
          }else if(kara.treeRight()){
                   right();
          }else{kara.move();}
        }
} 
}
````