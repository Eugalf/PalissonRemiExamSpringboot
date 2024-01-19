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
public class Brand implements SluggerInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String slug;

    //= Slugger.slugify(name)
    @Override
    public String getField() {
        return null;
    }
}