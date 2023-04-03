package case_study_module02.repository.facility_repo;

import case_study_module02.models.Room;

import java.util.LinkedHashMap;

public interface RoomRepo {
    LinkedHashMap<Room,Integer> displayListRoom();

    void addNewRoom(LinkedHashMap<Room,Integer> linkedHashMap);

    void editRoom(LinkedHashMap<Room,Integer> linkedHashMap);

    LinkedHashMap<Room,Integer> displayListRoomMaintenance();
}
