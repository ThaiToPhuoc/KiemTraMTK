/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author tophu
 */
public class main {
    public static void main(String[] args) {
        Muahang store = new Muahang();
        Thanhvien Thai = new Thanhvien(0, 0);
        
        ArrayList<product> list = new ArrayList<>();
        
        list.add(new product("USB", 100000, 10));
        list.add(new product("Laptop", 10000000, 1));
        list.add(new product("RAM", 200000, 10));
        
        store.themdanhsachhang(list);
        Thai.Dangkymua(store);
        
        System.out.println("Khách hàng Thái đã mua: \n");
        Thai.hienthidshang();
        store.tinhTienMuaHang();
        store.tinhdiemthanhvien();
        store.insotienquachietkhau();
        
        Thanhvien Dung = new Thanhvien(0, 0);
        
        ArrayList<product> list1 = new ArrayList<>();
        
        list1.add(new product("CPU", 1500000, 10));
        list1.add(new product("PC", 15000000, 2));
        
        store.themdanhsachhang(list1);
        Dung.Dangkymua(store);
        
        System.out.println("Khách hàng Dũng đã mua: \n");
        Dung.hienthidshang();
        
        store.tinhTienMuaHang();
        store.tinhdiemthanhvien();
        store.insotienquachietkhau();
    }
}
