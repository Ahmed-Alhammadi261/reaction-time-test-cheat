import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) {

        Robot mouseBot;

        try {
            mouseBot = new Robot();
        } catch (AWTException e) {
            System.out.println(":P");
            return;
        }

        mouseBot.mouseMove(2000, 500);

        Color pixelColor;
        Color tagetColor = new Color(75, 219, 106);

        mouseBot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        mouseBot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


        boolean isDone = false;


        while (!isDone) {

            pixelColor = mouseBot.getPixelColor(2000, 500);

            if (pixelColor.equals(tagetColor)) {
                mouseBot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                mouseBot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                isDone = true;
            }
        }
    }
}