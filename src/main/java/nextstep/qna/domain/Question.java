package nextstep.qna.domain;

import java.time.LocalDateTime;

public class Question {
    private Long id;

    private String title;

    private String contents;

    private Long writerId;

    private boolean deleted = false;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    public Question() {
    }

    public Question(Long id, String title, String contents, Long writerId, boolean deleted, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.writerId = writerId;
        this.deleted = deleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Long getWriterId() {
        return writerId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

//    private void checkEnableDeleteQuestion(NsUser loginUser) throws CannotDeleteException {
//        if(!this.isOwner(loginUser)) {
//            throw new CannotDeleteException("질문을 삭제할 권한이 없습니다.");
//        }
//    }
//    public List<DeleteHistory> deleteQuestion(NsUser loginUser) throws CannotDeleteException {
//        List<DeleteHistory> deleteHistories = new ArrayList<>(List.of(new DeleteHistory(this)));
//                this.checkEnableDeleteQuestion(loginUser);
//        if(getAnswers().hasAnswers()) {
//            deleteHistories.addAll(getAnswers().deleteAnswers(loginUser));
//
//        }
//        this.deleted();
//        return deleteHistories;
//    }

    private void deleted() {
        this.deleted = true;
    }
}
