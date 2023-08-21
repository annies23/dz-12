package cc.robotdreams.test;
import org.example.Man;
import org.example.Person;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class ManTest {
        @DataProvider(name = "manGenderProvider")
        public static Object[][] provideManGenderData() {
        return new Object[][]{
                {new Man("Сем", "Сміт", 63, null), Person.Gender.Man},
        };
    }

        @Test(dataProvider = "manGenderProvider")
        public void testGetGender(Man man, Person.Gender expectedGender) {
        Assert.assertEquals(man.getGender(), expectedGender);
    }

        @DataProvider(name = "retiredManProvider")
        public static Object[][] provideRetiredManData() {
        return new Object[][]{
                {new Man("Сем", "Сміт", 63, null), false},
                {new Man("Джон", "МакКейн", 66, null), true},
        };
    }
        @Test(dataProvider = "retiredManProvider")
        public void testIsRetired(Man man, boolean expectedRetired) {
        Assert.assertEquals(man.isRetired(), expectedRetired);
    }

}
