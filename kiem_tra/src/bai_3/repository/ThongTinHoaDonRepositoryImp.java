package bai_3.repository;

import bai_3.modules.ThongTinHoaDon;
import bai_3.utils.ReadAndWriteHoaDon;

import java.util.List;

public class ThongTinHoaDonRepositoryImp implements ThongTinHoaDonRepository {

    @Override
    public void add(ThongTinHoaDon thongTinHoaDon) {
        ReadAndWriteHoaDon.writeFile(thongTinHoaDon);
    }

    @Override
    public List<ThongTinHoaDon> display() {
        List<ThongTinHoaDon> tinHoaDonList = ReadAndWriteHoaDon.readFile();
        return tinHoaDonList;
    }
}
