package mil.cm.navy.domain;

import javax.persistence.*;

/**
 * Created by patricktchankue on 1/17/17.
 */
@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long country_id;

    @Column(name="name")
    private String name;

    protected Country(){}

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", name='" + name + '\'' +
                '}';
    }
}
