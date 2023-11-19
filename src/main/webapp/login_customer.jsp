<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <title>Trang Đăng Nhập</title>
    <link rel="stylesheet" type="text/css" href="./style/login.css">
</head>
<body>
    <div class="container" id="container">
        <div class="form-container sign-up">
            <form>
                <h2>Thông tin người dùng</h2>
                <input type="name" placeholder="Name" required>
                <input type="phone" placeholder="Phone" required>
                <input type="email" placeholder="Email" required>
                <input type="address" placeholder="Address" required>
                <h2>Thông tin tài khoản</h2>
                <input type="userName" placeholder="UserName" required>
                <input type="password" placeholder="Password" required>
                <input type="password" placeholder="EnterPassword" required>
                <button>Đăng ký</button>
            </form>
        </div>

        <div class="form-container sign-in">
            <form>

                <h1>Đăng nhập </h1>
                <input type="userName" placeholder="UserName" required>
                <input type="password" placeholder="Password" required>
                <a href="#">Quên mật khẩu?</a>
                <button type="submit">Đăng nhập</button>
            </form>
        </div>

        <div class="toggle-container">
            <div class="toggle">
                <div class="toggle-panel toggle-left">
                    <h1>Xin chào,</h1>
                    <p>Nhập thông tin cá nhân của bạn để sử dụng tất cả các tính năng của trang web</p>
                    <button class="hidden" id="login">Đăng nhập</button>
                </div>
                <div class="toggle-panel toggle-right">
                    <h1>Xin chào, bạn!</h1>
                    <p>Đăng ký với thông tin cá nhân của bạn để sử dụng tất cả các tính năng của trang web</p>
                    <button class="hidden" id="register">Đăng ký</button>
                </div>
            </div>
        </div>
    </div>

    <script src="./scripts/login.js"></script>
</body>
</html>
