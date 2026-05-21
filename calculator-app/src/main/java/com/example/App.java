package com.example;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        App calc = new App();
        
        // Dữ liệu tính toán
        int a = 10;
        int b = 5;

        // Bắt đầu tạo file HTML
        try {
            FileWriter writer = new FileWriter("ketqua.html");
            
            // Viết mã HTML & CSS (Sử dụng Bootstrap)
            writer.write("<!DOCTYPE html>\n<html lang='vi'>\n<head>\n");
            writer.write("<meta charset='UTF-8'>\n");
            writer.write("<title>Máy Tính Của Trân</title>\n");
            writer.write("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>\n");
            writer.write("</head>\n<body class='bg-light'>\n");
            
            writer.write("<div class='container mt-5'>\n");
            writer.write("<div class='card shadow'>\n");
            writer.write("<div class='card-header bg-primary text-white'>\n");
            writer.write("<h2 class='text-center mb-0'>KẾT QUẢ THUẬT TOÁN MÁY TÍNH</h2>\n");
            writer.write("</div>\n");
            
            writer.write("<div class='card-body'>\n");
            writer.write("<table class='table table-hover table-bordered text-center'>\n");
            writer.write("<thead class='table-dark'><tr><th>Phép tính</th><th>Công thức</th><th>Kết quả</th></tr></thead>\n");
            writer.write("<tbody>\n");
            
            // Điền kết quả các phép tính vào bảng
            writer.write("<tr><td>Phép cộng</td><td>" + a + " + " + b + "</td><td><b class='text-success'>" + calc.add(a, b) + "</b></td></tr>\n");
            writer.write("<tr><td>Phép trừ</td><td>" + a + " - " + b + "</td><td><b class='text-success'>" + calc.subtract(a, b) + "</b></td></tr>\n");
            writer.write("<tr><td>Phép nhân</td><td>" + a + " * " + b + "</td><td><b class='text-success'>" + calc.multiply(a, b) + "</b></td></tr>\n");
            writer.write("<tr><td>Phép chia</td><td>" + a + " / " + b + "</td><td><b class='text-success'>" + calc.divide(a, b) + "</b></td></tr>\n");
            
            writer.write("</tbody>\n</table>\n");
            writer.write("</div></div></div>\n");
            
            writer.write("</body>\n</html>");
            writer.close();
            
            System.out.println("HOAN TAT! He thong da xuat ket qua ra file 'ketqua.html'.");
            
        } catch (IOException e) {
            System.out.println("Da xay ra loi khi tao file HTML!");
            e.printStackTrace();
        }
    }
}