package nextstep.courses.infrastructure;

import nextstep.courses.domain.Cardinal;
import nextstep.courses.domain.CardinalRepository;
import nextstep.courses.domain.Course;
import nextstep.courses.domain.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@JdbcTest
public class CourseRepositoryTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CourseRepositoryTest.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private CourseRepository courseRepository;
    private CardinalRepository cardinalRepository;

    @BeforeEach
    void setUp() {
        courseRepository = new JdbcCourseRepository(jdbcTemplate);
    }

    @Test
    void crud() {
        Course course = new Course(1L, "TDD, 클린 코드 with Java", 1L, LocalDateTime.now(), LocalDateTime.now());
        int count = courseRepository.save(course);
        assertThat(count).isEqualTo(1);
        Course savedCourse = courseRepository.findById(1L);
        assertThat(course.getTitle()).isEqualTo(savedCourse.getTitle());
        LOGGER.debug("Course: {}", savedCourse);
    }

    @Test
    @DisplayName("기수 더하기")
    void addCardinal() {
        Course course = new Course(1L, "TDD, 클린 코드 with Java", 2L, LocalDateTime.now(), LocalDateTime.now());
        Cardinal cardinal = new Cardinal(1L);
        course.addCardinal(cardinal);
        int count = courseRepository.save(course);
        assertThat(count).isEqualTo(1);
        Course savedCourse = courseRepository.findById(1L);
        List<Cardinal> cardinals = savedCourse.getCardinals();

    }
}
