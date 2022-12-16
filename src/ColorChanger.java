import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColorChanger {

    //Lista med Färger som kan användas
    private static List<Color> colorList = Arrays.asList(Color.GREEN,Color.BLUE, Color.MAGENTA, Color.CYAN, Color.ORANGE, Color.PINK, Color.YELLOW, Color.WHITE);


    //funktion som ger en slumpmässig färg
    public static Color getRandomColor(){

        Collections.shuffle(colorList);
        return colorList.get(0);
    }

}
