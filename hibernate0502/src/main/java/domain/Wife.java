package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
@Getter@Setter@NoArgsConstructor@AllArgsConstructor
@Entity
@Table(name = "t_wife")
public class Wife implements Serializable {
    @Id
    @GenericGenerator(name="aaa",strategy = "uuid")
    @GeneratedValue(generator = "aaa")
    private String wid;
    private String wname;
    private Integer age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mid")
    private Man man;



}
