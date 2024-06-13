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
