``` Java
// Programmieren Sie Kara so, dass er eine Kleeblatt-Spirale wie die obige zeichnet.
//Von innen nach aussen ist jede Kante der Spirale um eins länger als die vorangehende.

// Program Kara to draw a clover spiral like the one above.
// From the inside out, each edge of the spiral is one unit longer than the previous one.

import javakara.JavaKaraProgram;        
public class ulala extends JavaKaraProgram {

public void myProgram() {
        for(int i = 1; i > 0; i++){
            for(int x = 0; x < i; x++){
                kara.putLeaf();
                kara.move();
            }
            kara.turnRight();
        }
}
}
```

