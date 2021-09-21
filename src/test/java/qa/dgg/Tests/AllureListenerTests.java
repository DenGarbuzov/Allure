package qa.dgg.Tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import qa.dgg.Utils.Main;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AllureListenerTests extends Main {

    @Test
    public void testIssue() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open(url);

        searchPanel.as("Активация окна для поиска").click();
        searchPanel.as("Ввод адреса репозитория").sendKeys(repSearch);
        searchPanel.as("Подтверждение вводом").submit();

        $(By.linkText(repSearch)).as("Переход к репозиторию").click();
        $(By.partialLinkText(searchingItem)).as("Потверждение наличия").shouldBe(Condition.visible);
    }
}
