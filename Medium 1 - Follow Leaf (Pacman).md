``` Java
//Programmieren Sie Kara so, dass er die Spur von Kleeblättern "auffrisst"!
//Da Sie wissen, dass die Spur nie entlang eines Baumes geht, kann das Programm beendet werden, sobald Kara auf einem Kleeblatt vor einem Baum steht.
//Sie können selbst bestimmen, ob Sie auf einem Kleeblatt oder davor starten wollen.

// Program Kara to "consume" the trail of clovers!
// Since you know that the trail never goes along a tree, the program can be terminated as soon as Kara is standing on a clover in front of a tree.
// You can decide whether you want to start on a clover or in front of it.

import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {
void karaOnLeaf(){ 
    if(kara.onLeaf()){
        kara.removeLeaf();
        kara.move();
    }else{
        searchLeaf();
    }
}
void searchLeaf(){ // Function/Method search for leafs
    if(!kara.onLeaf()){ // if next field doesn't have leaf, turn back
        kara.turnLeft();
        kara.turnLeft();
        kara.move();
        if(kara.onLeaf()){  
            kara.move();
        }
        kara.turnLeft();
        kara.move();
    }
}

public void myProgram() {
    while(true){
        karaOnLeaf();
       for(int i=0; i > 1; i++){ // hardcoded, it allows java to hit the tree only two times
          if(kara.treeFront()){
              kara.turnLeft();
              kara.turnLeft();
              kara.move();
           }
        }
    }
}
}
```