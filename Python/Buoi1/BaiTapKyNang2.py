def is_even(number):
    return number % 2 == 0


def is_negative(number):
    return number < 0


def classify_grade(dtb):
    if 8.0 <= dtb <= 10.0:
        return "Giỏi"
    elif 6.5 <= dtb < 8.0:
        return "Khá"
    elif 5.0 <= dtb < 6.5:
        return "Trung bình"
    elif 3.5 <= dtb < 5.0:
        return "Yếu"
    elif 0 <= dtb < 3.5:
        return "Kém"
    else:
        return "Điểm không hợp lệ"


def sum_odd(n):
    return sum(i for i in range(1, n + 1, 2))


def count_odd(n):
    return len([i for i in range(1, n + 1) if i % 2 != 0])


def count_divisors(n):
    return len([i for i in range(1, n + 1) if n % i == 0])


def sum_divisors(n):
    return sum(i for i in range(1, n + 1) if n % i == 0)


def count_divisors_gt_5(n):
    return len([i for i in range(1, n + 1) if n % i == 0 and i > 5])


def count_divisible_by_2_or_3(n):
    return len([i for i in range(1, n + 1) if i % 2 == 0 or i % 3 == 0])


def count_divisible_by_2_and_3(n):
    return len([i for i in range(1, n + 1) if i % 2 == 0 and i % 3 == 0])


def sum_digits(n):
    return sum(int(d) for d in str(n))


def sum_even_digits(n):
    return sum(int(d) for d in str(n) if int(d) % 2 == 0)


def sum_odd_digits(n):
    return sum(int(d) for d in str(n) if int(d) % 2 != 0)


def sum_digits_divisible_by_2(n):
    return sum(int(d) for d in str(n) if int(d) % 2 == 0)


def sum_digits_divisor_of_8(n):
    return sum(int(d) for d in str(n) if int(d) != 0 and 8 % int(d) == 0)


def is_increasing(n):
    s = str(n)
    return all(s[i] <= s[i + 1] for i in range(len(s) - 1))


def is_decreasing(n):
    s = str(n)
    return all(s[i] >= s[i + 1] for i in range(len(s) - 1))


def max_digit(n):
    return max(int(d) for d in str(n))


def sum_local_extrema(n):
    digits = [int(d) for d in str(n)]
    total = 0
    for i in range(1, len(digits) - 1):
        if (digits[i] > digits[i - 1] and digits[i] > digits[i + 1]) or \
                (digits[i] < digits[i - 1] and digits[i] < digits[i + 1]):
            total += digits[i]
    return total


def sum_local_minima(n):
    digits = [int(d) for d in str(n)]
    return sum(digits[i] for i in range(1, len(digits) - 1)
               if digits[i] < digits[i - 1] and digits[i] < digits[i + 1])


def sum_local_maxima(n):
    digits = [int(d) for d in str(n)]
    return sum(digits[i] for i in range(1, len(digits) - 1)
               if digits[i] > digits[i - 1] and digits[i] > digits[i + 1])


def reverse_digits(n):
    return int(str(n)[::-1])



