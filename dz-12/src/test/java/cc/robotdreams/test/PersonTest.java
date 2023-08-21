package cc.robotdreams.test;

import org.example.Man;
import org.example.Person;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {
    @Test
    public void testPersonConstructorAndGetters() {
        Person person = new Man("Name", "Surname", 30, null);

        Assert.assertEquals(person.getFirstName(), "Name");
        Assert.assertEquals(person.getLastName(), "Surname");
        Assert.assertEquals(person.getAge(), 30);
        Assert.assertNull(person.getPartner());
    }

    @Test
    public void testAgeSetter() {
        Person person = new Woman("Name", "Surname", 30, null);
        person.setAge(35);

        Assert.assertEquals(person.getAge(), 35);
    }
    @Test
    public void testPartnerSetterAndGetter() {
        Person person1 = new Man("Name1", "Surname1", 30, null);
        Person person2 = new Woman("Name2", "Surname2", 28, null);

        person1.setPartner(person2);

        Assert.assertEquals(person1.getPartner(), person2);
    }

    @Test
    public void testRegisterAndDeregisterPartnership() {
        Person woman = new Woman("Name1", "Surname1", 30, null);
        Person man = new Man("Name2", "Surname2", 35, null);

        woman.registerPartnership(man);

        Assert.assertEquals(woman.getPartner(), man);

        woman.deregisterPartnership(true);

        Assert.assertNull(woman.getPartner());
    }

    @Test
    public void testIsRetiredForMan() {
        Person man1 = new Man("Name1", "Surname1", 60, null);
        Person man2 = new Man("Name2", "Surname2", 65, null);

        Assert.assertTrue(man1.isRetired());
        Assert.assertTrue(man2.isRetired());
    }

    @Test
    public void testIsRetiredForWoman() {
        Person woman1 = new Woman("Name1", "Surname1", 58, null);
        Person woman2 = new Woman("Name2", "Surname2", 61, null);

        Assert.assertFalse(woman1.isRetired());
        Assert.assertTrue(woman2.isRetired());
    }
}
