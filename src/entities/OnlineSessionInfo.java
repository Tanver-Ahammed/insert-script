package entities;


import java.util.List;

public class OnlineSessionInfo {
    private Long id;
    private String meetingUrl;
    private String meetingId;
    private String password;
    private List<Session> sessions;

    public OnlineSessionInfo() {
    }

    public OnlineSessionInfo(Long id, String meetingUrl, String meetingId, String password) {
        this.id = id;
        this.meetingUrl = meetingUrl;
        this.meetingId = meetingId;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeetingUrl() {
        return meetingUrl;
    }

    public void setMeetingUrl(String meetingUrl) {
        this.meetingUrl = meetingUrl;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}