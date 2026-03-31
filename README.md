# Selenium Framework

Dự án automation test sử dụng:

- Java
- Maven
- Selenium WebDriver
- TestNG
- Page Object Model (POM)

## Chức năng hiện có

- Kiểm thử đăng nhập website SauceDemo
- Kiểm tra đăng nhập thành công / thất bại
- Thêm sản phẩm vào giỏ hàng
- Kiểm tra số lượng sản phẩm trong giỏ

## Cấu trúc chính

- `src/main/java/framework/base` - BasePage, DriverFactory
- `src/main/java/framework/config` - ConfigReader
- `src/main/java/framework/pages` - Page Objects
- `src/main/java/framework/utils` - ScreenshotUtil
- `src/test/java/framework/base` - BaseTest
- `src/test/java/tests` - Test classes
- `src/test/resources` - file config và testng xml

## Cách chạy local

Chạy toàn bộ test:

```bash
mvn clean test