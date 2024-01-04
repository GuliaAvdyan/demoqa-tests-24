package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;


public class PractiseFormTest extends BaseTest {


    @Test
    void fillTheFormTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Vasya");
        $("#lastName").setValue("Vasiliev");
        $("#userEmail").setValue("vasya.vasiliev@gmail.com");
        $("[value=Female]").parent().click();
        $("#userNumber").setValue("8999999999");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue("a");
        $("#subjectsWrapper").find(byText("Arts")).click();
        $("#hobbiesWrapper").find(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("image.jpg");
        $("textarea#currentAddress").setValue("Test address");
        $("#state").click();
        $("#stateCity-wrapper").find(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").find(byText("Karnal")).click();
        $("#submit").scrollTo().click();

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table").shouldHave(text("Vasya Vasiliev"));
        $(".table").shouldHave(text("vasya.vasiliev@gmail.com"));
        $(".table").shouldHave(text("Female"));
        $(".table").shouldHave(text("8999999999"));
        $(".table").shouldHave(text("04 December,1995"));
        $(".table").shouldHave(text("Arts"));
        $(".table").shouldHave(text("Music"));
        $(".table").shouldHave(text("image.jpg"));
        $(".table").shouldHave(text("Test address"));
        $(".table").shouldHave(text("Haryana Karnal"));
    }
}
