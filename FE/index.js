document.addEventListener("DOMContentLoaded", () => {
  const observer = new IntersectionObserver((entries) => {
    entries.forEach((entry) => {
      if (entry.isIntersecting) {
        entry.target.classList.add("fade-in");
      }
    });
  });

  document
    .querySelectorAll(".step, .dictation-item, .testimonial-item, .blog-item")
    .forEach((item) => {
      observer.observe(item);
    });
});

// Smooth Scroll for Button
document.querySelector(".btn-main").addEventListener("click", function (e) {
  e.preventDefault();
  document.querySelector(this.getAttribute("href")).scrollIntoView({
    behavior: "smooth",
  });
});

// Parallax Effect for Shapes
window.addEventListener("scroll", function () {
  let scrollPos = window.pageYOffset;

  document
    .querySelectorAll(".intro-shapes .shape")
    .forEach(function (shape, index) {
      let rate = (index + 1) * 0.5;
      shape.style.transform = "translateY(" + scrollPos * rate + "px)";
    });
});
