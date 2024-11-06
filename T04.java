// 12S24029 - Adithya Philip Jona Putra Silaban
// 12S24048 - Olivia Tambunan

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] isbn = new String[3];
        int[] jumlah = new int[3];

        jumlah[0] = 0;
        jumlah[1] = 0;
        jumlah[2] = 0;
        double[] price = new double[3];

        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        double[] totalprice = new double[3];

        totalprice[0] = 0;
        totalprice[1] = 0;
        totalprice[2] = 0;
        double totalakhir;
        int x;
        int jumlah0;
        int jumlah1;
        int jumlah2;

        x = 0;
        jumlah0 = 0;
        jumlah1 = 0;
        jumlah2 = 0;
        String book0;
        String book1;
        String book2;

        book0 = "buku";
        book1 = "buku";
        book2 = "buku";
        int zero;
        int one;
        int two;

        zero = 0;
        one = 1;
        two = 2;
        do {
            isbn[x] = input.nextLine();
            if (isbn[x].equals("---")) {
                x = 3;
            } else {
                if (isbn[x].equals(isbn[0])) {
                    if (zero == 0) {
                        book0 = isbn[x];
                    }
                    if (isbn[0].equals(book0)) {
                        x = 0;
                        price[x] = Double.parseDouble(input.nextLine());
                        jumlah[x] = Integer.parseInt(input.nextLine());
                        jumlah0 = jumlah0 + jumlah[x];
                        zero = 3;
                        x = x + 1;
                    } else {
                        if (one == 1) {
                            book1 = isbn[x];
                        }
                        if (isbn[0].equals(book1)) {
                            x = 1;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlah[x] = Integer.parseInt(input.nextLine());
                            jumlah1 = jumlah1 + jumlah[x];
                            zero = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlah[x] = Integer.parseInt(input.nextLine());
                            jumlah2 = jumlah2 + jumlah[x];
                            zero = 3;
                            x = 0;
                        }
                    }
                } else {
                    if (isbn[x].equals(isbn[1])) {
                        if (one == 1) {
                            book1 = isbn[x];
                        }
                        if (isbn[1].equals(book1)) {
                            x = 1;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlah[x] = Integer.parseInt(input.nextLine());
                            jumlah1 = jumlah1 + jumlah[x];
                            one = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlah[x] = Integer.parseInt(input.nextLine());
                            jumlah2 = jumlah2 + jumlah[x];
                            one = 3;
                            x = 0;
                        }
                    } else {
                        if (isbn[x].equals(isbn[2])) {
                            if (two == 2) {
                                book2 = isbn[x];
                            }
                            if (isbn[2].equals(book2)) {
                                x = 2;
                                price[x] = Double.parseDouble(input.nextLine());
                                jumlah[x] = Integer.parseInt(input.nextLine());
                                jumlah2 = jumlah2 + jumlah[x];
                                two = 3;
                                x = 0;
                            }
                        }
                    }
                }
            }
        } while (x < 3);
        if (jumlah0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (jumlah0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (jumlah0 > 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
            totalprice[0] = price[0] * jumlah0;
            if (jumlah1 >= 20) {
                price[1] = price[1] - price[1] * 12 / 100;
            } else {
                if (jumlah1 >= 10) {
                    price[1] = price[1] - price[1] * 5 / 100;
                } else {
                    if (jumlah1 >= 5) {
                        price[1] = price[1] - price[1] * 2 / 100;
                    }
                }
            }
            totalprice[1] = price[1] * jumlah1;
            if (jumlah2 >= 20) {
                price[2] = price[2] - price[2] * 12 / 100;
            } else {
                if (jumlah2 >= 10) {
                    price[2] = price[2] - price[2] * 5 / 100;
                } else {
                    if (jumlah2 >= 5) {
                        price[2] = price[2] - price[2] * 2 / 100;
                    }
                }
            }
            totalprice[2] = price[2] * jumlah2;
            totalakhir = totalprice[0] + totalprice[1] + totalprice[2];
            System.out.println(toFixed(totalakhir,2));
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}



