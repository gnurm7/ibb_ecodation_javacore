package com.gnurm7._1_part_javatypes;

public class _04_JavaWrapperTypes {
    public static void main(String[] args) {

        System.out.println("en küçük "+Math.min(-10,123));
        System.out.println("en büyük "+Math.max(-10,123));
        System.out.println("mutlak "+Math.abs(-7));//mutlak değer
        System.out.println("karekök "+Math.sqrt(Math.abs(-10)));
        System.out.println("üslü "+Math.pow(2,5));

        System.out.println("Alt yuvarla "+Math.floor(2.7));
        System.out.println("üst yuvarla "+Math.ceil(2.3));
        System.out.println("üst yuvarla "+Math.ceil(2.000001));
        System.out.println("üst yuvarla "+Math.ceil(2.1));
        System.out.println("ortalama yuvarla "+Math.round(2.5));//yukarı yuvarlar
        System.out.println("ortalama yuvarla "+Math.round(2.4));//aşağı yuvarlar

        System.out.println("PI sayısı "+ Math.PI);
        System.out.println("E sayısı "+ Math.E);

        System.out.println("trigonometrik değerler "+ Math.sin(1));




    }
}
