package lab12;

import java.util.LinkedHashSet;

public class SetOperations {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        String[] names1 = {"Абзалхан", "Нурал", "Олжас", "Блейк", "Нурлан", "Джордан"};
        String[] names2 = {"Георг", "Катя", "Тимур", "Белый", "Гарсия"};

        for (String name : names1) {
            set1.add(name);
        }

        for (String name : names2) {
            set2.add(name);
        }

        LinkedHashSet<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        LinkedHashSet<String> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);

        LinkedHashSet<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
    }
}

