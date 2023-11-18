package utils;

import com.github.javafaker.Faker;

public class FakerUtils {
    public static String getProduct() {
        String[] product = {"Плед", "Кружка", "Конструктор", "Флешка", "Крем"};
        return Faker.instance().options().option(product);
    }
}
