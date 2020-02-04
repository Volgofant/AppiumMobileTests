package tests;

import lib.Core;
import org.junit.Test;
import org.openqa.selenium.ScreenOrientation;

public class FifthTest extends Core {
    @Test
    public void testLandscapePortrait() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
        driver.rotate(ScreenOrientation.PORTRAIT);


    }
}
