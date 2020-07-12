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
public class Muahang {
     Muahang_observer observer;
     ArrayList<product> list = new ArrayList<>();
     
     public void themdanhsachhang(ArrayList<product> list)
    {
        this.list = list;
    }

    public ArrayList<product> getList() {
        return list;
    }
     
     
     
      public Muahang() {
    }
    
    public void laythongtinthanhvien(Muahang_observer observer){
        this.observer = observer;
    }
    
    public void tinhTienMuaHang()
    {
        System.out.println("Tổng tiền mua hàng: " + (int)observer.tinhtien());
    }
    
    public void insotienquachietkhau()
    {
        System.out.println("\n Tổng tiền mua hàng sau chiết khấu: " + (int)observer.tinhtienduocchietkhau());
    }
    
    public void tinhdiemthanhvien()
    {
        System.out.println("Số điểm của thành viên: " + observer.tinhdiem());
        if(observer.tinhdiem() > 1000)
            System.out.println("\n Khách hàng thân thiết! ");
    }
     
    public static interface Muahang_observer{
        public float tinhtien();
        public float tinhtienduocchietkhau();
        public float tinhdiem();
    }
}
