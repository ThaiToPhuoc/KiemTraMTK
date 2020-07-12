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
public class Thanhvien implements Muahang.Muahang_observer{
    float diem , chietkhau;
    ArrayList<product> list = new ArrayList<>();
    
     public void Dangkymua(Muahang t){
        t.laythongtinthanhvien((Muahang.Muahang_observer) this);
        this.list = t.getList();
    }

    public Thanhvien(float diem, float chietkhau) {
        this.diem = diem;
        this.chietkhau = chietkhau;
    }
    
    public void hienthidshang()
    {
         for(product p: this.list)
        {
            System.out.println("Tên hàng: " + p.getTen() + ", giá: " + (int)p.getGia() + ", số lượng: " + p.getSoluong() + "\n");
        }
    }
    
    @Override
    public float tinhtien() {
        float thanhtien = 0;
        int i = 1;
        for(product p: this.list)
        {
            thanhtien += p.getGia()* p.getSoluong();
        }
        return thanhtien;
        
    }

    @Override
    public float tinhtienduocchietkhau() {
        if(tinhdiem() > 1000)
            this.chietkhau = (float) 0.03;
        return tinhtien() - tinhtien()*this.chietkhau;
    }

    @Override
    public float tinhdiem() {
         return tinhtien()/10000;
    }
}
