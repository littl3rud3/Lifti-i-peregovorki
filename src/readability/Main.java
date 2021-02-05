package readability;


import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Количество сотрудников
        int t = sc.nextInt(); // Через сколько уйдет n-ый сотрудник
        List<Integer> array = new ArrayList<>(); // Список этажей
        int currentPozition, summa1 = 0, summa2 = 0;
        List<Integer> variants = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        } // Заполнение массива этажами
        int number = sc.nextInt(); //Номер сотрудника, который уйдет через t минут
        int summa = 0; // Количество пройденных этажей
        for (int j = 0; j <= array.size()-1; j++) {
            for (int z = j; z <= array.size()-1; z++) {
                if (z != array.size()-1) {
                    summa += array.get(z + 1) - array.get(z);
                }
                if (Math.abs(array.get(number-1) - array.get(z)) > t) {
                    summa = 0;
                    break;
                } else {
                    if (z < number-1) {
                        List<Integer> copy = new ArrayList<>(array);
                        List<Integer> cop2 = new ArrayList<>(array);
                        copy.remove(z);
                        cop2.remove(z);
                        summa1 += summa;
                        summa2 += summa;
                        currentPozition = z;
                        for (int k = currentPozition; k < copy.size() - 1; ) {
                            summa1 += copy.get(k + 1) - copy.get(k);
                            copy.remove(k);
                        }
                        for (int o = currentPozition; o > 0;o-- ) {
                            summa1 += copy.get(o) - copy.get(o - 1);
                            copy.remove(o);
                        }
                        variants.add(summa1);
                        summa1 = 0;
                        summa = 0;
                        for (int k1 = currentPozition; k1 > 0; k1--) {
                            summa2 += cop2.get(k1) - cop2.get(k1-1);
                            cop2.remove(k1);
                        }
                        for (int o1 = 0; o1 < cop2.size() - 1;) {
                            summa2 += cop2.get(o1+1) - cop2.get(o1);
                            cop2.remove(o1);
                        }
                        variants.add(summa2);
                        summa2 = 0;
                        break;
                    } else if (z == number-1) {
                        List<Integer> copy = new ArrayList<>(array);
                        List<Integer> cop2 = new ArrayList<>(array);
                        currentPozition = z;
                        for (int k = currentPozition; k <copy.size() - 1;) {
                            summa1 += copy.get(k+1) - copy.get(k);
                            copy.remove(k);
                        }
                        for (int o = currentPozition; o > 0; o--) {
                            summa1 += copy.get(o) - copy.get(o - 1);
                            copy.remove(o);
                        }
                        variants.add(summa1);
                        summa1 = 0;
                        for (int k1 = currentPozition; k1 > 0; k1--) {
                            summa2 += cop2.get(k1) - cop2.get(k1 - 1);
                            cop2.remove(k1);
                        }
                        for (int o1 = 0; o1 <cop2.size()-1;) {
                            summa2 += cop2.get(o1+1) - cop2.get(o1);
                            cop2.remove(o1);
                        }
                        variants.add(summa2);
                        summa2 = 0;
                        break;
                    } else {
                        summa = 0;
                        summa += array.get(z) - array.get(z-1);
                        List<Integer> copy = new ArrayList<>(array);
                        List<Integer> cop2 = new ArrayList<>(array);
                        copy.remove(z);
                        cop2.remove(z);
                        summa2 += summa;
                        summa1 += summa;
                        currentPozition = z-1;
                        for (int k = currentPozition; k < copy.size() - 1;) {
                            summa1 += copy.get(k+1) - copy.get(k);
                            copy.remove(k);
                        }
                        for (int o = copy.size()-1; o > 0; o--) {
                            summa1 += copy.get(o) - copy.get(o - 1);
                            copy.remove(o);
                        }
                        variants.add(summa1);
                        summa1 = 0;
                        break;

                    }
                }
            }
        }
        Collections.sort(variants);
        System.out.println(variants.get(0));
    }
}