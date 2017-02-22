package mil.cm.navy.domain;

import javax.persistence.*;

/**
 * Created by patricktchankue on 2/13/17.
 */
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long city_id;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade=CascadeType.ALL, targetEntity=Country.class)
    @JoinColumn(name = "country_id")
    private Country country;
}
