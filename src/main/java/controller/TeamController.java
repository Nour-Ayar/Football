@RestController
@RequestMapping(&quot;/api/teams&quot;)
public class TeamController {
@Autowired
private TeamService teamService;
@GetMapping
public ResponseEntity&lt;Page&lt;Team&gt;&gt; getTeams(
@RequestParam(defaultValue = &quot;0&quot;) int page,

@RequestParam(defaultValue = &quot;10&quot;) int size,
@RequestParam(defaultValue = &quot;name&quot;) String sortBy) {
Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
return ResponseEntity.ok(teamService.getTeams(pageable));
}
@PostMapping
public ResponseEntity&lt;Team&gt; addTeam(@RequestBody Team team) {
return ResponseEntity.ok(teamService.addTeam(team));
}
}