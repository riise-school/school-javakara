``` Java
//Programmieren Sie Kara so, dass er Dreiecke zeichnet!
//Program Kara to draw triangles!
import javakara.JavaKaraProgram;
public class ulala extends JavaKaraProgram {
    boolean previous = false;

    void switchDirection(boolean x) {
        if (x) {
            kara.move();
            kara.turnLeft(); // true LEFT
            kara.move();
            kara.turnLeft();
            previous = false;
        } else {
            kara.move();
            kara.turnRight(); // false RIGHT
            kara.move();
            kara.turnRight();
            previous = true;
        }
    }

    void putRemoveLeaf() {
        if (!kara.onLeaf()) {
            kara.putLeaf();
        }
    }

    // Method to expand the array dynamically without using System.arraycopy
    int[] expandArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void myProgram() {
        int initialCapacity = 10;
        int[] arrayOf = new int[initialCapacity];
        int size = 0;

        for (int i = 0; ; i++) {
            if (i >= arrayOf.length) {
                arrayOf = expandArray(arrayOf);
            }
            
            // Generate new elements dynamically (e.g., odd numbers starting from 1)
            if (i >= size) {
                arrayOf[i] = (i * 2) + 1;
                size++;
            }

            for (int x = 1; x < arrayOf[i]; x++) {
                putRemoveLeaf();
                kara.move();
            }
            putRemoveLeaf();
            switchDirection(previous);
        }
    }
}
```
