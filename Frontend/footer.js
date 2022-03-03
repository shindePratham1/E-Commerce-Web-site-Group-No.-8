const createFooter = () => {
    let footer = document.querySelector('footer');

    footer.innerHTML = `
    <div class="footer-content">
        <img src="img/logo1.png" class="logo" alt="">
        <div class="footer-ul-container">
        <ul class="category">
        <li class="category-title">Mobile</li>
        <li><a href="#" class="footer-link">Samsung Galaxy</a></li>
        <li><a href="#" class="footer-link">OnePlus Nord</a></li>
        <li><a href="#" class="footer-link">iPhone</a></li>
        <li><a href="#" class="footer-link">Vivo</a></li>
         </ul>
         <ul class="category">
         <li class="category-title">Laptop</li>
         <li><a href="#" class="footer-link">Dell</a></li>
         <li><a href="#" class="footer-link">Lenovo Ideapad</a></li>
         <li><a href="#" class="footer-link">HP 15</a></li>
         <li><a href="#" class="footer-link">ANSUS Vivobook</a></li>
     </ul>
     <ul class="category">
                <li class="category-title">Headphone</li>
                <li><a href="#" class="footer-link">Boat-rockerz</a></li>
                <li><a href="#" class="footer-link">JBL-Tune</a></li>
                <li><a href="#" class="footer-link">Sony-WI</a></li>
                <li><a href="#" class="footer-link">Apple-Airpods</a></li>
            </ul>
            <ul class="category">
                <li class="category-title">Bluetooth Speaker</li>
                <li><a href="#" class="footer-link">JBL</a></li>
                <li><a href="#" class="footer-link">Apple</a></li>
                <li><a href="#" class="footer-link">Boat</a></li>
                <li><a href="#" class="footer-link">Honeywell</a></li>
            </ul>
        </div>
    </div>
    <p class="footer-title">about company</p>
    <p class="info">Bringing alive the promise of a ‘Brighter Every Day’ for its customers, Electroworld offers its customers a world-class ambience to shop both in-store and Staged at www.electroworld.com and also allows for a seamless ‘omni-channel’ shopping experience that lets a customer enjoy the best of both the Staged & the offline worlds. </p>
    <p class="info">support emails - help@electroworld.com, customersupport@electroworld.com</p>
    <p class="info">telephone - 180 00 00 001, 180 00 00 002</p>
    <div class="footer-social-container">
        <div>
            <a href="#" class="social-link">terms & services</a>
            <a href="#" class="social-link">privacy page</a>
        </div>
        <div>
            <a href="#" class="social-link">instagram</a>
            <a href="#" class="social-link">facebook</a>
            <a href="#" class="social-link">twitter</a>
        </div>
    </div>
    <p class="footer-credit">ElectroWorld, Best online store</p>
    `;
}

createFooter();