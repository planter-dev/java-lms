package nextstep.courses.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class CourseTest {

    Session TDDJavaSession = new Session(1L,1L,
            Status.RECRUITING,
            new SessionInfo("JAVA_TDD", "image_url"),
            LocalDateTime.now(),
            LocalDateTime.now());
    Session TDDReactSession = new Session(2L,1L,
            Status.RECRUITING,
            new SessionInfo("REACT_TDD", "image_url"),
            LocalDateTime.now(),
            LocalDateTime.now());
    @Test
    @DisplayName("한개의 코스는 여러가지 세션을 가질 수 있다.")
    public void addSessions() {
        Course course = new Course(1L, "자바", 1L, LocalDateTime.now(), LocalDateTime.now());
        course.addCardinal(new Cardinal(1L, TDDJavaSession, new Students(2)));
        course.addCardinal(new Cardinal(1L, TDDJavaSession, new Students(2)));
        Assertions.assertThat(course.cardinalCount()).isEqualTo(2);
    }



}
