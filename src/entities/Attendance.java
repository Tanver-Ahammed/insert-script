package entities;

public class Attendance {

    private long participantId;
    private long sessionId;

    public Attendance(long participantId, long sessionId) {
        this.participantId = participantId;
        this.sessionId = sessionId;
    }

    public long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(long participantId) {
        this.participantId = participantId;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }
}
