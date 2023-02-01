import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class UITest extends TestBase{
    @Test
    @Step("Какой-то шаг открытия страницы")
    void openPageTest() {
        open("https://habr.com/ru/all/");
        sleep(2500);
        //$(byAttribute("data-test-id","menu-toggle-guest")).click();
        dataTestId("menu-toggle-guest").click();
        $(".tm-user-menu__auth-button_primary").click(); //classname
        $("#email_field").setValue("someEmail@grr.la"); // id
    }

    private SelenideElement dataTestId(String id) {
        return $(byAttribute("data-test-id", id));
    }
}
