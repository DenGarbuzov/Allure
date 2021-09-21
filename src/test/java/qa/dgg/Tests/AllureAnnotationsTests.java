package qa.dgg.Tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import qa.dgg.Utils.Main;
import qa.dgg.Utils.WebSteps;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;




@Feature("Base label")
@Severity(SeverityLevel.BLOCKER)
@DisplayName("Прикручивание аннотаций к тестам")
public class AllureAnnotationsTests extends Main {

    @Test
    public void testAnnotations() {

        step("Открываем основную страницу", () -> open(url));

        step("Вводим адрес искомого репозитория", () -> {
            searchPanel.click();
            searchPanel.sendKeys(repSearch);
                 });

        step("Подтверждаем выбор", () -> searchPanel.submit());

        step("Переходим в корень репозитория", () -> $(By.linkText(repSearch)).click());

        step("Проверка наличия искомой сущности", () -> {
            $(By.partialLinkText(searchingItem)).shouldBe(Condition.visible);
                  });
    }

    @Test
    public void testAnnotationsSteps() {

        WebSteps ws = new WebSteps();

        ws.openMainPage();
        ws.searchForRepository(repSearch);
        ws.goToRepository(repSearch);
        ws.openIssueTab();
    }

}
