@Service
public class TeamService {
@Autowired
private TeamRepository teamRepository;
public Page&lt;Team&gt; getTeams(Pageable pageable) {
return teamRepository.findAll(pageable);
}
public Team addTeam(Team team) {
return teamRepository.save(team);
}
}