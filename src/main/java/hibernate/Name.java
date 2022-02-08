package hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Name {

    private String firstName;

    private String middleName;

    private String lastName;

    // getters and setters omitted
}
