package Logic;

import ProjectFiles.Logic.ColorChanger;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ColorChangerTest {
    private static List<Color> colorList = Arrays.asList(Color.GREEN,Color.BLUE,
            Color.MAGENTA, Color.CYAN, Color.ORANGE, Color.PINK, Color.YELLOW, Color.WHITE);

    @Test
    void getRandomColorTest(){

        assert(colorList.contains(ColorChanger.getRandomColor()));
        assert(ColorChanger.getRandomColor()!=Color.BLACK);

    }
}
