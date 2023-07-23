package nextstep.courses.domain;

public class Cardinal {
    private final Long id;
    private Long courseId;

    public Cardinal(Long id) {
        this.id = id;
    }

    public Cardinal(Long id, Long courseId) {
        this.id = id;
        this.courseId = courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCourseId() {
        return courseId;
    }

}
