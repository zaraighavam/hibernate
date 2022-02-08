package hibernate;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    private int id;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    @Enumerated
    private Gender gender;

    @Column(name = "sex2")
    @Convert(converter = EnumConvertorExample.class)
    private Gender sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
