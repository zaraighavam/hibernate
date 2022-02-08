package hibernate;

import javax.persistence.*;

@Entity(name = "Person")
@Table(name = "Person_tlb" , schema = "sample")
public class AssociationSample {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surename")
    private String family;

    @ManyToOne
    @JoinColumn(name = "child_id",
     foreignKey = @ForeignKey(name = "PERSON_ID_FK"))
    private AssociationChildSample childSample;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

}
