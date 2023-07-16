package nextstep.courses.infrastructure;

import nextstep.courses.repository.SessionInfoRepository;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository("sessionRepository")
public class JdbcSessionInfoRepository implements SessionInfoRepository {
    private JdbcOperations jdbcTemplate;

    public JdbcSessionInfoRepository(JdbcOperations jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
