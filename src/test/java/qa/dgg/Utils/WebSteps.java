package qa.dgg.Utils;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps extends Variables {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open(url);
    }

    @Step("Ищем репозиторий {repo}")
    public void searchForRepository(String repo) {
        $(searchPanel).click();
        $(searchPanel).sendKeys(repo);
        $(searchPanel).submit();
    }

    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Проверяем раздел Issues")
    public void openIssueTab() {
        $(partialLinkText(searchingItem)).shouldBe(Condition.visible);
    }

  }