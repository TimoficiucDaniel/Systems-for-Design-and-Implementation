package group.lab1FINAL.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "cubes")
public class Cubes {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "price")
    private Integer price;
    @Column(name = "name")
    private String name;
    @Column(name = "producer")
    private String producer;
    @Column(name = "magnetic")
    private Boolean magnetic;


    public Cubes(String type, Integer price, String name, String producer, Boolean magnetic) {
        super();
        this.type = type;
        this.price = price;
        this.name = name;
        this.producer = producer;
        this.magnetic = magnetic;
    }

    public Cubes() {}

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public Boolean getMagnetic() {
        return magnetic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setMagnetic(Boolean magnetic) {
        this.magnetic = magnetic;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj)
            return true;
        if( !(obj instanceof Cubes))
            return false;
        Cubes cub = (Cubes) obj;
        return Objects.equals(this.id,cub.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public String toString() {
        return "Cubes{" +"\n"+
                "id=" + id +"\n"+
                ", type='" + type + '\'' +"\n"+
                ", price=" + price +"\n"+
                ", name='" + name + '\'' +"\n"+
                ", producer='" + producer + '\'' +"\n"+
                ", magnetic=" + magnetic +"\n"+
                '}';
    }
}
