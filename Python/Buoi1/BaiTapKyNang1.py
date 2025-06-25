
if __name__ == '__main__':
    # Bai 1:
    a = int(input("Nhap a: "))
    b = int(input("Nhap b: "))
    print("Phan nguyen:", a // b)
    print("Phan du:", a % b)

    # Bai 2:
    a, b, c, d = map(int, input("Nhap 4 so cach nhau boi dau cach: ").split())
    print("Trung binh cong:", (a + b + c + d) / 4)

    # Bai 3:
    g, p, s = map(int, input("Nhap gio phut giay: ").split())
    tong = g * 3600 + p * 60 + s
    print("Tong giay:", tong)

    # Bai 4:
    n = int(input("Nhap n co 2 chu so: "))
    a = n // 10
    b = n % 10
    print("Tong:", a + b)

    # 5. Kiem tra n co so chan khong
    print("Co so chan" if (n // 10) % 2 == 0 or (n % 10) % 2 == 0 else "Khong co so chan")

    # 6. Tong > 10?
    print("Tong > 10" if a + b > 10 else "Tong <= 10")

    # 7. Hieu < 0?
    print("Hieu < 0" if a - b < 0 else "Hieu >= 0")

    # 8. Doi xung?
    print("Doi xung" if a == b else "Khong doi xung")

    # 9. So lon nhat
    print("So lon nhat:", max(a, b))

    # 10. Nghich dao
    print("Nghich dao:", b * 10 + a)

    # 11. Tang dan
    print("Tang dan:", min(a, b), max(a, b))

    # 12. Giam dan
    print("Giam dan:", max(a, b), min(a, b))

    # 13. Giai phuong trinh ax + b = 0
    a = float(input("Nhap a: "))
    b = float(input("Nhap b: "))
    if a == 0:
        print("Vo nghiem" if b != 0 else "Vo so nghiem")
    else:
        print("Nghiem x =", -b / a)

