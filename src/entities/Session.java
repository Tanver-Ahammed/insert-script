package entities;

import constants.Status;
import constants.Type;

import java.time.LocalDate;
import java.time.LocalTime;

public class Session {

    private Long id;

    private String title;

    private String speaker;

    private String organizer;

    private Status status;

    private Type type;

    private LocalDate date;

    private LocalTime startTime;

    private LocalTime endTime;

    private Long creatorId;

    private Long physicalLocationId;

    private Long onlineSessionInfoId;

    public Session() {
    }

    public Session(Long id, String title, String speaker, String organizer, Status status, Type type, LocalDate date, LocalTime startTime, LocalTime endTime, Long creatorId, Long physicalLocationId, Long onlineSessionInfoId) {
        this.id = id;
        this.title = title;
        this.speaker = speaker;
        this.organizer = organizer;
        this.status = status;
        this.type = type;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.creatorId = creatorId;
        this.physicalLocationId = physicalLocationId;
        this.onlineSessionInfoId = onlineSessionInfoId;
    }

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

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getPhysicalLocationId() {
        return physicalLocationId;
    }

    public void setPhysicalLocationId(Long physicalLocationId) {
        this.physicalLocationId = physicalLocationId;
    }

    public Long getOnlineSessionInfoId() {
        return onlineSessionInfoId;
    }

    public void setOnlineSessionInfoId(Long onlineSessionInfoId) {
        this.onlineSessionInfoId = onlineSessionInfoId;
    }
}
