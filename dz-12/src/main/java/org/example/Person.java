package org.example;

abstract public class Person {

    public enum Gender {
        Man,
        Woman
    }
    private String      firstName;
    private String      lastName;
    private int         age;
    public Person       partner;
    private String      previousLastName;
    private boolean isRetired = false;


    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.age        = age;
        this.partner    = partner;

    }
    abstract public Gender getGender();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    abstract public boolean isRetired();
    //public boolean isRetired() {
        //    if (this.getGender() == Gender.Woman) {
            //        return age >= 60;
            //    } else if (this.getGender() == Gender.Man) {
            //        return age >= 65;
            //    }
        //    return false;
        //}
    //
    public void registerPartnership(Person partner) {
        this.partner = partner;
        partner.setPartner(this);
        if (this.getGender() == Gender.Woman) {
            this.previousLastName = this.getLastName();
            this.setLastName(partner.getLastName());
        }
    }

    public void deregisterPartnership(boolean returnLastName) {
        if (returnLastName && this.getGender() == Gender.Woman && this.partner != null) {
            if (this.previousLastName != null) {
                this.setLastName(this.previousLastName);
                this.previousLastName = null;
            }
            this.partner = null;
        }

    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }


}
