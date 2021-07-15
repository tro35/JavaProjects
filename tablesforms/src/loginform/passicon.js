const visibilityToggle = document.querySelector('.visibility');

const input = document.querySelector('.container-pass input');

var password = true;

visibilityToggle.addEventListener('click', function () {
    if (password) {
        input.setAttribute('type', 'text');
        visibilityToggle.innerHTML = 'visibility';
    } else {
        input.setAttribute('type', 'password');
        visibilityToggle.innerHTML = 'visibility_off';
    }
    password = !password;
})