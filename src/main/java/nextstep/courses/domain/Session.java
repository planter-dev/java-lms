package nextstep.courses.domain;

import nextstep.courses.exception.CannotEnrollException;

import java.time.LocalDateTime;

public class Session {
    private final Long id;
    private Status status = Status.WAITING;
    private Price price;
    private Long creatorId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void checkAbleSession() throws CannotEnrollException {
        this.status.confirmRecruiting();
    }
    public void changeStatue(Status status) {
        this.status = status;
    }

    public Session(Long id, Status status, Price price, Long creatorId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.status = status;
        this.price = price;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
