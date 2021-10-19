import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

 public class  GoogleCalculator {

    @Test
    public void calculatorCheck() {
        PageObject check = new PageObject();
        check.openGoogleTranslator();
        $$("div.XRsWPe.AOvabd").get(6).click();
        $$("div.XRsWPe.MEdqYd").get(27).click();
        $$("div.XRsWPe.AOvabd").get(7).click();
        $$("div.XRsWPe.MEdqYd").get(28).click();
        $$("div.XRsWPe.AOvabd").get(8).click();
        $$("div.XRsWPe.MEdqYd").get(29).click();
        $$("div.XRsWPe.AOvabd").get(6).click();
        $("div.XRsWPe.UUhRt").click();
        $("[id=cwos]").shouldHave(text("0"));
        $("span.vUGUtc").shouldHave(text("1 × 2 - 3 + 1 ="));
        PageObject close = new PageObject();
        close.tearDown();

    }
}

