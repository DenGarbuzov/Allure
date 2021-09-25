package qa.dgg.Tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import qa.dgg.Utils.Main;
import qa.dgg.Utils.WebSteps;

@Feature("Использование @Steps ")
public class WebStepsTests extends Main {
    @Test
    public void testAnnotationsSteps() {

        WebSteps ws = new WebSteps();

        ws.openMainPage();
        ws.searchForRepository(repSearch);
        ws.goToRepository(repSearch);
        ws.openIssueTab();
    }
}
