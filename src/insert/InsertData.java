package insert;

import db.DBConnection;
import entities.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class InsertData {

    public void insertParticipant(List<Participant> participants) throws SQLException {
        String sql = "INSERT INTO participant (participant_id, first_name, last_name, designation, email, phone_number, image_url) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);

        for (Participant participant : participants) {
            stmt.setLong(1, participant.getId());
            stmt.setString(2, participant.getFirstName());
            stmt.setString(3, participant.getLastName());
            stmt.setString(4, participant.getDesignation());
            stmt.setString(5, participant.getEmail());
            stmt.setString(6, participant.getPhoneNumber());
            stmt.setString(7, participant.getImageUrl());
            stmt.executeUpdate();
        }
        stmt.executeBatch();
        stmt.close();
        conn.close();
    }

    public void insertOnlineSessionInfo(List<OnlineSessionInfo> onlineSessionInfos) throws SQLException {
        String sql = "INSERT INTO online_session_info (online_session_info_id, meeting_id, meeting_url, password) " +
                "VALUES (?, ?, ?, ?)";

        Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);

        for (OnlineSessionInfo session : onlineSessionInfos) {
            stmt.setLong(1, session.getId());
            stmt.setString(2, session.getMeetingId());
            stmt.setString(3, session.getMeetingUrl());
            stmt.setString(4, session.getPassword());
            stmt.addBatch();
        }
        stmt.executeBatch();
        stmt.close();
        conn.close();
    }

    public void insertPhysicalLocation(List<PhysicalLocation> physicalLocations) throws SQLException {
        String sql = "INSERT INTO physical_location (physical_location_id, area, road, building, floor, room)" +
                "VALUES (?, ?, ?, ?, ?, ?)";
        Connection con = DBConnection.getConnection();
        PreparedStatement stmt = con.prepareStatement(sql);
        for (PhysicalLocation physicalLocation : physicalLocations) {
            stmt.setLong(1, physicalLocation.getId());
            stmt.setString(2, physicalLocation.getArea());
            stmt.setString(3, physicalLocation.getRoad());
            stmt.setString(4, physicalLocation.getBuilding());
            stmt.setString(5, physicalLocation.getFloor());
            stmt.setString(6, physicalLocation.getRoom());
            stmt.addBatch();
        }
        stmt.executeBatch();
        stmt.close();
        con.close();
    }

    public void insertSession(List<Session> sessions) throws SQLException {
        String sql = "INSERT INTO session (session_id, title, speaker, organizer, status, type, date, start_time, end_time, " +
                "creator_id, physical_location_id, online_session_info_id)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        for (Session session : sessions) {
            stmt.setLong(1, session.getId());
            stmt.setString(2, session.getTitle());
            stmt.setString(3, session.getSpeaker());
            stmt.setString(4, session.getOrganizer());
            stmt.setString(5, session.getStatus().toString());
            stmt.setString(6, session.getType().toString());
            stmt.setDate(7, java.sql.Date.valueOf(session.getDate()));
            stmt.setTime(8, java.sql.Time.valueOf(session.getStartTime()));
            stmt.setTime(9, java.sql.Time.valueOf(session.getEndTime()));
            stmt.setLong(10, session.getCreatorId());
            stmt.setLong(11, session.getPhysicalLocationId());
            stmt.setLong(12, session.getOnlineSessionInfoId());
            stmt.addBatch();
        }
        stmt.executeBatch();
        stmt.close();
        conn.close();
    }

    public void insertAttendance(Attendance attendance) throws SQLException {
        String sql = "INSERT INTO attendance (participant_id, session_id, attendance_type, attendance_marked_at)" +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setLong(1, attendance.getParticipantId());
            stmt.setLong(2, attendance.getSessionId());
            stmt.setString(3, attendance.getAttendanceType());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(attendance.getAttendanceMarkedAt()));
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert stmt != null;
        stmt.close();
        conn.close();
    }

}
