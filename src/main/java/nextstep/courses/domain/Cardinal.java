package nextstep.courses.domain;

import nextstep.courses.exception.CannotEnrollException;

public class Cardinal {
    private final Long id;
    private Long courseId;
    private Session session;
    private Students students;


    public Cardinal(Long id) {
        this.id = id;
    }
    public Cardinal(Long id, Session session, Students students) {
        this.id = id;
        this.session = session;
        this.students = students;
    }

    public Cardinal(Long id, Long courseId, Session session, Students students) {
        this.id = id;
        this.courseId = courseId;
        this.session = session;
        this.students = students;
    }
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void enroll(Student student) throws CannotEnrollException {
        session.checkAbleSession();
        students.addStudent(student);
    }
}
