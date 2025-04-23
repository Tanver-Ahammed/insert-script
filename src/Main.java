import constants.Status;
import constants.Type;
import entities.*;
import insert.InsertData;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        InsertData insertData = new InsertData();

        List<Participant> participants = new ArrayList<>();

        participants.add(new Participant(1L, "John", "Doe", "Software Engineer", "john.doe@example.com", "+1234567890", "https://example.com/images/john.jpg"));
        participants.add(new Participant(2L, "Jane", "Smith", "Product Manager", "jane.smith@example.com", "+1987654321", "https://example.com/images/jane.jpg"));
        participants.add(new Participant(3L, "Robert", "Brown", "Data Scientist", "robert.brown@example.com", "+1122334455", "https://example.com/images/robert.jpg"));
        participants.add(new Participant(4L, "Alice", "Johnson", "UX Designer", "alice.johnson@example.com", "+1222333444", "https://example.com/images/alice.jpg"));
        participants.add(new Participant(5L, "Michael", "Lee", "DevOps Engineer", "michael.lee@example.com", "+1333444555", "https://example.com/images/michael.jpg"));
        participants.add(new Participant(6L, "Emily", "Davis", "QA Engineer", "emily.davis@example.com", "+1444555666", "https://example.com/images/emily.jpg"));
        participants.add(new Participant(7L, "David", "Martinez", "Frontend Developer", "david.martinez@example.com", "+1555666777", "https://example.com/images/david.jpg"));
        participants.add(new Participant(8L, "Sophia", "Hernandez", "Backend Developer", "sophia.hernandez@example.com", "+1666777888", "https://example.com/images/sophia.jpg"));
        participants.add(new Participant(9L, "Daniel", "Garcia", "Project Manager", "daniel.garcia@example.com", "+1777888999", "https://example.com/images/daniel.jpg"));
        participants.add(new Participant(10L, "Isabella", "Wilson", "Software Architect", "isabella.wilson@example.com", "+1888999000", "https://example.com/images/isabella.jpg"));
        participants.add(new Participant(11L, "James", "Moore", "Full Stack Developer", "james.moore@example.com", "+1999000111", "https://example.com/images/james.jpg"));
        participants.add(new Participant(12L, "Olivia", "Taylor", "Marketing Specialist", "olivia.taylor@example.com", "+2000111222", "https://example.com/images/olivia.jpg"));
        participants.add(new Participant(13L, "William", "Anderson", "HR Manager", "william.anderson@example.com", "+2111222333", "https://example.com/images/william.jpg"));
        participants.add(new Participant(14L, "Ava", "Thomas", "Data Analyst", "ava.thomas@example.com", "+2222333444", "https://example.com/images/ava.jpg"));
        participants.add(new Participant(15L, "Ethan", "Jackson", "Network Administrator", "ethan.jackson@example.com", "+2333444555", "https://example.com/images/ethan.jpg"));
        participants.add(new Participant(16L, "Mia", "White", "Sales Executive", "mia.white@example.com", "+2444555666", "https://example.com/images/mia.jpg"));
        participants.add(new Participant(17L, "Alexander", "Harris", "IT Support", "alexander.harris@example.com", "+2555666777", "https://example.com/images/alexander.jpg"));
        participants.add(new Participant(18L, "Charlotte", "Clark", "Content Strategist", "charlotte.clark@example.com", "+2666777888", "https://example.com/images/charlotte.jpg"));
        participants.add(new Participant(19L, "Henry", "Lewis", "Chief Technology Officer", "henry.lewis@example.com", "+2777888999", "https://example.com/images/henry.jpg"));
        participants.add(new Participant(20L, "Amelia", "Young", "Business Analyst", "amelia.young@example.com", "+2888999000", "https://example.com/images/amelia.jpg"));
        participants.add(new Participant(21L, "Sebastian", "Walker", "Database Administrator", "sebastian.walker@example.com", "+2999000111", "https://example.com/images/sebastian.jpg"));
        participants.add(new Participant(22L, "Lucas", "Allen", "Cloud Engineer", "lucas.allen@example.com", "+3000111222", "https://example.com/images/lucas.jpg"));
        participants.add(new Participant(23L, "Zoe", "King", "Operations Manager", "zoe.king@example.com", "+3111222333", "https://example.com/images/zoe.jpg"));
        participants.add(new Participant(24L, "Jack", "Scott", "Product Designer", "jack.scott@example.com", "+3222333444", "https://example.com/images/jack.jpg"));
        participants.add(new Participant(25L, "Grace", "Adams", "Chief Marketing Officer", "grace.adams@example.com", "+3333444555", "https://example.com/images/grace.jpg"));
        participants.add(new Participant(26L, "Samuel", "Rodriguez", "Product Owner", "samuel.rodriguez@example.com", "+1234567899", "https://example.com/images/samuel.jpg"));
        participants.add(new Participant(27L, "Victoria", "Martinez", "Cloud Architect", "victoria.martinez@example.com", "+1987654322", "https://example.com/images/victoria.jpg"));
        participants.add(new Participant(28L, "Benjamin", "Garcia", "AI Specialist", "benjamin.garcia@example.com", "+1122334466", "https://example.com/images/benjamin.jpg"));
        participants.add(new Participant(29L, "Lily", "Lopez", "Customer Success Manager", "lily.lopez@example.com", "+1222333445", "https://example.com/images/lily.jpg"));
        participants.add(new Participant(30L, "Daniel", "Scott", "Software Developer", "daniel.scott@example.com", "+1333444556", "https://example.com/images/daniel_scott.jpg"));
        participants.add(new Participant(31L, "Sophia", "Gonzalez", "Operations Coordinator", "sophia.gonzalez@example.com", "+1444555667", "https://example.com/images/sophia_gonzalez.jpg"));
        participants.add(new Participant(32L, "Lucas", "Perez", "DevOps Specialist", "lucas.perez@example.com", "+1555666778", "https://example.com/images/lucas_perez.jpg"));
        participants.add(new Participant(33L, "Olivia", "Garcia", "UI/UX Designer", "olivia.garcia@example.com", "+1666777889", "https://example.com/images/olivia_garcia.jpg"));
        participants.add(new Participant(34L, "Ethan", "Wilson", "Systems Administrator", "ethan.wilson@example.com", "+1777888990", "https://example.com/images/ethan_wilson.jpg"));
        participants.add(new Participant(35L, "Emily", "Brown", "Technical Lead", "emily.brown@example.com", "+1888999001", "https://example.com/images/emily_brown.jpg"));
        participants.add(new Participant(36L, "John", "Miller", "Database Engineer", "john.miller@example.com", "+1999000112", "https://example.com/images/john_miller.jpg"));
        participants.add(new Participant(37L, "Grace", "Taylor", "Solutions Architect", "grace.taylor@example.com", "+2000111233", "https://example.com/images/grace_taylor.jpg"));
        participants.add(new Participant(38L, "Alexander", "Anderson", "Security Analyst", "alexander.anderson@example.com", "+2111222344", "https://example.com/images/alexander_anderson.jpg"));
        participants.add(new Participant(39L, "Mia", "Rodriguez", "Business Development Manager", "mia.rodriguez@example.com", "+2222334455", "https://example.com/images/mia_rodriguez.jpg"));
        participants.add(new Participant(40L, "Oliver", "Martinez", "Cloud Consultant", "oliver.martinez@example.com", "+2333445566", "https://example.com/images/oliver_martinez.jpg"));
        participants.add(new Participant(41L, "Chloe", "Lopez", "Web Developer", "chloe.lopez@example.com", "+2444556677", "https://example.com/images/chloe_lopez.jpg"));
        participants.add(new Participant(42L, "James", "Wilson", "Business Analyst", "james.wilson@example.com", "+2555667788", "https://example.com/images/james_wilson.jpg"));
        participants.add(new Participant(43L, "Ella", "Miller", "Chief Executive Officer", "ella.miller@example.com", "+2666778899", "https://example.com/images/ella_miller.jpg"));
        participants.add(new Participant(44L, "Henry", "Smith", "Full Stack Engineer", "henry.smith@example.com", "+2777889000", "https://example.com/images/henry_smith.jpg"));
        participants.add(new Participant(45L, "Amelia", "White", "Digital Marketing Specialist", "amelia.white@example.com", "+2888999111", "https://example.com/images/amelia_white.jpg"));
        participants.add(new Participant(46L, "Sebastian", "Brown", "Mobile Developer", "sebastian.brown@example.com", "+2999000222", "https://example.com/images/sebastian_brown.jpg"));
        participants.add(new Participant(47L, "Jack", "Davis", "Content Writer", "jack.davis@example.com", "+3000112333", "https://example.com/images/jack_davis.jpg"));
        participants.add(new Participant(48L, "Lucas", "Johnson", "Infrastructure Manager", "lucas.johnson@example.com", "+3111223444", "https://example.com/images/lucas_johnson.jpg"));
        participants.add(new Participant(49L, "Avery", "Taylor", "Legal Advisor", "avery.taylor@example.com", "+3222334555", "https://example.com/images/avery_taylor.jpg"));
        participants.add(new Participant(50L, "Nora", "Clark", "Compliance Officer", "nora.clark@example.com", "+3333445666", "https://example.com/images/nora_clark.jpg"));

        insertData.insertParticipant(participants);
        for (Participant participant : participants) {
            System.out.println(participant);
        }

        List<OnlineSessionInfo> onlineSessionInfos = new ArrayList<>();

        onlineSessionInfos.add(new OnlineSessionInfo(1L, "https://zoom.us/j/123456789", "123456789", "pass1234"));
        onlineSessionInfos.add(new OnlineSessionInfo(2L, "https://zoom.us/j/987654321", "987654321", "password2025"));
        onlineSessionInfos.add(new OnlineSessionInfo(3L, "https://teams.microsoft.com/l/meetup-join/19%3ameeting_MTk4ZTgwYzgtYzI1MS00ZWM1LTg1YzgtM2FkOTFkZDhlM2Zm%40thread.v2/0?context=%7b%22Tid%22%3a%22your_tid%22%2c%22Oid%22%3a%22your_oid%22%7d", "20211234", "teamspass"));
        onlineSessionInfos.add(new OnlineSessionInfo(4L, "https://meet.google.com/abc-defg-hij", "abc-defg-hij", "googlemeet123"));
        onlineSessionInfos.add(new OnlineSessionInfo(5L, "https://zoom.us/j/1122334455", "1122334455", "zoom2023"));
        onlineSessionInfos.add(new OnlineSessionInfo(6L, "https://teams.microsoft.com/l/meetup-join/19%3ameeting_ZWUwNzFiNmUtMGRmYy00ZTgyLWIwZjUtMGMyYzgwZDQ4MTk0%40thread.v2/0?context=%7b%22Tid%22%3a%22your_tid%22%2c%22Oid%22%3a%22your_oid%22%7d", "344455667", "msftteams567"));
        onlineSessionInfos.add(new OnlineSessionInfo(7L, "https://meet.google.com/jkl-mnop-qrt", "jkl-mnop-qrt", "securemeet789"));
        onlineSessionInfos.add(new OnlineSessionInfo(8L, "https://zoom.us/j/6655443322", "6655443322", "conf2025"));
        onlineSessionInfos.add(new OnlineSessionInfo(9L, "https://teams.microsoft.com/l/meetup-join/19%3ameeting_YzI5ZjA1ZTktYmNmYi00ZjZjLTk0ZmMtMGU3ZDUzNmFkOGEy%40thread.v2/0?context=%7b%22Tid%22%3a%22your_tid%22%2c%22Oid%22%3a%22your_oid%22%7d", "5566778899", "passwordsecure"));
        onlineSessionInfos.add(new OnlineSessionInfo(10L, "https://meet.google.com/pqr-stuv-wxy", "pqr-stuv-wxy", "meet2023"));

        insertData.insertOnlineSessionInfo(onlineSessionInfos);
        for (OnlineSessionInfo session : onlineSessionInfos) {
            System.out.println(session);
        }

        List<PhysicalLocation> locations = new ArrayList<>();

        locations.add(new PhysicalLocation(1L, "Downtown", "Main Street", "Building A", "5th", "501"));
        locations.add(new PhysicalLocation(2L, "Uptown", "Highway 7", "Building B", "3rd", "303"));
        locations.add(new PhysicalLocation(3L, "City Center", "Broadway", "Building C", "2nd", "203"));
        locations.add(new PhysicalLocation(4L, "East Side", "Elm Street", "Building D", "1st", "102"));
        locations.add(new PhysicalLocation(5L, "West End", "Maple Avenue", "Building E", "4th", "401"));
        locations.add(new PhysicalLocation(6L, "North Hills", "Pine Road", "Building F", "5th", "505"));
        locations.add(new PhysicalLocation(7L, "South District", "River Road", "Building G", "6th", "602"));
        locations.add(new PhysicalLocation(8L, "Greenfield", "Oak Street", "Building H", "2nd", "207"));
        locations.add(new PhysicalLocation(9L, "Sunset Valley", "Mountain Drive", "Building I", "7th", "702"));
        locations.add(new PhysicalLocation(10L, "Silver Lake", "Lakeview Road", "Building J", "3rd", "305"));

        insertData.insertPhysicalLocation(locations);

        for (PhysicalLocation location : locations) {
            System.out.println(location);
        }

        List<Session> sessions = new ArrayList<>();

        sessions.add(new Session(1L, "AI and the Future", "Dr. John Doe", "Tech Innovations", Status.NEW, Type.ONLINE, LocalDate.of(2025, 6, 15), LocalTime.of(10, 0), LocalTime.of(12, 0), 1L, 1L, 1L));
        sessions.add(new Session(2L, "Blockchain Basics", "Alice Smith", "Blockchain Experts", Status.NEW, Type.ONLINE, LocalDate.of(2025, 6, 16), LocalTime.of(13, 0), LocalTime.of(15, 0), 2L, 2L, 2L));
        sessions.add(new Session(3L, "Cybersecurity Trends", "Mark Johnson", "CyberSecure Ltd.", Status.NEW, Type.ONLINE, LocalDate.of(2025, 6, 17), LocalTime.of(9, 0), LocalTime.of(11, 0), 3L, 3L, 3L));
        sessions.add(new Session(4L, "Digital Marketing", "Sara Williams", "Marketing Pro", Status.ENDED, Type.ONLINE, LocalDate.of(2025, 6, 18), LocalTime.of(11, 0), LocalTime.of(13, 0), 10L, 4L, 4L));
        sessions.add(new Session(5L, "Cloud Computing", "Tom Brown", "CloudTech Solutions", Status.ONGOING, Type.PHYSICAL, LocalDate.of(2025, 6, 19), LocalTime.of(14, 0), LocalTime.of(16, 0), 15L, 5L, 5L));
        sessions.add(new Session(6L, "Machine Learning 101", "Jessica Davis", "AI Corp.", Status.ONGOING, Type.PHYSICAL, LocalDate.of(2025, 6, 20), LocalTime.of(9, 30), LocalTime.of(11, 30), 6L, 6L, 6L));
        sessions.add(new Session(7L, "Data Science for Beginners", "Michael Lee", "DataX Labs", Status.NEW, Type.ONLINE, LocalDate.of(2025, 6, 21), LocalTime.of(13, 30), LocalTime.of(15, 30), 7L, 7L, 7L));
        sessions.add(new Session(8L, "Tech Innovations in Healthcare", "Emma Harris", "MedTech Conference", Status.ONGOING, Type.ONLINE, LocalDate.of(2025, 6, 22), LocalTime.of(10, 0), LocalTime.of(12, 0), 4L, 8L, 8L));
        sessions.add(new Session(9L, "Ethical Hacking", "Robert Clark", "HackSecure", Status.NEW, Type.ONLINE, LocalDate.of(2025, 6, 23), LocalTime.of(15, 0), LocalTime.of(17, 0), 19L, 9L, 9L));
        sessions.add(new Session(10L, "Introduction to Quantum Computing", "Sophia Martinez", "Quantum Future", Status.NEW, Type.ONLINE, LocalDate.of(2025, 6, 24), LocalTime.of(9, 0), LocalTime.of(11, 0), 17L, 6L, 10L));

        insertData.insertSession(sessions);
        for (Session session : sessions) {
            System.out.println(session);
        }

        // it depends on many to many relationship
        Random rand = new Random();
        for (int participantId = 1; participantId <= 10; participantId++) {
            for (int sessionId = 1; sessionId <= 10; sessionId++) {
//                if (rand.nextBoolean())
//                    continue;
                Attendance ps = new Attendance(participantId, sessionId);
                insertData.insertAttendance(ps);
            }
        }

    }
}