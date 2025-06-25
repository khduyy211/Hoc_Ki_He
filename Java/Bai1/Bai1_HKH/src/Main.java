//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Nam quốc sơn hà Nam đé cư");
//        System.out.println("Tuyệt nhiên định mệnh tại thiên hư");
//        System.out.println("Như hà nghịch lỗ lai xâm phạm");
//        System.out.println("Nhữ đẳng thành khan thủ bại thư");
        int a = 10, b = 21;
        System.out.format("So a=%d, So b=%d", a, b);
        System.out.println();
        String s = "Dai hoc cong nghe Sai Gon";
        String s1 = "STU";
        System.out.println(s + " " + s1);

        StringBuilder fullname = new StringBuilder();
        int age = 21;
        String date = "21/01/2004";
        boolean gender = true;

        fullname.append("Lê Nguyễn Khánh Duy");

        if (gender) {
            System.out.format("Full name: %s \n Birthday: %s \n Gender: Nam \n ", fullname, age, gender);
        } else {
            System.out.format("Full name:%s \n Birthday: %s \n  Gender:Nữ", fullname, age, gender);
        }
    }
}