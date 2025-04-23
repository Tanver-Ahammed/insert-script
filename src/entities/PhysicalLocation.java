package entities;

import java.util.List;

public class PhysicalLocation {
    private Long id;
    private String area;
    private String road;
    private String building;
    private String floor;
    private String room;
    private List<Session> sessions;

    public PhysicalLocation(Long id, String area, String road, String building, String floor, String room) {
        this.id = id;
        this.area = area;
        this.road = road;
        this.building = building;
        this.floor = floor;
        this.room = room;
    }

    public PhysicalLocation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
