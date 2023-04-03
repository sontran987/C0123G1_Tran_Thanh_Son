package case_study_module02.repository.facility_repo;

import case_study_module02.models.Room;
import case_study_module02.untils.ReadAndWriteFileRoom;

import java.util.LinkedHashMap;

public class RoomRepoImpl implements RoomRepo {
    static final String PATH_FILE_ROOM = "src\\case_study_module02\\data\\room.csv";
    LinkedHashMap<Room, Integer> linkedHashMap = ReadAndWriteFileRoom.readedFileRoom(PATH_FILE_ROOM);

    @Override
    public LinkedHashMap<Room, Integer> displayListRoom() {
        return linkedHashMap;
    }

    @Override
    public void addNewRoom(LinkedHashMap<Room, Integer> linkedHashMap) {
        ReadAndWriteFileRoom.writeFileRoom( PATH_FILE_ROOM,linkedHashMap);
    }

    @Override
    public void editRoom(LinkedHashMap<Room,Integer> linkedHashMap1) {
        ReadAndWriteFileRoom.writeFileRoom( PATH_FILE_ROOM,linkedHashMap1);
    }

    @Override
    public LinkedHashMap<Room, Integer> displayListRoomMaintenance() {
        return linkedHashMap;
    }
}
