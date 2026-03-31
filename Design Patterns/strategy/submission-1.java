class Person {
    private String lastName;
    private int age;
    private boolean isMarried;

    public Person(String lastName, int age, boolean isMarried) {
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }
}

interface PersonFilter {
    boolean apply(Person person);
}

class AdultFilter implements PersonFilter {
    private Person person; 

    @Override
    public boolean apply(Person person) {
        this.person = person;
        return this.person.getAge() > 18;
    }
}

class SeniorFilter implements PersonFilter {
    private Person seniorPerson;
    public boolean apply(Person person) {
        this.seniorPerson = person;
        return this.seniorPerson.getAge() > 65;
    }
}

class MarriedFilter implements PersonFilter {
    private Person marriedPerson;

    public boolean apply(Person person) {
        this.marriedPerson = person;
        return this.marriedPerson.isMarried();
    }
}

class PeopleCounter {
    private PersonFilter filter;

    public void setFilter(PersonFilter filter) {
        this.filter = filter;
    }

    public int count(List<Person> people) {
        int res = 0;
        for(Person p : people) {
            if(this.filter.apply(p)) {
                res += 1;
            }
        }
        return res;
    }
}
