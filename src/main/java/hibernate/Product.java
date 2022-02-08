package hibernate;

import org.hibernate.engine.jdbc.ClobProxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

@Entity(name = "Product")
public class Product {

    @Id
    private Integer id;

    private String name;

    @Lob
    private Clob warranty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clob getWarranty() {
        return warranty;
    }

    public void setWarranty(Clob warranty) {
        this.warranty = warranty;
    }

    //Getters and setters are omitted for brevity

    public static void main(String[] args){
        Product product = new Product();
        product.setWarranty(ClobProxy.generateProxy("test"));
        try {
            Reader reader = product.getWarranty().getCharacterStream();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
