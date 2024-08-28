const loginTabButton = document.getElementById("login-tab-button");
const registerTabButton = document.getElementById("register-tab-button");
const loginForm = document.getElementById("login-form");
const registerForm = document.getElementById("register-form");

loginTabButton.addEventListener("click", () => {
  loginForm.classList.add("active");
  registerForm.classList.remove("active");
  loginTabButton.classList.add("active");
  registerTabButton.classList.remove("active");
});

registerTabButton.addEventListener("click", () => {
  registerForm.classList.add("active");
  loginForm.classList.remove("active");
  registerTabButton.classList.add("active");
  loginTabButton.classList.remove("active");
});
