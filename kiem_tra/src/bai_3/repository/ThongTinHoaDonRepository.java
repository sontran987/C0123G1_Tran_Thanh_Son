package bai_3.repository;

import bai_3.modules.ThongTinHoaDon;

import java.util.List;

public interface ThongTinHoaDonRepository {
    void add(ThongTinHoaDon thongTinHoaDon);

    List<ThongTinHoaDon> display();
}
