import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.SetValue;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {
    @Test
    void AppOrderTest() {
        open("http://localhost:9999/");
        $("[data-test-id=name] input").setValue("Никитин Никита");
        $("[data-test-id=phone] input").setValue("+79990000000");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $(".Success_successBlock__2L3Cw").shouldHave(Condition.exactText("Ваша заявка  отправлена! Наш менеджер свяжется с вами в ближайшее время."));


    }

}
