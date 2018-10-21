package com.sda.sort;

public class Main {

    public static void main(String[] args) {

        int tab[] = {1, 33, 32, 5, 12, 45, 342, -3, 32};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length - 1; i++) {
            int warunek = 0;
            for (int j = 0; j < tab.length - 1; j++) {

                if (tab[j] < tab[j + 1]) {
                    int tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                    warunek=1;
                }
            }
            if(warunek==0){
                break;
            }

            for (int k = 0; k < tab.length; k++) {
                System.out.print(tab[k] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
