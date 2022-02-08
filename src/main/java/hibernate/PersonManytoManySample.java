package hibernate;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Person")
public class PersonManytoManySample {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private Set<Address> addresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}
