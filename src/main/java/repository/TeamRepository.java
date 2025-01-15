@Repository
public interface TeamRepository extends JpaRepository<Team, Long>,
JpaSpecificationExecutor<Team> {
}