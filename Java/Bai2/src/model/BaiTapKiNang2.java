package model;

public class BaiTapKiNang2 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static String classifyGrade(double dtb) {
        if (dtb >= 8.0 && dtb <= 10.0) return "Giỏi";
        if (dtb >= 6.5) return "Khá";
        if (dtb >= 5.0) return "Trung bình";
        if (dtb >= 3.5) return "Yếu";
        if (dtb >= 0) return "Kém";
        return "Điểm không hợp lệ";
    }

    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) sum += i;
        return sum;
    }

    public static int countOdd(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (i % 2 != 0) count++;
        return count;
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        return count;
    }

    public static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) sum += i;
        return sum;
    }

    public static int countDivisorsGreaterThan5(int n) {
        int count = 0;
        for (int i = 6; i <= n; i++) if (n % i == 0) count++;
        return count;
    }

    public static int countDivisibleBy2Or3(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (i % 2 == 0 || i % 3 == 0) count++;
        return count;
    }

    public static int countDivisibleBy2And3(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (i % 2 == 0 && i % 3 == 0) count++;
        return count;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumEvenDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            if (d % 2 == 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static int sumOddDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            if (d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static int sumDigitsDivisorOf8(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            if (d != 0 && 8 % d == 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static boolean isIncreasing(int n) {
        int last = 10;
        while (n > 0) {
            int d = n % 10;
            if (d > last) return false;
            last = d;
            n /= 10;
        }
        return true;
    }

    public static boolean isDecreasing(int n) {
        int last = -1;
        while (n > 0) {
            int d = n % 10;
            if (d < last) return false;
            last = d;
            n /= 10;
        }
        return true;
    }

    public static int maxDigit(int n) {
        int max = 0;
        while (n != 0) {
            int d = n % 10;
            if (d > max) max = d;
            n /= 10;
        }
        return max;
    }

    public static int reverseDigits(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
