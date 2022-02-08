package hibernate;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Person_child")
@Table(name = "Person_child_tlb" , schema = "sample")
public class AssociationChildSample {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "age")
    private Long age;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<AssociationSample> associationSamples;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}

