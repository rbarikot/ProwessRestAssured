package API.ReusableMethods;

import com.github.javafaker.Faker;

public class FakerUtil {
    private static final Faker faker = new Faker();
    public static String getRandomName() {
        return faker.name().fullName();
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomBusiness() {
        return faker.business().toString();
    }
}
