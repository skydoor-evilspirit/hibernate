package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name = "t_man")
public class Man implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mid;
    private String mname;
    private String role;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "man",fetch = FetchType.EAGER)
    private Set<Wife> wifes;




}
