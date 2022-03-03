const createNav = () => {
    let nav = document.querySelector('.navbar');

    nav.innerHTML = `
        <div class="nav">
            <img src="img/logo1.png" class="brand-logo" alt="">
            <div class="nav-items">
                <div class="search">
                    <input type="text" class="search-box" placeholder="search brand, product">
                    <button class="search-btn">search</button>
                </div><br><br>
                <a href="#"><img src="img/user.png" alt=""></a><br><br>
                <a href="#"><img src="img/cart.png" alt=""></a>
            </div>
        </div>
        <ul class="links-container">
            <li class="link-item"><a href="#" class="link">home</a></li>
            <li class="link-item"><a href="#" class="link">Mobile</a></li>
            <li class="link-item"><a href="#" class="link">Laptop</a></li>
            <li class="link-item"><a href="#" class="link">Headphone</a></li>
            <li class="link-item"><a href="#" class="link">Bluetooth Speaker</a></li>
        </ul>
    `
}

createNav();