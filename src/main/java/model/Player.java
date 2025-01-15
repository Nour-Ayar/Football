@Entity
public class Player {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;

private String position;
@ManyToOne
@JoinColumn(name = &quot;team_id&quot;)
private Team team;
// Getters et Setters
}