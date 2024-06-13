
``` Java
//Schreiben Sie ein Programm, das Kara bis zum nächsten Baum führt.
//Liegt auf einem Feld ein Blatt, soll Kara es aufnehmen; liegt auf einem Feld kein Blatt, eines hinlegen.
//Bei dem Baum angekommen ist das Programm zu beenden.


// Write a program that guides Kara to the next tree.
//If there is a leaf on a field, Kara should pick it up; if there is no leaf on a field, Kara should place one.
//The program should terminate when Kara reaches the tree.

import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {

void putRemoveLeaf(){
    if(kara.onLeaf()){
        kara.removeLeaf();
    }else{
        kara.putLeaf();
    }
}


public void myProgram() {
    while(!kara.treeFront()){
        putRemoveLeaf();
        kara.move();
    }
    putRemoveLeaf();
}
}
```
