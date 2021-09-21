package qa.dgg.Utils;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class Variables {
    public String url = "https://github.com",
    repSearch = "DenGarbuzov/Allure",
    searchingItem = "Issue";

    public SelenideElement searchPanel = $(".header-search-input");
}
