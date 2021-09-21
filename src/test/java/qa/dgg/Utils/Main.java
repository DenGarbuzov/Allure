package qa.dgg.Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import java.nio.charset.StandardCharsets;

public class Main extends Variables{

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;}

    @Attachment(value = "Странице", type = "text/html")
    public byte[] takePageSource() {
        return WebDriverRunner.getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }

    @Attachment(value = "Скриншот", type = "image/png")
    public byte[] takeScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }

}
