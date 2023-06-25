package nextstep.courses.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static nextstep.courses.domain.SessionTest.tDDJavaSession;
import static nextstep.users.domain.NsUserTest.JAVAJIGI;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CardinalTest {

    @Test
    @DisplayName("강의의 모집 정원이 초과했을 때 익셉션을 반환한다.")
    public void isOverMaxStudent() throws CannotEnrollException {
        tDDJavaSession.changeStatue(Status.RECRUITING);
        Cardinal cardinal = new Cardinal(1L, tDDJavaSession, new Students(2));
        cardinal.enroll(new Student(1L, JAVAJIGI));
        cardinal.enroll(new Student(2L, JAVAJIGI));
        assertThatThrownBy(() -> cardinal.enroll(new Student(3L, JAVAJIGI)))
                .isInstanceOf(CannotEnrollException.class)
                .hasMessageContaining("수강 신청 최대 인원을 초과했습니다.");

    }
}
