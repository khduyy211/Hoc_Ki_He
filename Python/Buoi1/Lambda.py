def square(num1):
    return num1**2

if __name__ == '__main__':
    listINT = [1,2,3,4,5,6]
    for i in map(square,listINT):
        print(i)