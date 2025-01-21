package Practice.Dto.Dto.UsersDto;

import java.time.LocalDateTime;
import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GeneratedUsers {
    Faker fakerUA = new Faker();
    Faker fakerRU = new Faker(Locale.forLanguageTag("ru"));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    String nowData = LocalDateTime.now().format(formatter);
    String afterData = LocalDateTime.now().plusMonths(1).format(formatter);
    String beforeData = LocalDateTime.now().minusMonths(1).format(formatter);

    @DataProvider(name = "createUsers")
    public Object[][] createUsers() {
        String userNameSpec = "@#$%^&=-";
        return new Object[][]{
                {new UserDto(
                        new CustomData(false, nowData, "active_search"),
                        fakerUA.bothify("??!@#"),
                        "",
                        fakerUA.name().firstName(),
                        "",
                        fakerRU.internet().password(),
                        ""
                )},
                {new UserDto(
                        new CustomData(true, beforeData, "on_project"),
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().lastName(),
                        "",
                        fakerRU.name().firstName(),
                        "",
                        "admin"
                )},
                {new UserDto(
                        new CustomData(null, nowData, ""),
                        fakerUA.bothify("??!@#"),
                        fakerUA.bothify("????!@#"),
                        fakerUA.internet().emailAddress(),
                        userNameSpec,
                        fakerUA.internet().password(true),
                        ""
                )},
                {new UserDto(
                        new CustomData(true, afterData, "active_search"),
                        fakerUA.bothify("??!@#"),
                        "",
                        fakerUA.name().firstName(),
                        "",
                        fakerRU.internet().password(),
                        "user"
                )},
                {new UserDto(
                        new CustomData(false, "", "pause_search"),
                        fakerUA.bothify("??!@#"),
                        fakerRU.name().lastName(),
                        fakerRU.name().firstName(),
                        fakerUA.name().firstName(),
                        userNameSpec,
                        ""
                )},
                {new UserDto(
                        new CustomData(null, "2024-08-25T19:01:00.000Z", "on_project"),
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().lastName(),
                        "",
                        fakerRU.name().firstName(),
                        "",
                        "user"
                )},
                {new UserDto(
                        new CustomData(false, "2024-08-25T19:01:00.000Z", ""),
                        "",
                        "",
                        fakerRU.name().firstName(),
                        fakerRU.name().firstName(),
                        fakerUA.internet().password(true),
                        "user"
                )},
                {new UserDto(
                        new CustomData(true, nowData, "pause_search"),
                        "",
                        fakerUA.name().lastName(),
                        fakerUA.internet().emailAddress(),
                        "",
                        userNameSpec,
                        "user"
                )},
                {new UserDto(
                        new CustomData(false, "2024-08-25T19:01:00.000Z", "on_project"),
                        "",
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().firstName(),
                        fakerUA.name().firstName(),
                        "",
                        "admin"
                )},
                {new UserDto(
                        new CustomData(null, beforeData, ""),
                        "",
                        "",
                        fakerRU.name().firstName(),
                        fakerRU.name().firstName(),
                        fakerUA.internet().password(true),
                        ""
                )},
                {new UserDto(
                        new CustomData(true, nowData, "active_search"),
                        "",
                        fakerRU.name().lastName(),
                        "",
                        userNameSpec,
                        fakerRU.internet().password(),
                        "user"
                )},
                {new UserDto(
                        new CustomData(null, afterData, "pause_search"),
                        "",
                        fakerUA.name().lastName(),
                        fakerUA.internet().emailAddress(),
                        "",
                        userNameSpec,
                        "admin"
                )},
                {new UserDto(
                        new CustomData(true, "2024-11-12T19:01:00.000Z", "on_project"),
                        "",
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().firstName(),
                        fakerUA.name().firstName(),
                        "",
                        ""
                )},
                {new UserDto(
                        new CustomData(null, "2024-11-12T19:01:00.000Z", ""),
                        fakerRU.name().firstName(),
                        fakerRU.name().lastName(),
                        fakerUA.internet().emailAddress(),
                        fakerUA.name().firstName(),
                        fakerUA.internet().password(true),
                        "user"
                )},
                {new UserDto(
                        new CustomData(true, "2024-08-25T19:01:00.000Z", "active_search"),
                        fakerRU.name().firstName(),
                        fakerUA.name().lastName(),
                        fakerUA.name().firstName(),
                        fakerRU.name().firstName(),
                        fakerRU.internet().password(),
                        "admin"
                )},
                {new UserDto(
                        new CustomData(false, beforeData, "pause_search"),
                        fakerRU.name().firstName(),
                        fakerUA.name().lastName(),
                        fakerRU.name().firstName(),
                        userNameSpec,
                        userNameSpec,
                        ""
                )},
                {new UserDto(
                        new CustomData(null, nowData, "on_project"),
                        fakerRU.name().firstName(),
                        "",
                        "",
                        "",
                        "",
                        "user"
                )},
                {new UserDto(
                        new CustomData(true, "2024-08-25T19:01:00.000Z", ""),
                        fakerRU.name().firstName(),
                        fakerRU.name().lastName(),
                        fakerUA.internet().emailAddress(),
                        fakerUA.name().firstName(),
                        fakerUA.internet().password(true),
                        ""
                )},
                {new UserDto(
                        new CustomData(false, beforeData, "active_search"),
                        fakerRU.name().firstName(),
                        fakerUA.name().lastName(),
                        fakerUA.name().firstName(),
                        fakerRU.name().firstName(),
                        fakerRU.internet().password(),
                        "user"
                )},
                {new UserDto(
                        new CustomData(null, nowData, "pause_search"),
                        fakerRU.name().firstName(),
                        fakerUA.bothify("??!@#"),
                        fakerRU.name().firstName(),
                        userNameSpec,
                        userNameSpec,
                        "admin"
                )},
                {new UserDto(
                        new CustomData(true, afterData, "on_project"),
                        fakerRU.name().firstName(),
                        "",
                        "",
                        "",
                        "",
                        ""
                )},
                {new UserDto(
                        new CustomData(null, afterData, ""),
                        fakerUA.name().firstName(),
                        fakerUA.name().lastName(),
                        fakerRU.name().firstName(),
                        "",
                        fakerUA.internet().password(true),
                        "user"
                )},
                {new UserDto(
                        new CustomData(true, "", "active_search"),
                        fakerUA.name().firstName(),
                        fakerUA.bothify("??!@#"),
                        "",
                        fakerUA.name().firstName(),
                        fakerRU.internet().password(),
                        "admin"
                )},
                {new UserDto(
                        new CustomData(null, "2024-08-25T19:01:00.000Z", "pause_search"),
                        fakerUA.name().firstName(),
                        "",
                        fakerUA.internet().emailAddress(),
                        fakerRU.name().firstName(),
                        userNameSpec,
                        ""
                )},
                {new UserDto(
                        new CustomData(true, beforeData, "on_project"),
                        fakerUA.name().firstName(),
                        fakerRU.name().lastName(),
                        fakerUA.name().firstName(),
                        userNameSpec,
                        "",
                        "user"
                )},
                {new UserDto(
                        new CustomData(false, nowData, ""),
                        fakerUA.name().firstName(),
                        fakerUA.name().lastName(),
                        fakerRU.name().firstName(),
                        "",
                        fakerUA.internet().password(true),
                        "admin"
                )},
                {new UserDto(
                        new CustomData(null, "2024-08-25T19:01:00.000Z", "active_search"),
                        fakerUA.name().firstName(),
                        fakerUA.bothify("??!@#"),
                        "",
                        fakerUA.name().firstName(),
                        fakerRU.internet().password(),
                        ""
                )},
                {new UserDto(
                        new CustomData(true, beforeData, "pause_search"),
                        fakerUA.name().firstName(),
                        "",
                        fakerUA.internet().emailAddress(),
                        fakerRU.name().firstName(),
                        userNameSpec,
                        "user"
                )},
                {new UserDto(
                        new CustomData(false, nowData, "on_project"),
                        fakerUA.name().firstName(),
                        fakerRU.name().lastName(),
                        fakerUA.name().firstName(),
                        userNameSpec,
                        "",
                        ""
                )},
                {new UserDto(
                        new CustomData(true, nowData, ""),
                        fakerUA.bothify("??!@#"),
                        fakerUA.bothify("??!@#"),
                        fakerUA.internet().emailAddress(),
                        userNameSpec,
                        fakerUA.internet().password(true),
                        ""
                )},
                {new UserDto(
                        new CustomData(false, afterData, "active_search"),
                        fakerUA.bothify("??!@#"),
                        "",
                        fakerUA.name().firstName(),
                        "",
                        fakerRU.internet().password(),
                        "user"
                )},
                {new UserDto(
                        new CustomData(null, "", "pause_search"),
                        fakerUA.bothify("??!@#"),
                        fakerRU.name().lastName(),
                        fakerRU.name().firstName(),
                        "vanyaIvanov",
                        userNameSpec,
                        ""
                )},
                {new UserDto(
                        new CustomData(true, "2024-08-25T19:01:00.000Z", "on_project"),
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().lastName(),
                        "",
                        fakerRU.name().firstName(),
                        "",
                        "user"
                )},
                {new UserDto(
                        new CustomData(null, beforeData, ""),
                        fakerUA.bothify("??!@#"),
                        fakerUA.bothify("??!@#"),
                        fakerUA.internet().emailAddress(),
                        userNameSpec,
                        fakerUA.internet().password(true),
                        "admin"
                )},
                {new UserDto(
                        new CustomData(true, nowData, "active_search"),
                        fakerUA.bothify("??!@#"),
                        "",
                        fakerUA.name().firstName(),
                        "",
                        fakerRU.internet().password(),
                        ""
                )},
                {new UserDto(
                        new CustomData(false, "2024-08-25T19:01:00.000Z", "pause_search"),
                        fakerUA.bothify("??!@#"),
                        fakerRU.name().lastName(),
                        fakerRU.name().firstName(),
                        fakerUA.name().firstName(),
                        userNameSpec,
                        "user"
                )},
                {new UserDto(
                        new CustomData(null, beforeData, "on_project"),
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().lastName(),
                        "",
                        fakerRU.name().firstName(),
                        "",
                        "admin"
                )},
                {new UserDto(
                        new CustomData(false, beforeData, ""),
                        "",
                        "",
                        fakerRU.name().firstName(),
                        fakerRU.name().firstName(),
                        fakerUA.internet().password(true),
                        ""
                )},
                {new UserDto(
                        new CustomData(null, nowData, "active_search"),
                        "",
                        fakerRU.name().lastName(),
                        "",
                        userNameSpec,
                        fakerRU.internet().password(),
                        "user"
                )},
                {new UserDto(
                        new CustomData(true, afterData, "pause_search"),
                        "",
                        fakerUA.name().lastName(),
                        fakerUA.internet().emailAddress(),
                        "",
                        userNameSpec,
                        "admin"
                )},
                {new UserDto(
                        new CustomData(false, "", "on_project"),
                        "",
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().firstName(),
                        fakerUA.name().firstName(),
                        "",
                        ""
                )},
                {new UserDto(
                        new CustomData(null, "2024-08-25T19:01:00.000Z", ""),
                        "",
                        "",
                        fakerRU.name().firstName(),
                        fakerRU.name().firstName(),
                        fakerUA.internet().password(true),
                        "user"
                )},
                {new UserDto(
                        new CustomData(true, beforeData, "active_search"),
                        "",
                        fakerRU.name().lastName(),
                        "",
                        userNameSpec,
                        fakerRU.internet().password(),
                        ""
                )},
                {new UserDto(
                        new CustomData(null, nowData, "pause_search"),
                        "",
                        fakerUA.name().lastName(),
                        fakerUA.internet().emailAddress(),
                        "",
                        userNameSpec,
                        "user"
                )},
                {new UserDto(
                        new CustomData(true, "2024-08-25T19:01:00.000Z", "on_project"),
                        "",
                        fakerUA.bothify("??!@#"),
                        fakerUA.name().firstName(),
                        fakerUA.name().firstName(),
                        "",
                        "admin"
                )}
        };
    }

}
