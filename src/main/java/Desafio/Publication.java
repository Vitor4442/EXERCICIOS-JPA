package Desafio;

import jakarta.persistence.*;

import java.time.LocalDate;

@MappedSuperclass
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Version
    private int version;

    private LocalDate publishingData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDate getPublishingData() {
        return publishingData;
    }

    public void setPublishingData(LocalDate publishingData) {
        this.publishingData = publishingData;
    }
}
