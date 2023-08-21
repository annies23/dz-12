package org.example;

public class Woman extends Person {
    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }


    @Override
    public Gender getGender() {
        return Gender.Woman;
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }

    @Override
    public void registerPartnership(Person partner) {
        if (partner.getGender() == Gender.Man) {
            this.partner = partner;
            this.setLastName(partner.getLastName());
        } else {
            super.registerPartnership(partner);
        }
    }

    @Override
    public void deregisterPartnership(boolean returnLastName) {
        super.deregisterPartnership(returnLastName);
    }
}

