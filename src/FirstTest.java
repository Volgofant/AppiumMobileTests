import org.junit.Test;
import org.openqa.selenium.By;


public class FirstTest extends Core {
    @Test
    public void firstTest() {
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
                "Java",
                "Error!!!",
                5
        );
        waitForElementPresent(
                By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']//*[@text='Object-oriented programming language']"),
                "cannot find Xpath - element Java",
                15);
    }


}
