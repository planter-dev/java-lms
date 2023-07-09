package nextstep.courses.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private final Long id;
    private String title;
    private Long creatorId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Cardinal> cardinals = new ArrayList<>();

    public Course(Long id, String title, Long creatorId, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.creatorId = creatorId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public void addCardinal(Cardinal cardinal) {
        cardinal.setCourseId(id);
        cardinals.add(cardinal);
    }

    public int cardinalCount() {
        return cardinals.size();
    }
    public String getTitle() {
        return title;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Cardinal> getCardinals() {
        return cardinals;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", creatorId=" + creatorId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
