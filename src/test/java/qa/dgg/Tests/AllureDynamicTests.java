package qa.dgg.Tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Attachment;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import qa.dgg.Utils.Main;
import static com.codeborne.selenide.Selenide.*;

public class AllureDynamicTests extends Main {

    @Test
    @Feature("Новый раздел")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Какой-то текст для понимания сущности теста")
    public void testDynamic() {
        open(url);

        searchPanel.click();
        takeScreenshot();
        searchPanel.sendKeys(repSearch);
        takePageSource();
        searchPanel.submit();

        $(By.linkText(repSearch)).click();
        $(By.partialLinkText(searchingItem)).shouldBe(Condition.visible);
    }
}
