@SpringBootTest
public class TeamServiceTest {
@Autowired
private TeamService teamService;
@Test
public void testAddTeam() {
Team team = new Team();
team.setName(&quot;OGC Nice&quot;);
team.setAcronym(&quot;OGCN&quot;);
team.setBudget(10000000);
Team savedTeam = teamService.addTeam(team);
assertNotNull(savedTeam.getId());
}
}