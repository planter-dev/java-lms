package nextstep.qna.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class DeleteHistory {
    private Long id;

    private Long contentId;

    private String contentType;

    private Long deletedById;

    private LocalDateTime createdDate = LocalDateTime.now();

    public DeleteHistory() {
    }

    public DeleteHistory(Long id, Long contentId, String contentType, Long deletedById, LocalDateTime createdDate) {
        this.id = id;
        this.contentId = contentId;
        this.contentType = contentType;
        this.deletedById = deletedById;
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeleteHistory that = (DeleteHistory) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(contentId, that.contentId)) return false;
        return Objects.equals(contentType, that.contentType);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contentId != null ? contentId.hashCode() : 0);
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        return result;
    }
}
