package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
/* 1) localhost:8080, add text that states the three possible programming languages
someone could be working on.
You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing
three programming languages of your choosing.
  */

    @GetMapping
    @ResponseBody
    public String createHomePage() {
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body></html>";
    }

    /* 2) At localhost:8080/form, add a form that lets the user enter their name and choose their favorite,
    second favorite, and third favorite programming languages on your list. Use select elements
    for each of the rankings. Just as with the exercises, we will use @GetMapping()
     */

    @GetMapping("/form")
    @ResponseBody
    public String createForm() {
        return "<html><body>" +
                "<form method = 'post'>" +
                "<label>Name:<br /><input type='text' name='name' /></label><br />" +
                "<label>My first favorite language:<br />" +
                "<select> name=\"first\" id=\"first\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Python\">Python</option>"+
                "</select></label><br />" +
                "<label>My second favorite language:<br />" +
                "<select> name=\"secondlang\" id=\"secondlang\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Python\">Python</option>"+
                "</select></label><br />" +
                "<label>My third favorite language:<br />" +
                "<select> name=\"thirdlang\" id=\"thirdlang\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Python\">Python</option>"+
                "</select></label><br />" +
                "<input type=\"submit\" value=\"Submit!\" />" +
                "</body></html>";
    }
    /*3) Also at localhost:8080/form, use @PostMapping and @RequestParam
    to update the HTML with an h1 stating the user’s name and an ol showing the three
    programming languages in the order they chose.*/
    @PostMapping("/form")
    @ResponseBody
    public String respondToFormSubmission(@RequestParam String name,
                                          @RequestParam String first,
                                          @RequestParam String secondlang,
                                          @RequestParam String thirdlang) {
        return "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + secondlang + "</li>" +
                "<li>" + thirdlang + "</li>" +
                "</ol>" +
                "</body></html>";

    }

}
