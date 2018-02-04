package util;

import gherkin.formatter.model.Result;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.events.MakeAttachmentEvent;

import static Steps.BaseSteps.getDriver;
import static Steps.BaseSteps.takeScreenShot;

/**
 * Created by Varderesyan Tsolak on 27.01.2018.
 */
public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {

    @Override
    public void result(Result result) {
        if ("failed".equals(result.getStatus()))
            takeScreenShot();
        super.result(result);
    }

    @Attachment(type = "image/png", value = "Screenshot")
    /**public static byte[] takeScreenShot() {

     return ((TakesScreenshot)BaseSteps.driver()).getScreenshotAs(OutputType.BYTES);
     }*/

    public void takeScreenshot(Result step) {
        if (getDriver() != null) {
            Allure.LIFECYCLE.fire(new MakeAttachmentEvent(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES),
                    "Скриншот в момент ошибки", "image/png"));
        }
    }
}