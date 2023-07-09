package nextstep.courses.domain;

import java.time.LocalDateTime;

public class Session {
    private final Long id;
    private final Long cardinalId;
    private Status status = Status.WAITING;
    private Price price;
    private SessionInfo sessionInfo;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private Long creatorId;

    public void checkAbleSession() throws CannotEnrollException {
        this.status.confirmRecruiting();
    }
    public void changeStatue(Status status) {
        this.status = status;
    }

    public Session(Long id,
                   Long cardinalId,
                   Status status,
                   SessionInfo sessionInfo,
                   LocalDateTime startedAt,
                   LocalDateTime endedAt) {
        this.id = id;
        this.cardinalId = cardinalId;
        this.status = status;
        this.sessionInfo = sessionInfo;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
    }
}
