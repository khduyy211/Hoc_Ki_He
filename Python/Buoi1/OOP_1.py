class Person:
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender

    def getName(self):
        return self.name
    def getAge(self):
        return self.age
    def getGender(self):
        return self.gender

if __name__ == '__main__':
    p1 = Person("Duy",21,"Nam")
    print(p1.getName(), p1.gender())