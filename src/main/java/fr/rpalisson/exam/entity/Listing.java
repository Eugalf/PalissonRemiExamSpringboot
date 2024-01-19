package fr.rpalisson.exam.entity;

import fr.rpalisson.exam.entity.interfaces.SluggerInterface;
import fr.rpalisson.exam.utils.Slugger;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Listing implements SluggerInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private Model model;

    private String description;

    private int producedYear;

    private Long mileage;

    private Double price;

    @CreationTimestamp
    private Date createdAt;

    private String image;

    @ManyToOne
    private User user;

    private String slug;

    @Override
    public String getField() {
        return null;
    }
    //= Slugger.slugify("vente-")+model.getBrand().getName()+"-"+model.getName()+"-"+producedYear+"-"+mileage
}