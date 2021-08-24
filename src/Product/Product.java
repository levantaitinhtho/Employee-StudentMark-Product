package Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String MaHH;
    private String NameHH;
    private int sLuong;
    private float gia;

    public Product() {
    }

    public Product(String maHH, String nameHH, int sLuong, float gia) {
        MaHH = maHH;
        NameHH = nameHH;
        this.sLuong = sLuong;
        this.gia = gia;
    }

    public String getMaHH() {
        return MaHH;
    }

    public void setMaHH(String maHH) {
        MaHH = maHH;
    }

    public String getNameHH() {
        return NameHH;
    }

    public void setNameHH(String nameHH) {
        NameHH = nameHH;
    }

    public int getsLuong() {
        return sLuong;
    }

    public void setsLuong(int sLuong) {
        this.sLuong = sLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    public void getInfo(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Ma HH: ");
        MaHH = input.nextLine();
        System.out.println("Enter NameHH: ");
        NameHH = input.nextLine();
        System.out.println("Enter Sluong: ");
        sLuong = Integer.parseInt(input.nextLine());
        System.out.println("Gia: ");
        gia = Float.parseFloat(input.nextLine());
    }
    public void show(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "MaHH='" + MaHH + '\'' +
                ", NameHH='" + NameHH + '\'' +
                ", sLuong=" + sLuong +
                ", gia=" + gia +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter n");
        n = Integer.parseInt(sc.nextLine());

        Product[] products = new Product[n];
        for(int i=0;i<n;i++){
            products[i]=new Product();
            products[i].getInfo();
        }

        int indexMax=0;
        for(int i=1;i<n;i++){
            if(products[i].getGia()>products[indexMax].getGia()){
                indexMax=i;
            }
        }
        products[indexMax].show();
    }
}
