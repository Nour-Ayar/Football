@Entity
public class Team {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String acronym;
private double budget;
@OneToMany(cascade = CascadeType.ALL, mappedBy = &quot;team&quot;)
private List<player> players;

}