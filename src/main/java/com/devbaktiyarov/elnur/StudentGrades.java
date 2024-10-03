package com.devbaktiyarov.elnur;


// 1.Ученик сдал экзамен. Внесите с консоли оценку ученику по 5-ти бальной системе.
// Программа выдаст свою оценку ученику.

// import java.util.Scanner;

// public class GradeEvaluator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Введите оценку ученика (от 1 до 5): ");
//         int grade = scanner.nextInt();
        
//         switch (grade) {
//             case 5:
//                 System.out.println("Отлично!");
//                 break;
//             case 4:
//                 System.out.println("Хорошо!");
//                 break;
//             case 3:
//                 System.out.println("Удовлетворительно!");
//                 break;
//             case 2:
//                 System.out.println("Плохо!");
//                 break;
//             case 1:
//                 System.out.println("Очень плохо!");
//                 break;
//             default:
//                 System.out.println("Некорректная оценка! Введите оценку от 1 до 5.");
//         }
        
//         scanner.close();
//     }
// }

// 2.Программа выводит цифры от 1 до 10, потом с другой строчки от 10 до 1.
// public class NumberSequence {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//         for (int i = 10; i >= 1; i--) {
//             System.out.print(i + " ");
//         }
//     }
// }

// 3. Программа выводит массивы j и g попарно.
// public class Main {
//     public static void main(String[] args) {
//         int[] j = {1, 2, 3, 4, 5};
//         int[] g = {10, 20, 30, 40, 50};
//         if (j.length != g.length) {
//             System.out.println("Массивы должны быть одинаковой длины.");
//             return;
//         }
//         System.out.println("Вывод массивов попарно:");
//         for (int i = 0; i < j.length; i++) {
//             System.out.println("j[" + i + "] = " + j[i] + ", g[" + i + "] = " + g[i]);
//         }
//     }
// }

// 4. Пользователь вводит оценки студентам, программа выводит сообщение в зависимости от
// оценки.
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Введите оценку для студента " + (i + 1) + ": ");
            int grade = scanner.nextInt();

            if (grade >= 90 && grade <= 100) {
                System.out.println("Оценка: 1");
            } else if (grade >= 80) {
                System.out.println("Оценка: 2");
            } else if (grade >= 70) {
                System.out.println("Оценка: 3");
            } else if (grade >= 60) {
                System.out.println("Оценка: 4");
            } else if (grade >= 0) {
                System.out.println("Оценка: 5");
            } else {
                System.out.println("Некорректная оценка. Оценка должна быть от 0 до 100.");
            }
        }

        scanner.close();
    }
}