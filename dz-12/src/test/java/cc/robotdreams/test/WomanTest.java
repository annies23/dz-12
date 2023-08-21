package cc.robotdreams.test;

import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomanTest {
    @DataProvider(name = "womanGenderProvider")
    public static Object[][] provideWomanGenderData() {
        return new Object[][]{
                {new Woman("Крістіна", "Річі", 58, null), Person.Gender.Woman},
                // Додайте інші дані, якщо потрібно
        };
    }
    @Test(dataProvider = "womanGenderProvider")
    public void testGetGender(Woman woman, Person.Gender expectedGender) {
        Assert.assertEquals(woman.getGender(), expectedGender);
    }

    @DataProvider(name = "retiredWomanProvider")
    public static Object[][] provideRetiredWomanData() {
        return new Object[][]{
                {new Woman("Крістіна", "Річі", 58, null), false},
                {new Woman("Різ", "Візерспун", 61, null), true},
                // Додайте інші дані, якщо потрібно
        };
    }
    @Test(dataProvider = "retiredWomanProvider")
    public void testIsRetired(Woman woman, boolean expectedRetired) {
        Assert.assertEquals(woman.isRetired(), expectedRetired);
    }

}
