@RestController
@RequestMapping("/api/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping
    public ResponseEntity<Page<Team>> getTeams(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name") String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return ResponseEntity.ok(teamService.getTeams(pageable));
    }

    @PostMapping
    public ResponseEntity<Team> addTeam(@RequestBody Team team) {
        return ResponseEntity.ok(teamService.addTeam(team));
    }
}