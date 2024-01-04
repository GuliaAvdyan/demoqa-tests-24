package guru.qa;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpathExamples() {
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]").setValue("some text");
        $(by("data-testid", "email")).setValue("some text");
        $x("//*[@data-testid='email']").setValue("some text");

        $("[id=email]").setValue("some text");
        $(by("id", "email")).setValue("some text");
        $x("//*[@id='email']").setValue("some text");
        $(byId("email")).setValue("some text");
        $("#email").setValue("some text"); //по айдишнику


        $("[class=login_form_input_box]").setValue("some text");
        $(by("class", "login_form_input_box")).setValue("some text");
        $x("//*[@class='login_form_input_box']").setValue("some text");
        $(byClassName("login_form_input_box")).setValue("some text");
        $(".login_form_input_box").setValue("some text");

        $("input.login_form_input_box").setValue("some text"); // по тегу и названию класса
        $("[class=inputtext][class=login_form_input_box]").setValue("some text"); // по целому названию класса


        // <div class="inputtext">
        //      <input type="email" class"login_form_input_box">
        // </div>
        $(".login_form_input_box").setValue("some text"); // по второму классу
        $(".inputtext .login_form_input_box").setValue("some text"); // по первому классу и второму классу с пробелом!

        $("div.inputtext input.login_form_input_box").setValue("some text"); // по обоим классам
        $("div.inputtext").$("input.login_form_input_box").setValue("some text"); // по второму классу

        // <div>"Hello, qa guru!"</div>
        $(byText("Hello, qa guru!"));
        $(withText("qa guru!"));

    }
}
