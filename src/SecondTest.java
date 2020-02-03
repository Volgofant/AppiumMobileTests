import org.junit.Test;
import org.openqa.selenium.By;

public class SecondTest extends Core {

    @Test
    public void secondTest() {
        for (int i = 0; i < 3; i++) {
            waitForElementAndClick(
                    By.xpath("//android.widget.ImageView[@content-desc=\"Continue\"]\n"),
                    "cannot find search input",
                    0);
        }

        waitForElementAndClick(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView\n"),
                "cannot find search input",
                5
        );
        waitForElementAndClick(
                By.xpath("//*[contains(@text,'Search Wikipedia')]"),
                "cannot find search input"
        );
        waitForElementAndSendKeys(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"),
                "Appium",
                "Error!!!",
                5
        );
        waitForElementAndClick(
                By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']//*[@text='Appium']"),
                "cannot find Xpath - element Java",
                15);
        swipeUpToFindElement(
                By.xpath("//*[@text='View page in browser']"),
                "Test error message",
                20
        );

    }

}
