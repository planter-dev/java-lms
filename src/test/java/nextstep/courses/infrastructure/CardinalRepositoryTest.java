package nextstep.courses.infrastructure;

import nextstep.courses.repository.CardinalRepository;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;

@JdbcTest
public class CardinalRepositoryTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CardinalRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private CardinalRepository cardinalRepository;

}
