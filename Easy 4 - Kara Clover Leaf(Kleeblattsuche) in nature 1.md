
``` Java
import javakara.JavaKaraProgram;
//Kara sucht ein Kleeblatt. Er weiss, dass eines geradeaus vor ihm liegt - er muss nur um die Bäume herumlaufen.
//Glücklicherweise stehen nie zwei Bäume nebeneinander.
//Schreiben Sie ein Programm, das ihn bis zum Kleeblatt führt!

// Kara is looking for the entrance of a straight tunnel (field 2a).
// Write a program that stops him at the first field inside the tunnel.
// But be careful: some tunnels initially have a wall on one side, some on the left, some on the right.

public class ulala extends JavaKaraProgram {
void treeInFront(){ // checks if theres a tree in front, if not keep moving
    if(kara.treeFront()){
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.move();
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