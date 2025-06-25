from operator import itemgetter


def diemTB(diem):
    # diem = input("Nhap vao diem can xep loai: ")
    if (float(diem) < 3.5):
        print("kem")
    elif (float(diem) < 5 and float(diem) >= 3.5):
        print("yeu")
    elif (float(diem) < 6.5 and float(diem) >= 5):
        print("trung binh")
    elif (float(diem) < 8 and float(diem) >= 6.5):
        print("Kha")
    else:
        print("Gioi")


def checkSo():
    so = input("Nhap vao 1 so nguyen duong: ")
    if int(so) % 2 == 0:
        print(so + " la so chan")
    else:
        print(so + " la so le")


if __name__ == '__main__':
    # name = eval(input("Vui long nhap ten: "))
    # print(name*2)

    # s1 = "%s cu the thoi %s"
    # print(s1 % ("anh em minh", "hehe"))
    #
    # s2 = "Duy"
    # print(f"Ayyo {s2}")
    #
    # s3 = "%s co tuoi la %d"
    # print(s3 % ("khduyy", 21))

    # shopping_list = ["banh mi", "banh gao","banh kem"]
    # shopping_list.append("banh uot")
    # print(shopping_list)
    # del shopping_list[0]
    # print(shopping_list)
    # print(len(shopping_list))

    listSN = [2,3,5,7]
    print(listSN)
    print(f"Gia tri max la: ", max(listSN))