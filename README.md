# Lab 1 - JUnit Testing

## Giới thiệu

Bài lab xây dựng chương trình Java có vòng lặp và rẽ nhánh, sau đó viết test JUnit để bao phủ các lệnh và các đường đi chính trong chương trình.

## Công nghệ sử dụng

- Java 17
- Maven
- JUnit 5
- GitHub

## Cấu trúc dự án

```text
Lab1DGKD/
├── src/
│   ├── main/java/org/example/NumberAnalyzer.java
│   └── test/java/org/example/NumberAnalyzerTest.java
├── pom.xml
└── README.md
```

## Mô tả chương trình

Lớp `NumberAnalyzer` nhận vào mảng số nguyên và xử lý như sau:

- Trả về `"Danh sách rỗng"` nếu mảng `null` hoặc rỗng.
- Duyệt từng phần tử bằng vòng lặp `for`.
- Phân loại từng số bằng rẽ nhánh `if/else` để đếm số chẵn và số lẻ.
- Tính tổng các phần tử trong mảng.
- Trả về chuỗi kết quả theo 3 trường hợp: tổng dương, tổng âm hoặc tổng bằng 0.

## Các nhánh xử lý chính

| STT | Trường hợp | Kết quả mong đợi |
| --- | --- | --- |
| 1 | Mảng `null` | `"Danh sách rỗng"` |
| 2 | Mảng rỗng | `"Danh sách rỗng"` |
| 3 | Tổng > 0 | `"Tổng dương - Số chẵn: x, Số lẻ: y"` |
| 4 | Tổng < 0 | `"Tổng âm - Số chẵn: x, Số lẻ: y"` |
| 5 | Tổng = 0 | `"Tổng bằng 0 - Số chẵn: x, Số lẻ: y"` |
| 6 | Phần tử chẵn | Tăng biến đếm số chẵn |
| 7 | Phần tử lẻ | Tăng biến đếm số lẻ |

## Các ca kiểm thử JUnit

| STT | Test case | Dữ liệu đầu vào | Mục đích |
| --- | --- | --- | --- |
| 1 | `testEmptyArray` | `{}` | Kiểm tra mảng rỗng |
| 2 | `testNullArray` | `null` | Kiểm tra mảng `null` |
| 3 | `testPositiveSumWithEvenAndOddNumbers` | `{1, 2, 3, 4}` | Kiểm tra tổng dương, có cả chẵn và lẻ |
| 4 | `testNegativeSumWithEvenAndOddNumbers` | `{-1, -2, -3}` | Kiểm tra tổng âm, có cả chẵn và lẻ |
| 5 | `testZeroSumWithEvenAndOddNumbers` | `{-1, 1, 2, -2}` | Kiểm tra tổng bằng 0 |
| 6 | `testOnlyEvenNumbers` | `{2, 4, 6}` | Kiểm tra mảng chỉ có số chẵn |
| 7 | `testOnlyOddNumbers` | `{1, 3, 5}` | Kiểm tra mảng chỉ có số lẻ |

## Cách chạy kiểm thử

Chạy lệnh sau tại thư mục gốc dự án:

```bash
mvn test
```

Nếu toàn bộ test pass, Maven sẽ hiển thị `BUILD SUCCESS`.

## Issue đã thực hiện

1. **Bao phủ tất cả các lệnh trong chương trình**  
   Đã viết các test case để mọi nhánh lệnh quan trọng đều được thực thi.

2. **Bao phủ các đường đi chính trong chương trình**  
   Đã bổ sung test cho các trường hợp mảng rỗng, `null`, tổng dương, tổng âm, tổng bằng 0, mảng toàn số chẵn và toàn số lẻ.

## Kết luận

Sau bài lab, dự án đã đáp ứng yêu cầu về chương trình có vòng lặp/rẽ nhánh và bộ kiểm thử JUnit tương ứng. Đây cũng là nền tảng tốt để quản lý quy trình test và commit code trên GitHub.