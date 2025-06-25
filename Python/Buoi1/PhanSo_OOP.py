class PhanSo:
    def __init__(self, tuso, mauso):
        self.tuso = tuso
        self.mauso = mauso

    def getTuSo(self):
        return self.tuso

    def getMauSo(self):
        return self.mauso

    def hienThi(self):
        print(f"{self.tuso}/{self.mauso}")


def nhap():
    tuso = eval(input("Vui long nhap tu so: "))
    mauso = eval(input("Vui long nhap mau so: "))
    while mauso == 0:
        print("Mau so phai khac 0")
        mauso = eval(input("Vui long nhap mau so: "))
    return PhanSo(tuso, mauso)


def xuat(ps):
    print("Phân số vừa nhập là: ", end="")
    ps.hienThi()


def nhapDSPS(listps, n):
    while n != 0:
        n = int(input("vui long nhap so luong phan tu mang: "))
        if n <= 0:
            print("Vui long nhap lai")
            continue
    listps = []
    for i in range(0, n):
        print(f"Nhap phan tu thu {i}: ")
        ps = PhanSo(int(input("vui long nhap tu so: ")), int(input("vui long nhap mau so")))
        listps.append(ps)




if __name__ == '__main__':
    # p1 = PhanSo(3,5)
    # print(f"{p1.getTuSo()} / {p1.getMauSo()}")
    listPS = nhapMang()
    ps = nhap()
    xuat(ps)
