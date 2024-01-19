package fr.rpalisson.exam.entity;

import fr.rpalisson.exam.entity.interfaces.SluggerInterface;
import fr.rpalisson.exam.utils.Slugger;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Model implements SluggerInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Brand brand;

    private String slug;

    @Override
    public String getField() {
        return null;
    }

    // = Slugger.slugify(name)
}