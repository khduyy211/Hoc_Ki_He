import math


def SNT(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True


def SCP(n):
    i = math.sqrt(n)
    return i * i == n


def SHT(n):
    sum = 0
    for i in range(1, int(n), 1):
        if n % i == 0:
            sum += i
    return sum == n


if __name__ == '__main__':
    n = eval(input("Vui long nhap vao 1 so nguyen: "))
    # if SNT(n):
    #     print(n, f" la so nguyen to")
    # else:
    #     print(n, f" khong la so nguyen to")
    # if SCP(n):
    #     print(n, f" la SCP")
    # else:
    #     print(n, f" khong SCP")
    if SHT(n):
        print(n, f" la SHT")
    else:
        print(n, f" khong la SHT")
