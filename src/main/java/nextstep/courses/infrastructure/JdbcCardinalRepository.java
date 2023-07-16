package nextstep.courses.infrastructure;

import nextstep.courses.domain.Cardinal;
import nextstep.courses.repository.CardinalRepository;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository("cardinalRepository")
public class JdbcCardinalRepository implements CardinalRepository {
    private JdbcOperations jdbcTemplate;

    public JdbcCardinalRepository(JdbcOperations jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public int save(Cardinal cardinal) {
        String sql = "insert into cardinal (cource_id) values(?)";
        return jdbcTemplate.update(sql, cardinal.getCourseId());
    }
}
