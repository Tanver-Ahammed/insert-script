package entities;

import java.time.LocalDateTime;

public class Attendance {

    private long participantId;
    private long sessionId;
    private String attendanceType;
    private LocalDateTime attendanceMarkedAt;

    public Attendance(long participantId, long sessionId) {
        this.participantId = participantId;
        this.sessionId = sessionId;
        this.attendanceType = "PHYSICAL";
        this.attendanceMarkedAt = LocalDateTime.now();
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

    public String getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(String attendanceType) {
        this.attendanceType = attendanceType;
    }

    public LocalDateTime getAttendanceMarkedAt() {
        return attendanceMarkedAt;
    }

    public void setAttendanceMarkedAt(LocalDateTime attendanceMarkedAt) {
        this.attendanceMarkedAt = attendanceMarkedAt;
    }
}
