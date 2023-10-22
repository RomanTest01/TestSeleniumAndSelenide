import com.codeborne.selenide.Condition;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {

    @Test

    void appOrderTest() {
        open("http://localhost:9999/");
        $("[data-test-id=name] input").setValue("Никитин Никита");
        $("[data-test-id=phone] input").setValue("+79990000000");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='order-success']").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));



    }

}
